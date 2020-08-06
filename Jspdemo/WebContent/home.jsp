<h2>Welcome !!!!</h2>

<%

out.println(request.getParameter("user"));


try
{
	int x=10/0;	
}catch(Exception e)
{
	out.println(e.getMessage());
	
}

out.println("Going Forward");






%>