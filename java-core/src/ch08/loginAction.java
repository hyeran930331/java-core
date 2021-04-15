package ch08;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;
/**
 * Servlet implementation class loginAction
 */
@WebServlet("/loginAction")
public class loginAction extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		boolean save = false;
		if(request.getParameter("save")!=null) {
			save = true;
		}
		
		if(id.equals("admin")==false || pw.equals("1234")==false) {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		
		if (save) {
			Cookie idCookie = new Cookie("id", id);
			idCookie.setMaxAge(60*60*24);//초단위
			response.addCookie(idCookie);
			
		}
		response.sendRedirect(request.getContextPath()+"/ch08/success.jsp");
	}

}
