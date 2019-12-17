package boardmysql;

import java.sql.*;
import java.util.*;

import javax.sql.*;
import javax.naming.*;

// DAO : DB처리하는 비즈니스 로직
public class BoardDAO {
	// 변수
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String sql = "";
	
	// 싱글톤 객체 생성
	private static BoardDAO dao = new BoardDAO();
	
	private BoardDAO() {};
	
	// jsp에서 dao객체를 사용할 메서드를 만든다.
	public static BoardDAO getDAO(){
		return dao;
	}
	
	private Connection getCon() throws Exception{
		Context ct = new InitialContext();
		DataSource ds = (DataSource) ct.lookup("java:comp/env/jdbc/mysql");
		return ds.getConnection();
	}
	
	// ----------------------------
	// 원글, 답글 쓰기
	// ----------------------------
	
	public void insertArticle(BoardDTO dto) throws Exception {
		int num = dto.getNum();
		int ref = dto.getRef();
		int re_step = dto.getRe_step();
		int re_level = dto.getRe_level();
		int number = 0; // 글 그룹 처리하기 위한 변수
		
		try {
			con = getCon();
			// DB의 그룹 함수 : COUNT, MAX, MIN, AVG
			
			// 최대 글번호 받기
			pstmt = con.prepareStatement(" SELECT MAX(num) FROM board ");
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				number = rs.getInt(1) + 1;
			} else {
				number = 1; // 처음글 이면
			}
			
			if(num != 0){ // 답글
				// 답글 끼워 넣기.
				sql = " UPDATE board SET re_step = re_step + 1 WHERE ref = ? AND re_step > ? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2, re_step);
				pstmt.executeUpdate();
				re_step++; // 글 순서
				re_level++; // 들여쓰기
			} else { // 원글
				ref = number;
				re_step = 0;
				re_level = 0;
			} // end of else
			// MySQL -> NOW() : 년월일 시분초
			// MySQL -> CURDATE() : 년월일
			// Oracle -> SYSDATE : 년월일 시분초
			sql = " INSERT INTO board(writer, email, subject, passwd, reg_date, ref, re_step, re_level, content, ip) "
					+ " VALUES (?, ?, ?, ?, NOW(), ?, ?, ?, ?, ?) ";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getSubject());
			pstmt.setString(4, dto.getPasswd());
			pstmt.setInt(5, ref);
			pstmt.setInt(6, re_step);
			pstmt.setInt(7, re_level);
			pstmt.setString(8, dto.getContent());
			pstmt.setString(9, dto.getIp());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("innerArticle() 에외 " + e);
		} finally{
			try {
				if(rs != null) {rs.close();}
				if(pstmt != null) {pstmt.close();}
				if(con != null) {con.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}// end of finally try/catch
	} // end of insertArcitlce
	
	// ---------------------------
	// 글갯수
	// ---------------------------
	public int getArticleCount() throws Exception {
		int x = 0;
		try{
			con = getCon();
			pstmt = con.prepareStatement(" SELECT COUNT(*) FROM board ");
			rs = pstmt.executeQuery();
			if(rs.next()){
				x = rs.getInt(1); // 글 갯수
			} // if
			
		} catch (Exception e) {
			System.out.println("getArticleCount()"+ e);
			e.printStackTrace();
		} finally{
			try{
				if(rs != null) {rs.close();}
				if(pstmt != null) {pstmt.close();}
				if(con != null) {con.close();}
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		} // end of finally
		return x;
	} // end of getArticleCount

	// -------------------------------
	// 리스트
	// -------------------------------
	
	public List<BoardDTO> getList(int start, int cnt) throws Exception {
		List<BoardDTO> list = null;
		try{
			con = getCon();
			// LIMIT x, y -> x(0부터임)부터 y개 까지 : Oracle 의 between (rnum쓴 서브쿼리)
			sql = " SELECT * FROM board ORDER BY ref DESC, re_step ASC LIMIT ?, ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start - 1);
			pstmt.setInt(2, cnt);
			rs=pstmt.executeQuery();
			if(rs.next()){
				list = new ArrayList<BoardDTO>();
				do{
					BoardDTO dto = new BoardDTO();
					dto.setNum(rs.getInt("num"));
					dto.setWriter(rs.getString("writer"));
					dto.setEmail(rs.getString("email"));
					
					dto.setSubject(rs.getString("subject"));
					dto.setPasswd(rs.getString("passwd"));
					
//					dto.setReg_date(rs.getDate("reg_date"));
					dto.setReg_date(rs.getTimestamp("reg_date"));
					System.out.println("날짜"+rs.getDate("reg_date"));
					System.out.println("날짜"+rs.getString("reg_date"));
					System.out.println("날짜"+rs.getTimestamp("reg_date"));
					
					dto.setReadCount(rs.getInt("readCount"));
					dto.setRef(rs.getInt("ref"));
					dto.setRe_step(rs.getInt("re_step"));
					dto.setRe_level(rs.getInt("re_level"));
					dto.setContent(rs.getString("content"));
					dto.setIp(rs.getString("ip"));
					
					list.add(dto);
					
				} while(rs.next());
			}
			
		} catch(Exception e){
			System.out.println("getList : " + e);
			e.printStackTrace();
		} finally {
			try{
				if(rs != null) {rs.close();}
				if(pstmt != null) {pstmt.close();}
				if(con != null) {con.close();}
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	} // end of getList()
}
