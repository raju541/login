package com.scb.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "mail")
public class LoginPojo {
		private int id;
		private String uname,pwd;
		
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
		@GenericGenerator(name = "native",strategy = "native")
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Column(name="username")
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		@Column(name="password")
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
}
