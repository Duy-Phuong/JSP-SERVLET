package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.AnswerUser;
import Bean.IncompleteSentence;
import DAO.QuizDAO;

import DB.DBConnection;

import java.sql.*;
import java.util.ArrayList;
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
		int countRow = QuizDAO.getCountRow(conn);
		
		List<IncompleteSentence> listCorrectAnswer = QuizDAO.DisplayQuestion(conn);
		List<AnswerUser> listAnswerUser = new ArrayList<AnswerUser>();
		for(int i=1; i <= countRow; i++) {
			String answeruser = request.getParameter("ans[" + i + "]");
			if(answeruser != null) {
			AnswerUser au = new AnswerUser();
			au.setNumber(i);
			au.setAnswer(answeruser);
			listAnswerUser.add(au);
			System.out.println(i + " ==== " + answeruser + " =dap an " + listCorrectAnswer.get(i-1).getCorrectanswer());
			System.out.println(au.getNumber() + " ==== " + au.getAnswer());
			}else {
				request.setAttribute("msg", "Ban phai dien het cac cau hoi!!");
				List<IncompleteSentence> list= null;
				list = QuizDAO.DisplayQuestion(conn);
				
					
					request.setAttribute("listradio", list);
					
					RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Quiz.jsp");
					rd.forward(request, response);
			}
		}
		request.setAttribute("listCorrectAnswer", listCorrectAnswer);
		request.setAttribute("listAnswerUser", listAnswerUser);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Result.jsp");
		rd.forward(request, response);
	}

}
