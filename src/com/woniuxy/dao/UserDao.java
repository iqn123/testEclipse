package com.woniuxy.dao;

import java.util.List;

import com.woniuxy.entities.HouseBookingInfo;
import com.woniuxy.entities.User;
import com.woniuxy.entities.UserInfoChange;

public interface UserDao {
	public void insertInfo(HouseBookingInfo houseBookingInfo);
	public String findUser(User user);
	public List<HouseBookingInfo> findAll();
	public HouseBookingInfo findOne(int id);
	public void updatainfo(UserInfoChange userInfoChange);
}
