<%@page import="bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		UserBean userBean = (UserBean) request.getAttribute("user");
	%>
	<form action="UserUpdateServlet">
		<input type="hidden" name="userId" value="<%=userBean.getUserId()%>">
		<h3>Enter Details</h3>
		<table border="1">
			<tr>
				<td>Enter User Name</td>
				<td><input type="text" name="txtUserName"
					value="<%=userBean.getUserName()%>" /></td>
			</tr>
			<tr>
				<td>Enter Email Id</td>
				<td><input type="text" name="txtUserEmailId"
					value="<%=userBean.getUserEmailId()%>" /></td>
			</tr>
			<tr>
				<td>Enter User Phone Number</td>
				<td><input type="text" name="txtUserNo"
					value="<%=userBean.getUserPhoneNumber()%>" /></td>
			</tr>
			<tr>
				<td>Enter User City</td>
				<td><input type="text" name="txtUserCity"
					value="<%=userBean.getCity().getCityName()%>" /></td>
			</tr>
			<tr>
				<td>Submit</td>
				<td><input type="submit" name="submit" value="Submit" /></td>
			</tr>
		</table>

	</form>
</body>
</html>