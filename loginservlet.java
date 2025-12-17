package com.sat.tmf.tktbooking;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet Executed @ LoginServlet");
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ServletConfig sc1 = getServletConfig();
//		String db_pass = sc1.getInitParameter("db_password");
		
		ServletContext sc = getServletContext();
		sc.getInitParameter("db_password");
		
		String uname = request.getParameter("uname");
		
		String password = request.getParameter("password");
		if(uname.equals(password)) {
			//session tracking using Cookies
//			Cookie ck=new Cookie("user_name",uname);//creating cookie object  
//			response.addCookie(ck);
//			Cookie ck1=new Cookie("token","token1");//creating cookie object  
//			response.addCookie(ck1);
			
			//session tracking using session obj
			HttpSession session=request.getSession();  
	        session.setAttribute("loggedInUser",uname);  
			
			//request.setAttribute("loggedInUser", uname);
			RequestDispatcher rd = request.getRequestDispatcher("DashBoardServlet");
			rd.forward(request, response);
		}else {
//			response.getWriter().print("Sorry UserName or Password Error!");  
//			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
//			//rd.forward(request, response);
//			rd.include(request, response); 
//			response.sendRedirect("https://google.com");
			response.sendRedirect("login.html");
		}
	}
	
	@Override
	public void destroy() {
		System.out.println("desctroy @LoginServlet");
		super.destroy();
		
	}

}
