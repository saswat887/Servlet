import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/primono")
public class PrimeNo extends HttpServlet{
	public static int prime(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				sum++;
				
		}
		return sum;
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n=Integer.parseInt(req.getParameter("first"));
		int check=prime(n);
		HttpSession session=req.getSession();
		if(check==2)
		{
			session.setAttribute("p", "This is prime no");
			resp.sendRedirect("primeno.jsp");
		}
		else
		{
			session.setAttribute("p", "This is not prime no");
			resp.sendRedirect("primeno.jsp");
		}
		
	}

}
