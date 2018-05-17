package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Emp;
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
		
		//khi lan dau ta an vao link <a href="TestConnectionForward?pageid=1>
		String pageidsrt = request.getParameter("pageid");
		//System.out.println(pageidsrt);
		//ep kieu ve int
		int pageid =  Integer.parseInt(pageidsrt);
		int count = 7;
		
		Connection conn = DBConnection.createConnection();
		List<Emp> list= null;
		//pageid == 1 không làm
		if(pageid == 1) {
			
			list = QuizDAO.DisplayEmp(1, count, conn);
			
		}else {
			pageid = pageid - 1;
			pageid = pageid * count + 1;
			list = QuizDAO.DisplayEmp((Integer.parseInt(pageidsrt)-1)*count + 1, count, conn);
			
		}
		
		
		int sumRow = QuizDAO.countRow(conn);
		int maxpageid = (sumRow/count) + 1;
		request.setAttribute("maxpageid", maxpageid);
		
		//System.out.println(list.get(0).getId() + " = = " + list.get(0).getName());
		request.setAttribute("listemp", list);
		request.setAttribute("stt", Integer.parseInt(pageidsrt));//
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/View/Home.jsp");
		rd.forward(request, response);
		try {
			conn.close(); //dk thanh cong ms dongs conn k la k dk dk nua
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
