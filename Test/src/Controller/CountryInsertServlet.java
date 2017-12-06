package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Country;
import DAO.CountryDAO;

public class CountryInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String countryName = request.getParameter("txtCountryName");
		Country country = new Country();
		country.setCountryId("1");
		country.setCountryName(countryName);
		System.out.println(countryName);
		if (new CountryDAO().addcountry("Hi"))
			response.sendRedirect("CountryListServlet");
		else
			response.sendRedirect("countryInsert.jsp");
	}

}
