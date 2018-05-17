package DAO;

import java.sql.*;


import java.util.*;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

import Bean.Emp;

public class QuizDAO {
	public static List<Emp> DisplayEmp(int start, int count, Connection conn) {
		List<Emp> list = null;
		list = new ArrayList<Emp>();
		PreparedStatement pstm = null;
		String sql = "SELECT * FROM jspbai7.emp limit " + (start-1) + ", "+ count + ";";
		//System.out.println("query: " + sql);
		try {
			pstm = conn.prepareStatement(sql);
	

			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				//System.out.println(e.getId() + "  " + e.getName());
				list.add(e);
				
			}
			if(list != null) {
				pstm.close();
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public static int countRow(Connection conn) {
		int count = 0;
		String sql = "SELECT count(*) FROM jspbai7.emp";
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
	

			ResultSet rs = pstm.executeQuery();
			rs.next();
			count = rs.getInt(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	

}
