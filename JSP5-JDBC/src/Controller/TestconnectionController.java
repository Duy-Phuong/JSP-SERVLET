package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Account;
import DAO.RegisterDAO;
import DB.DBConnection;

import java.sql.*;
import java.util.List;

@WebServlet("/TestconnectionController")
public class TestconnectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TestconnectionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.createConnection();
		PrintWriter out = response.getWriter();
		
		
		List<Account> list= null;
		list = RegisterDAO.DisplayAccount(conn);
		if(list != null) {
			request.setAttribute("myregister", " success!");
			request.setAttribute("listaccount", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/TestConnection.jsp");
			rd.forward(request, response);
			try {
				conn.close(); //dk thanh cong ms dongs conn k la k dk dk nua
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			request.setAttribute("myregister", " failed!");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/TestConnection.jsp");
			rd.forward(request, response);
			
		}
//		if(conn != null) {
//			out.println("<h1>Success " + acc.getUname() + " " + acc.getPass()+"</h1>"); //check
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}else {
//			out.println("<h1>Failed</h1>");
//		}
	}

}
