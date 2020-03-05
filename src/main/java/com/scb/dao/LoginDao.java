package com.scb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scb.pojo.LoginPojo;
@Repository
public class LoginDao {
	@Autowired
	LoginRepository loginrepository;
	public  Boolean  loginaction(String uname, String pwd) {
		List<LoginPojo> list= loginrepository.findAll();
		Boolean status=false;
		
		for (LoginPojo loginpojo : list) {
			if(loginpojo.getUname().equals(uname)&&loginpojo.getPwd().equals(pwd)) {
				
				status=true;
			}
		}
		return status;
	}
}
