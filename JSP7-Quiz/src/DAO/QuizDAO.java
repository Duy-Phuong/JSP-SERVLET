package DAO;

import java.sql.*;


import java.util.*;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

import Bean.IncompleteSentence;

public class QuizDAO {
	public static List<IncompleteSentence> DisplayQuestion(Connection conn) {
		List<IncompleteSentence> list = null;
		list = new ArrayList<IncompleteSentence>();
		PreparedStatement pstm = null;
		String sql = "SELECT * FROM jspbai6.incompletesentence;";
		try {
			pstm = conn.prepareStatement(sql);
	

			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				list.add(new IncompleteSentence( rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
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
	
	
	//tra ve so luong cau hoi
	public static int getCountRow(Connection conn) {
		int count = 0;
		String sql = "select count(*) from  jspbai6.incompletesentence;";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
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
