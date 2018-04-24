package com.woniuxy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.dao.UserDao;
import com.woniuxy.entities.HouseBookingInfo;
import com.woniuxy.entities.User;
import com.woniuxy.entities.UserInfoChange;
import com.woniuxy.service.UserDaoImp;

@Controller
public class UserController {
	
	@Autowired
	private UserDaoImp userDaoImp;
	
	@RequestMapping("/list")
	public String getBookingInfo(HouseBookingInfo houseBookingInfo){
		houseBookingInfo.setStatus("未处理");
		System.out.println(houseBookingInfo);
		userDaoImp.insertInfo(houseBookingInfo);
		
		return "success";
	}
	
	@RequestMapping("/changeinfo")
	public String changeInfo(){
		return "login";
		
	}
	
	@RequestMapping("/login")
	public String login(User user,Model model,HttpServletRequest request){
		String result = null;
		System.out.println("管理员信息"+user);
		String getpassword = userDaoImp.findUser(user);
		System.out.println("找出的密码为:"+getpassword);
		if(getpassword.equals(user.getPassword())){
			List<HouseBookingInfo> list = userDaoImp.findAll();
			System.out.println(list);
//			model.addAttribute("info", list);
			request.setAttribute("info", list);
			result="userinfo";
		}else{
			result="erro";
		}
		
		return result;
		
		
	}
	
	@RequestMapping("/detail")
	public String getDetail(int id,Model model,User user){
		System.out.println("得到用户id为："+id);
		System.out.println(user);
		HouseBookingInfo findOne = userDaoImp.findOne(id);
		model.addAttribute("info", findOne);
		
		return "detail";
		
	}
	
	
	@RequestMapping("/doit")
	public String doit(int id,Model model,User user){
		System.out.println("得到用户id为："+id);
		System.out.println(user);
		HouseBookingInfo findOne = userDaoImp.findOne(id);
		model.addAttribute("info", findOne);
		return "doit";
		
	}
	@RequestMapping("/updatainfo")
	public String updatainfo(UserInfoChange userInfoChange){
		
		System.out.println("得到修改信息为:"+userInfoChange);
		userDaoImp.updatainfo(userInfoChange);
		return "success";
		
	}
	
	/*@RequestMapping("/return")
	public String returnPage(){
		return "userinfo";
		
	}*/

}
