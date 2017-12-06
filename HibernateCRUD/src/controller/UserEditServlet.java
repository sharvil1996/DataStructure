package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.UserDAO;

public class UserEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = (String) request.getParameter("userId");
		UserBean bean = new UserDAO().getByPK(userId);

		if (bean != null) {
			System.out.println("Hi");
			request.setAttribute("user", bean);
			request.getRequestDispatcher("userEdit.jsp").forward(request, response);
		}
	}

}
