package DAO;

import java.sql.*;

import Bean.Account;
import java.util.*;

public class RegisterDAO {
	public static List<Account> DisplayAccount(Connection conn) {
		List<Account> list = null;
		list = new ArrayList<Account>();
		PreparedStatement pstm = null;
		String sql = "select * from jspbai4.account";
		try {
			pstm = conn.prepareStatement(sql);
	

			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				list.add(new Account(rs.getString(1), rs.getString(2)));
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
}
