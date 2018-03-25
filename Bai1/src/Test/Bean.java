package Test;

import java.util.*;

public class Bean {
	public static List<Users> ExportUsers() {
		List<Users> list = new ArrayList<Users>();
		list.add(new Users("Nam", "12"));
		list.add(new Users("Mai", "12"));
		return list;
	}
	
}
