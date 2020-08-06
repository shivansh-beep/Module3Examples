
<%@page import="java.sql.*,java.io.;" %>
<%@page import="java.util.*;"  %>

<%

session.getAttribute("aaa");
ArrayList al=new ArrayList();

Connection c=null;		
Statement st=null;



try {
Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

try {
c = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxcbatch2","root","admin");

} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


try {
st = c.createStatement();
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

try {
st.executeUpdate("insert into webdemo values(100,'shravya')");

} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}







%>