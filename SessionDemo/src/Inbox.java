import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Inbox
 */
@WebServlet("/email")
public class Inbox extends HttpServlet {
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//String name=request.getParameter("user");
			
/*			HttpSession ses=request.getSession();
			
			String data=(String)ses.getAttribute("myname");
			
			
			response.getWriter().println("Welcome:"+data);
			
*/			

			
			Cookie ck[]=request.getCookies();
			
			response.getWriter().println("Cookie size:"+ck.length);
			
// Lets print the values in cookies
			
			
			for(Cookie c:ck)
			{
			
response.getWriter().println("Name:"+c.getName() +"Value:"+c.getValue()  );
			}







		}
		
}

