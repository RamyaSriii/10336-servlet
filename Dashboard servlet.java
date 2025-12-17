package com.sat.tmf.tktbooking;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class DashBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DashBoardServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext sc1 = getServletContext();
		System.out.println(sc1.getInitParameter("db_password"));
		
		HttpSession session = request.getSession();

		String htmlStr = "<html>\r\n"
				+ "<body>\r\n"
				+ "<h1>Welcome! "+session.getAttribute("loggedInUser")+"</h1>\r\n"
				+ "<h2> This is your dashboard page </h2>\r\n"
				+ "<form action = '/MovieTktBooking/LogoutServlet'>\r\n"
				+ "<input type=\"submit\"  value=\"Logout\" />"
				+ "</form>"
				+ "</body>\r\n"
				+ "</html>";
		response.getWriter().append(htmlStr);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
