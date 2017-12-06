package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.CityBean;
import dao.UserDAO;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = (String) request.getParameter("txtUserName");
		String userCity = (String) request.getParameter("txtUserCity");
		String userEmailId = (String) request.getParameter("txtUserEmailId");
		String userPhoneNumber = (String) request.getParameter("txtUserNo");

		System.out.println(userCity);
		
		CityBean bean = new CityBean();
		bean.setCityId(Integer.parseInt(userCity));

		if (new UserDAO().addUserDetails(userName, userEmailId, userPhoneNumber, bean))
			response.sendRedirect("UserListController");
		else
			response.sendRedirect("userInsert.jsp");

	}

}
