import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class deletecookies extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies=req.getCookies();
		cookies[0].setMaxAge(0);
		resp.addCookie(cookies[0]);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h2>Cookies deleted</h2>");
	}
}
