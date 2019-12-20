package boardmysql;
import java.sql.*;//Connection,PreparedSteatement,Statement, ResultSet
import java.util.*;//Vector,List,ArrayList
import javax.sql.*;//DataSource
import javax.naming.*;//lookup

//DAO : DBó���ϴ� �����Ͻ� ����
public class BoardDAO {
	//����
	Connection con=null;
	PreparedStatement pstmt=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	String sql="";
	
	//�̱��� ��ü���� �� ���̴� . ��? �޸� ���� ȿ�� ������
	private static BoardDAO dao=new BoardDAO();
	
	//����Ʈ ������ private���� ������ ������ �ܺο��� ��ü���� ���ϰ� �Ϸ���
	private BoardDAO(){};
	
	//jsp���� dao��ü��  ����� �޼��带 �����
	public static BoardDAO getDAO(){
		return dao;
	}
	
	//Ŀ�ؼ� ���,�޼���
	private Connection getCon() throws Exception{
		Context ct=new InitialContext();
		DataSource ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		return ds.getConnection();
	}//getCon() end
	
	//-----------------------
	// ����, ��� ���� 
	//-----------------------
	
	public void insertArticle(BoardDTO dto) throws Exception{
		int num=dto.getNum();//0 �̸� ���� , 0 �� �ƴϸ� ���
		int ref=dto.getRef();// ����̸� ���� �Ѿ�´�
		int re_step=dto.getRe_step();//����̸� ���� �Ѿ�´�
		int re_level=dto.getRe_level();//����̸� ���� �Ѿ�´� 
		
		int number=0;//�� �׷� ó���ϱ� ���� ����
		
		try{
			con=getCon();//Ŀ�ؼ� ��� 
			//DB�� �׷� �Լ� : count, max , min, avg
			
			//�ִ� �۹�ȣ ��� 
			pstmt=con.prepareStatement("select max(num) from board");
			rs=pstmt.executeQuery();
			
			if(rs.next()){//���� ���� �ϸ� 
				number=rs.getInt(1)+1;
			}else{
				number=1;//ó���� �̸�  ref=number
			}//else end
			
			if(num != 0){//���
				//��� ���� �ֱ� Ȯ��
				sql="update board set re_step=re_step+1 where ref=? and re_step>?";
				pstmt=con.prepareStatement(sql);
				//?�� ä���
				pstmt.setInt(1, ref);
				pstmt.setInt(2, re_step);
				pstmt.executeUpdate();//���� ���� 
				
				re_step=re_step+1;//�ۼ���
				re_level=re_level+1;//�� ���� = �鿩���� 
			}else{//����
				ref=number;//�� �׷� ��ȣ 
				re_step=0;
				re_level=0;
			}//else -----
			//mysql : NOW() ����� �ú���
			//mysql : curdate() �����
			//Oracle : sysdate
			
			sql="insert into board(writer,email,subject,passwd,reg_date,"+
			"ref,re_step,re_level,content,ip) "+
			"values(?,?,?,?,NOW(),?,?,?,?,?)";
			
			pstmt=con.prepareStatement(sql);//������ ���� ���� 
			//?�� ä��� 
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3,dto.getSubject());
			pstmt.setString(4,dto.getPasswd());
			//��¥
			pstmt.setInt(5, ref);
			pstmt.setInt(6, re_step);
			pstmt.setInt(7, re_level);
			
			pstmt.setString(8, dto.getContent());
			pstmt.setString(9, dto.getIp());
			
			pstmt.executeUpdate();//���� ����
			
			
		}catch(Exception ex1){
			System.out.println("insertArticle() ���� :"+ex1);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(pstmt != null){pstmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex3){}
		}//finally end
	}//insertArticle() end
	
	//-----------------------------------
	// �� ���� 
	//-----------------------------------
	public int getArticleCount() throws Exception{
		int x=0;
		try{
			con=getCon();//Ŀ�ؼ� ��� 
			pstmt=con.prepareStatement("select count(*) from board");
			rs=pstmt.executeQuery();//���� ���� 
			if(rs.next()){
				x=rs.getInt(1);//�� ���� 
			}//if
			
		}catch(Exception ex1){
			System.out.println("getArticleCount() :"+ex1);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(pstmt != null){pstmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex2){}
		}//finally end
		
		return x;
	}//getArticleCount() end
	
	//-----------------------------------
	// ����Ʈ 
	//-----------------------------------
	public List getList(int start, int cnt) throws Exception{
		List<BoardDTO> list=null;//����
		System.out.println("getList");
		try{
		  con=getCon();//Ŀ�ؼ� ��� 
		  sql="select * from board order by ref desc, re_step asc limit ?,?";
		  //                                                            0?���� ?������ŭ 
		  pstmt=con.prepareStatement(sql);//������ ���� ���� 
		  pstmt.setInt(1, start-1);
		  pstmt.setInt(2, cnt);
		  rs=pstmt.executeQuery();//���� ���� 
		  
		  if(rs.next()){//���� ������
			  list=new ArrayList<BoardDTO>();
			  do{
				  BoardDTO dto=new BoardDTO();
				  
				  dto.setNum(rs.getInt("num"));
				  dto.setWriter(rs.getString("writer"));
				  dto.setEmail(rs.getString("email"));
				  
				  dto.setSubject(rs.getString("subject"));
				  dto.setPasswd(rs.getString("passwd"));
				  
				  //dto.setReg_date(rs.getDate("reg_date"));
				  dto.setReg_date(rs.getTimestamp("reg_date"));
				  
				  dto.setReadcount(rs.getInt("readcount"));//��Ƚ��
				  dto.setRef(rs.getInt("ref"));
				  dto.setRe_step(rs.getInt("re_step"));
				  dto.setRe_level(rs.getInt("re_level"));
				  
				  dto.setContent(rs.getString("content"));
				  dto.setIp(rs.getString("ip"));
				  
				  list.add(dto);//dto �� list �ֱ� 
					
			  }while(rs.next());
			  
		  }//if
		  
		}catch(Exception ex1){
			System.out.println("getList() ���� :"+ex1);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(pstmt != null){pstmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex2){}
		}//finally end
		return list;
	}//getList() end
	//-----------------------
	// �� ���� ���� 
	//-----------------------	
	
	public BoardDTO getArticle(int num) throws Exception{
		BoardDTO dto=null;
		try{
			con=getCon();//Ŀ�ؼ� ��� 
		
			//��Ƚ�� ���� 
			sql="update board set readcount=readcount+1 where num=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();//���� ���� 
			
			//�۳��� ���� 
			pstmt=con.prepareStatement("select * from board where num=?");
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();//���� ���� 
			
			if(rs.next()){
				dto=new BoardDTO();//��ü����
				
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setEmail(rs.getString("email"));
				
				dto.setSubject(rs.getString("subject"));
				dto.setPasswd(rs.getString("passwd"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				dto.setReadcount(rs.getInt("readcount"));
				
				dto.setRef(rs.getInt("ref"));
				dto.setRe_step(rs.getInt("re_step"));
				dto.setRe_level(rs.getInt("re_level"));
				
				dto.setContent(rs.getString("content"));
				dto.setIp(rs.getString("ip"));
			}//if
			
		}catch(Exception ex1){
			System.out.println("getArticle() ���� :"+ex1);
		}finally{
			try{
				if(rs != null){rs.close();}
				if(pstmt != null){pstmt.close();}
				if(con != null){con.close();}
			}catch(Exception ex2){}
		}//finally
		
		return dto;
	}//getArticle() end
	// --------------------------------------------------
	// �� ���� ��(updateForm.jsp) ���� ������
	// --------------------------------------------------
	
	public BoardDTO updateGetArticle(int num) throws Exception {
		
		BoardDTO dto = null;
		
		try{
			con = getCon();
			pstmt = con.prepareStatement(" SELECT * FROM board WHERE num = ? ");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				dto = new BoardDTO();
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setEmail(rs.getString("email"));
				
				dto.setSubject(rs.getString("subject"));
				dto.setPasswd(rs.getString("passwd"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				dto.setReadcount(rs.getInt("readcount"));
				
				dto.setRef(rs.getInt("ref"));
				dto.setRe_step(rs.getInt("re_step"));
				dto.setRe_level(rs.getInt("re_level"));
				
				dto.setContent(rs.getString("content"));
				dto.setIp(rs.getString("ip"));
			}
			
		} catch (Exception e){
			System.out.println("updateGetArticle() + " + e);
			e.printStackTrace();
		} finally {
			try{
				if(rs != null){rs.close();}
				if(pstmt != null){pstmt.close();}
				if(con != null){con.close();}
			} catch (Exception e2){				
			}
		} // end of finally
		
		return dto;
		
	}
	// ------------------------------
	// DB �� ����
	// ------------------------------
	
	public int updateArticle(BoardDTO dto) throws Exception {
		String dbPasswd = "";
		int x = -100;
		try{
			con = getCon();
			pstmt = con.prepareStatement(" SELECT passwd FROM board WHERE num = ? ");
			pstmt.setInt(1, dto.getNum());
			rs = pstmt.executeQuery();
			if(rs.next()){
				dbPasswd = rs.getString("passwd");
				if(dbPasswd.equals(dto.getPasswd())){
					// ��ȣ ��ġ �� �� ����
					sql = " UPDATE board SET writer = ?, email = ?, subject = ?, content = ? WHERE num = ? ";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, dto.getWriter());
					pstmt.setString(2, dto.getEmail());
					pstmt.setString(3, dto.getSubject());
					pstmt.setString(4, dto.getContent());
					pstmt.setInt(5, dto.getNum());
					
					x = pstmt.executeUpdate(); // ���� ������ 1
				} else {
					// ��ȣ �� ��ġ
					x = pstmt.executeUpdate(); // ���� ���� �ƴ� �� 0
				}
			}
		} catch (Exception e){
			System.out.println("updateGetArticle() + " + e);
			e.printStackTrace();
		} finally {
			try{
				if(rs != null){rs.close();}
				if(pstmt != null){pstmt.close();}
				if(con != null){con.close();}
			} catch (Exception e2){				
			}
		} // end of finally
		
		return x;
	}
	public int deleteArticle(int num, String passwd) throws Exception{
		
		String dbPasswd = "";
		int x = -100;
		
		try{
			con = getCon();
			pstmt = con.prepareStatement(" SELECT passwd FROM board WHERE num = ? ");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dbPasswd = rs.getString("passwd");
				if(passwd.equals(dbPasswd)){ // ��ȣ ��ġ ��
					pstmt = con.prepareStatement(" DELETE FROM board WHERE num = ? ");
					pstmt.setInt(1, num);
					pstmt.executeUpdate(); // ���� ����
					x = 1;
				}
			}
		} catch(Exception e) {
			System.out.println("deleteArticle() ���� : " + e);
			e.printStackTrace();
		} finally {
			try {
				if(rs != null){rs.close();}
				if(pstmt != null){pstmt.close();}
				if(con != null){con.close();}	
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}// end of finally
		return x;
	}
	
} // class end