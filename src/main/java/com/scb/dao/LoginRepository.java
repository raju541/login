package com.scb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scb.pojo.LoginPojo;

public interface LoginRepository extends JpaRepository<LoginPojo, Integer>{

}
