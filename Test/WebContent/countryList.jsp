<%@page import="CRUD.Bean.Country"%>
<%@page import="java.util.ArrayList"%>
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
		ArrayList<Country> list = (ArrayList<Country>) request.getAttribute("countryBean");
		if (list != null) {
	%>
	<table border="1" width="50%" align="center">
		<tr>
			<td align="center"><b>Country ID</b></td>
			<td align="center"><b>Country Name</b></td>
			<td align="center"><b>Delete</b></td>
			<td align="center"><b>Edit</b></td>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
					Country countryBean = list.get(i);
		%>
		<tr>
			<td align="center"><%=countryBean.getCountryId()%></td>
			<td align="center"><%=countryBean.getCountryName()%></td>
			<td align="center"><a
				href="UserDeleteServlet?userId=<%=countryBean.getCountryId()%>">Delete</a></td>
			<td align="center"><a
				href="UserEditServlet?userId=<%=countryBean.getCountryId()%>">Edit</a></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		} else {
	%>
	<h3>No Users Present</h3>
	<%
		}
	%>
</body>
</html>