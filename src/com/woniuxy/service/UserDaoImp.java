package com.woniuxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.dao.UserDao;
import com.woniuxy.entities.HouseBookingInfo;
import com.woniuxy.entities.User;
import com.woniuxy.entities.UserInfoChange;

@Service
public class UserDaoImp implements UserDao {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void insertInfo(HouseBookingInfo houseBookingInfo) {
		// TODO Auto-generated method stub
		userDao.insertInfo(houseBookingInfo);
		
	}

	@Override
	public String findUser(User user) {
		// TODO Auto-generated method stub
		
		return userDao.findUser(user);
	}

	@Override
	public List<HouseBookingInfo> findAll() {
		return userDao.findAll();
		// TODO Auto-generated method stub
		
	}

	@Override
	public HouseBookingInfo findOne(int id) {
		// TODO Auto-generated method stub
		return userDao.findOne(id);
	}

	@Override
	public void updatainfo(UserInfoChange userInfoChange) {
		// TODO Auto-generated method stub
		userDao.updatainfo(userInfoChange);
	}
	
	
	
}
