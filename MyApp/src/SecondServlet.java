

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
/*		
		ServletConfig sc=getServletConfig();
		String str=(String)sc.getInitParameter("acno");
		response.getWriter().println(" The value is:"+str);
*/
		
		ServletContext sc=getServletContext();
		//String str=sc.getInitParameter("heading");
	
	int a=Integer.parseInt(sc.getInitParameter("heading"));
	
	response.getWriter().println(" The value is:"+a *4);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
