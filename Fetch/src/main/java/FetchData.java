import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/display")
public class FetchData extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			PreparedStatement pst=con.prepareStatement("select * from user");
			ResultSet rst=pst.executeQuery();
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.println("<html>\r\n"
					+ "    <body>\r\n"
					+ "        <table border='2px'>\r\n"
					+ "            <tr>\r\n"
					+ "                <th>Name</th>\r\n"
					+ "                <th>Age</th>\r\n"
					+ "                <th>Mobile</th>\r\n"
					+ "                <th>Email</th>\r\n"
					+ "                <th>Password</th>\r\n"
					+ "            </tr>");
			while(rst.next())
			{
				out.println(" <tr>\r\n"
						+ "                <td>"+rst.getString("name")+"</td>\r\n"
						+ "                <td>"+rst.getInt("age")+"</td>\r\n"
						+ "                <td>"+rst.getLong("mobile")+"</td>\r\n"
						+ "                <td>"+rst.getString("email")+"</td>\r\n"
						+ "                <td>"+rst.getString("password")+"</td>\r\n"
						+ "            </tr>");
			
			}
			out.println(" </table>\r\n"
					+ "    </body>\r\n"
					+ "</html>");
		/*	if(rst.next())
			{
				System.out.println(rst.getString("name"));
				System.out.println(rst.getInt("age"));
				System.out.println(rst.getLong("mobile"));
				System.out.println(rst.getString("email"));
				System.out.println(rst.getString("password"));
			}*/
			pst.close();
			rst.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
