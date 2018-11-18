package com.luban.service;

import com.luban.dao.UserDao;

public class UserServiceImpl implements UserService{

	UserDao dao;
	
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("service");
		dao.query();
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
}
