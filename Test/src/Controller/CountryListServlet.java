package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Country;
import DAO.CountryDAO;

public class CountryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CountryDAO dao = new CountryDAO();
		ArrayList<Country> bean = (ArrayList<Country>) dao.listCountry();
		request.setAttribute("countryBean", bean);
		request.getRequestDispatcher("countryList.jsp").forward(request, response);
	}

}
