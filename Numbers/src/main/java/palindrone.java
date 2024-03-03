import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/pallindrone")
public class palindrone extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n=Integer.parseInt(req.getParameter("first"));
		int check=pallindrone(n);
		System.out.println(check);
		HttpSession session=req.getSession();
		if(check==n)
		{
			
			session.setAttribute("p", "This is pallindrone no");
			resp.sendRedirect("palindrone.jsp");
		}
		else
		{
			
			session.setAttribute("p", "This is not pallindrone no");
			resp.sendRedirect("palindrone.jsp");
		}
	}

	public static int pallindrone(int n) {
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev+r;
			n=n/10;
		}
		return rev;
	}
}
