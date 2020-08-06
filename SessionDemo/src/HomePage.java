

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/home")
public class HomePage extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		String name=request.getParameter("user");
		response.getWriter().println("Welcome:"+name);
		
	/*	HttpSession ses=request.getSession();
		ses.setAttribute("myname",name);
		
		response.setContentType("text/html");
		
	*/	
		response.setContentType("text/html");
		Cookie c= new Cookie("uname",name);// creating a cookie
		
		response.addCookie(c);// send this cookie has response to the client and store them in client machine
		
		
		
response.getWriter().println("<form action=http://localhost:8989/SessionDemo/email>");
response.getWriter().println("<input type=submit value=NextPage>");
response.getWriter().println("</form>");

		
		
		
		
		
		}

}
