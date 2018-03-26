package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.User;
import DAO.LoginDAO;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		User users =  new User();
		users.setName(name);
		users.setPassword(pass);
		
		boolean kt = LoginDAO.Check(name, pass);
		if(kt == true) {
		
			HttpSession session = request.getSession(true);
			session.setAttribute("sessionname", name);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("msg", "Login Failed");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Login.jsp");
			rd.forward(request, response);
		}
		
	}

}
