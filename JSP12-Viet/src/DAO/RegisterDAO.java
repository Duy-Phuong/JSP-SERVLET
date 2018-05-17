package DAO;

import java.sql.*;

import Bean.Account;

public class RegisterDAO {
	public static boolean InsertAccount(Connection conn, Account acc) {
		PreparedStatement pstm = null;
		String sql = "insert into jspbai9.account(uname,pass) values (?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			String uname = acc.getUname();
			String pass = acc.getPass();
			pstm.setString(1, uname);
			pstm.setString(2, pass);
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
