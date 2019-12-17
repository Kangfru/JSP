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
	// ���� ����
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/mydb"; // db
																			// �ּ�
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
	// �������̵�
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=UTF-8");
		// response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter(); // ������ ���� �ƿ���ü ����
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String db_pwd = "";

		try {
			Class.forName(DRIVER);
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
			System.out.println("����̹� �ε� ����");
		} // end of Check Driver catch

		try {
			con = DriverManager.getConnection(URL, USER, PWD); // DB ����
			System.out.println("DB���� ����");
			stmt = con.createStatement();// Statement ����
			rs = stmt.executeQuery("SELECT pwd FROM member1 WHERE id = '" + id + "'");
			if (rs.next()) {
				db_pwd = rs.getString("pwd");
			} // end of if(rs.next)

			if (db_pwd.equals(pwd)) {
				// ��ġ�ϸ� �α��� ����
				out.println("<html><body>");
				out.println("<meta http-equiv=refresh content=\'2;url=/01_servlet/html1/home.jsp\'");
				out.println("<font color=blue size=5>");
				out.println(id + "�� ���� ����Ʈ�� �湮���ּż� �����մϴ�.");
				out.println("</font>");
				out.println("</body></html>");

				out.close();
				rs.close();
				stmt.close();
				con.close();
			} else {
				System.out.println("ID �� Passwrord�� Ʋ�Ƚ��ϴ�.Ȯ�� �� ��õ�");
				out.println("<html><body>");
				out.println("<meta http-equiv=refresh content=\'2;url=/01_servlet/html1/login.html\'");
				out.println("<font color=red size=5>");
				out.println("id �Ǵ� �н����尡 Ʋ�Ƚ��ϴ�. Ȯ�� �� ��õ� ���ּ���.");
				out.println("</font>");
				out.println("</body></html>");

				out.close();
				rs.close();
				stmt.close();
				con.close();
			}
		} catch (SQLException se) {

			System.out.println("DB���� ����");
			se.printStackTrace();
		}
	}// end of doPost()

} // end of class
