package com.duyphuong;

import java.util.*;

public class Bean {
		public static List<User> createList(){
			List<User> list = new ArrayList<User>();
			list.add(new User("An", "1"));
			list.add(new User("Bn", "2"));
			return list;
			
			
		}
}
