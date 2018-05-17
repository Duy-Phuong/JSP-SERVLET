package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.IncompleteSentence;
import DAO.QuizDAO;
import DB.DBConnection;


@WebServlet("/TestConnectionForward")
public class TestConnectionForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TestConnectionForward() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.createConnection();
		
		
		
		List<IncompleteSentence> list= null;
		list = QuizDAO.DisplayQuestion(conn);
		if(list != null) {
			
			request.setAttribute("listradio", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Quiz.jsp");
			rd.forward(request, response);
		}else {
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Quiz.jsp");
			rd.forward(request, response);
			try {
				conn.close(); //dk thanh cong ms dongs conn k la k dk dk nua
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
