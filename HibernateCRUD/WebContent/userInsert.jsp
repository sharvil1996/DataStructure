<%@page import="bean.CityBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.CityDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserController">
		<h3>Enter Details</h3>
		<table border="1">
			<tr>
				<td>Enter User Name</td>
				<td><input type="text" name="txtUserName" value="" /></td>
			</tr>
			<tr>
				<td>Enter Email Id</td>
				<td><input type="text" name="txtUserEmailId" value="" /></td>
			</tr>
			<tr>
				<td>Enter User Phone Number</td>
				<td><input type="text" name="txtUserNo" value="" /></td>
			</tr>
			<tr>
				<td>Select City</td>
				<td><select name="txtUserCity">
						<option value="0">Select City</option>
						<%
							CityDAO cityDAO = new CityDAO();
							ArrayList<CityBean> cityList = (ArrayList<CityBean>) cityDAO.listCity();
							for (int i = 0; i < cityList.size(); i++) {
								String tmp = "unselected";
								String type = request.getParameter("txtUserCity");
								if (type == null)
									tmp = "unselected";
								else if (cityList.get(i).getCityId() == Integer.parseInt(type))
									tmp = "selected";
						%>

						<option value=<%=cityList.get(i).getCityId()%> <%=tmp%>>
							<%=cityList.get(i).getCityName()%></option>
						<%
							}
						%>
				</select></td>
			</tr>
			<tr>
				<td>Submit</td>
				<td><input type="submit" name="submit" value="Submit" /></td>
			</tr>
		</table>

	</form>
</body>
</html>