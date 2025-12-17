<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="java.util.*" %>  
<%@ page import="com.sat.tmf.tktbooking.model.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%
	List<User> userList = new ArrayList<User>();
	User u1 = new User(1,"SAT","Nav","98798798","satya@gmail.com");
	User u2 = new User(2,"RAM","ha","79874535","ram@gmail.com");
	User u3 = new User(3,"LEE","hue","6435244352","lee@gmail.com");
	User u4 = new User(4,"MAT","Klay","545264235","mat@gmail.com");
	User u5 = new User(5,"CAT","Kee","85425245","cat@gmail.com");
	userList.add(u1);
	userList.add(u2);
	userList.add(u3);
	userList.add(u4);
	userList.add(u5);
	
%>

<body>
	<div>
		<form action="" method="post">
			<table>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="fname" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lname" /></td>
				</tr>
				<tr>
					<td>Phone No:</td>
					<td><input type="text" name="phNo" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td><button>RESET</button></td>
					<td><input type="submit" Value="ADD" /></td>
				</tr>
			</table>
		</form>
	</div>
<br>
<br>
	<div>
		<table border='1px'>
			<tr>
				<th>Name</th>
				<th>Contact No</th>
				<th>Email</th>
			</tr>
			<%
			System.out.println("userList size:"+userList.size());
			
			for(User u:userList){
			%>
				<tr>
					<td><%out.write(u.getFirstName());%> <%=u.getLastName() %> </td>
					<td><%out.write(u.getPhNo());%> </td>
					<td><%=u.getEmail()%> </td>
				</tr>
			<%
			}
			%>
			<!-- 
			<tr>
				<td>SATYA N</td>
				<td>987987908</td>
				<td>satya@gmail.com</td>
			</tr>
			 -->
			
		</table>
	</div>
</body>
</html>
