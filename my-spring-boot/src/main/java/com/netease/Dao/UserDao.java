package com.netease.Dao;

import java.util.ArrayList;
import java.util.List;

import com.netease.User.User;

public class UserDao {
	
	public static List<User> getUser() {
		String[] names = {"mengxing" , "lihaotian" , "yujiayi" ,"sunrui"};
		List<User> list = new ArrayList<User>();
		for (int i=0;i<=3;i++) {
			User user = new User(names[i], i);
			list.add(user);
		}
		
		return list;
		
	}
	

}
