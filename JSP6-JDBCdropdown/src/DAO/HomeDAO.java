package DAO;

import java.sql.*;

import Bean.Province;
import Bean.Student;

import java.util.*;

public class HomeDAO {
	public static List<Province> DisplayAccount(Connection conn) {
		List<Province> list = null;
		list = new ArrayList<Province>();
		PreparedStatement pstm = null;
		String sql = "select * from jspbai5.province";
		try {
			pstm = conn.prepareStatement(sql);
	

			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				list.add(new Province(rs.getInt(1), rs.getString(2)));
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
	


	public static boolean InsertStudent(Connection conn, Student stt) {
		PreparedStatement pstm = null;
		String sql = "insert into jspbai5.student(studentname,provinceid) values (?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			String studentname = stt.getStudentname();
			int provinceid = stt.getProvinceid();
			pstm.setString(1, studentname);
			pstm.setInt(2, provinceid);
			int kt = pstm.executeUpdate();
			if(kt != 0) {
				pstm.close();
				return true;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
