import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class MemberInput
 */
@WebServlet("/MemberInput")
public class MemberInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/mydb";
	private static final String USER = "root";
	private static final String PASSWORD = "12345";
	
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		// post 요청 한글처리
		request.setCharacterEncoding("UTF-8");
	
		PrintWriter out = response.getWriter();
		
		// 클라이언트가 보내준 데이터 받기
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		
		String db_pwd =""; // db에서 가져온 암호 넣을 변수
		try{
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException cnf){
			System.out.println("드라이버 로딩 실패");
			cnf.printStackTrace();
		} // end of catch
		
		try{
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			stmt=con.createStatement();
			rs=stmt.executeQuery("SELECT pwd FROM member1 WHERE id ='"+id+"'");
			
			if(rs.next()){
				db_pwd=rs.getString("pwd");
			}
			
			if(db_pwd=="") { // 신규가입 가능
				String sql = "INSERT INTO member1 VALUES(?, ?, ?, ?, ?, ?)";
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				pstmt.setString(3, name);
				pstmt.setString(4, email);
				pstmt.setString(5, tel);
				pstmt.setString(6, addr);

				pstmt.executeUpdate(); // 실행

				out.println("<html><body>");
				out.println("<meta http-equiv=refresh content=\'2;url=/01_servlet/html1/login.html\'>");
				out.println("<font color=blue size=5>"+id+"님 회원가입을 축하합니다!</font>");
				out.println("</body></html>");
				rs.close();
				stmt.close();
				pstmt.close();
				con.close();
				out.close();
				
			} else { // 이미 존재하는 아이디
				out.println("<html><body>");
				out.println("<meta http-equiv=refresh content=\'2;url=/01_servlet/html1/MemberForm.html\'>");
				out.println("<font color=blue size=5>"+id+"는 이미 사용중입니다.</font>");
				out.println("</body></html>");
				rs.close();
				stmt.close();
				pstmt.close();
				con.close();
				out.close();
			}
			
		} catch(SQLException se){
			System.out.println("DB 연결 실패");
			se.printStackTrace();
		}
		
	} // end of doPost

}
