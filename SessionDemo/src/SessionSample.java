

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionSample
 */
@WebServlet("/sdemo")
public class SessionSample extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession ses=request.getSession();
		if(ses.isNew())
		{
			response.getWriter().println("Session is New Session");
			response.getWriter().println("Ur sesion id:"+ses.getId());
			
			
			
			response.getWriter().println(ses.getLastAccessedTime());
			
			response.getWriter().println(ses.getMaxInactiveInterval());
			
			ses.setMaxInactiveInterval(10000);
			
			
		}
		
		
		else
		{
			response.getWriter().println("Session is old Session");
			
		ses.invalidate();
			response.getWriter().println("now sesion id:"+ses.getId());
		
		}
			
		
		
		
	}

}
