<h1>Welcome to Jsp Programming</h1>
<br>
	<%
	
	out.println("Welcome to Scriptlet tag");

	%>	

	<%! String s="I have been initalsed using declatrion tag"; %>


	<jsp:declaration> int a=100;</jsp:declaration>
<br>
	<%
	out.println("Print the Value using scriptlet"+s);
	%>	

<br>	
	<font color=red><%=s%>	
<br>
<jsp:expression>a</jsp:expression>
	
	