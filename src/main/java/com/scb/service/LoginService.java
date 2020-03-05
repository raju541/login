package com.scb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.dao.LoginDao;
@Service
public class LoginService {
	@Autowired
	LoginDao logindao=null;
	public Boolean loginaction(String uname, String pwd) {
		Boolean status=logindao.loginaction(uname,pwd);
	
		return status;
	}
}
