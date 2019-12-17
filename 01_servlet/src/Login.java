import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 전역 변수
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/mydb"; // db
																			// 주소
	private static final String USER = "root";
	private static final String PWD = "12345";

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// 오버라이딩
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=UTF-8");
		// response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter(); // 응답을 위한 아웃객체 생성
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String db_pwd = "";

		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} // end of Check Driver catch

		try {
			con = DriverManager.getConnection(URL, USER, PWD); // DB 연결
			System.out.println("DB연결 성공");
			stmt = con.createStatement();// Statement 생성
			rs = stmt.executeQuery("SELECT pwd FROM member1 WHERE id = '" + id + "'");
			if (rs.next()) {
				db_pwd = rs.getString("pwd");
			} // end of if(rs.next)

			if (db_pwd.equals(pwd)) {
				// 일치하면 로그인 성공
				out.println("<html><body>");
				out.println("<meta http-equiv=refresh content=\'2;url=/01_servlet/html1/home.jsp\'");
				out.println("<font color=blue size=5>");
				out.println(id + "님 저희 사이트를 방문해주셔서 감사합니다.");
				out.println("</font>");
				out.println("</body></html>");

				out.close();
				rs.close();
				stmt.close();
				con.close();
			} else {
				System.out.println("ID 및 Passwrord가 틀렸습니다.확인 후 재시도");
				out.println("<html><body>");
				out.println("<meta http-equiv=refresh content=\'2;url=/01_servlet/html1/login.html\'");
				out.println("<font color=red size=5>");
				out.println("id 또는 패스워드가 틀렸습니다. 확인 후 재시도 해주세요.");
				out.println("</font>");
				out.println("</body></html>");

				out.close();
				rs.close();
				stmt.close();
				con.close();
			}
		} catch (SQLException se) {

			System.out.println("DB연결 실패");
			se.printStackTrace();
		}
	}// end of doPost()

} // end of class
