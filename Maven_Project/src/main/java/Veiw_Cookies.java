import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view")
public class Veiw_Cookies extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] a=req.getCookies();
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		for (Cookie cookie : a) {
			out.println("<h1>"+cookie.getName()+":"+cookie.getValue()+"</h1>");
		}
	}
}
