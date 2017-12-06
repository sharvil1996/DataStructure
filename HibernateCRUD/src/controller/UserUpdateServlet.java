package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));
		String userName = (String) request.getParameter("txtUserName");
		String userCity = (String) request.getParameter("txtUserCity");
		String userEmailId = (String) request.getParameter("txtUserEmailId");
		String userPhoneNumber = (String) request.getParameter("txtUserNo");

		if (new UserDAO().updateUser(userId, userName, userEmailId, userPhoneNumber, userCity)) {
			response.sendRedirect("UserListController");
		} else {
			response.sendRedirect("userEdit.jsp");
		}

	}

}
