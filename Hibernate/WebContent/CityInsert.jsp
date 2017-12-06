<%@page import="dao.StateDAO"%>
<%@page import="bean.StateBean"%>
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
	<form action="CityInsertServlet" method="post">

		<br /> Select State <select name="selectState">
			<option>Select State</option>
			<%
				ArrayList<StateBean> beans = (ArrayList<StateBean>) new StateDAO().listState();
				for (StateBean s : beans) {
			%>
			<option value="<%=s.getStateId()%>"><%=s.getStateName()%></option>
			<%
				}
			%>
		</select><br /> <br /> Enter City Name <input type="text" name="txtCityName">
		<br /> <br />
		<input type="submit">
	</form>
</body>
</html>