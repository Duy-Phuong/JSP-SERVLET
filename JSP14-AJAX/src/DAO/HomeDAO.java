package DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;


import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import BEAN.User;



public class HomeDAO {
	public static void ImportExcel(HttpServletRequest request, HttpServletResponse response, Connection conn) throws ServletException, IOException {
		
		InputStream inp;
		try {
			inp = new FileInputStream("C:\\Users\\admin1\\eclipse-workspace\\JSP11-EXCEL\\User.xls");
			HSSFWorkbook wb;
			
			wb = new HSSFWorkbook(new POIFSFileSystem(inp));
			 Sheet sheet = wb.getSheetAt(0); //ss: 0 là sheet 1
			 //trỏ vào từng hàng
			
			 for(int i = 1; i <= sheet.getLastRowNum(); i++) {
				 Row row = sheet.getRow(i); // tro vao tung hang
				 
				 int stt =  (int) row.getCell(0).getNumericCellValue();
				 String name = row.getCell(1).getStringCellValue();
				 int pass =  (int) row.getCell(2).getNumericCellValue();
				 
				 User user = new User(stt, name, pass);
				 HomeDAO.Insert(request, user, conn);
				 wb.close();
			 }
			   
		} catch (FileNotFoundException e) {
			 request.setAttribute("msg", e.getMessage());
		}
	     catch (IOException e) {
	    	 request.setAttribute("msg", e.getMessage());
		}
	  
		RequestDispatcher rd = request.getRequestDispatcher("View/Result.jsp");
		rd.forward(request, response);
	}
	
	public static void Insert(HttpServletRequest request,User user, Connection conn) {
		String sql = "insert into account(stt,name, pass) values (?,?,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, user.getStt());
			pstm.setString(2, user.getName());
			pstm.setInt(3, user.getPass());
			int i = pstm.executeUpdate();
			if(i != 0) {
				 request.setAttribute("msg", "insert success");
			}else {
				 request.setAttribute("msg", "insert failed");
				 
			}
			pstm.close();
		} catch (SQLException e) {
			 request.setAttribute("msg", e.getMessage());
		}
	}
	

}
