package com.sat.tmf.tktbooking;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Cookie ck=new Cookie("user_name","");//deleting value of cookie  
//		ck.setMaxAge(5);;//changing the maximum age to 0 seconds  
//		response.addCookie(ck);
		
//		Cookie ck[]=request.getCookies();  
//		for(int i=0;i<ck.length;i++){  
//			System.out.println(ck[i].getName()+" "+ck[i].getValue());
//			
////			response.getWriter().print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
//		}  
		
		HttpSession session = request.getSession();
		session.getAttribute("loggedInUser");
		session.invalidate();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
