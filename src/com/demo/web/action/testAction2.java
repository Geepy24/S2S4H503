package com.demo.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.demo.domain.Customer;
import com.demo.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class testAction2 extends ActionSupport implements ModelDriven<User> {

	private User user = new User() ;
	@Override
	public User getModel() {
		return user;
	}
	
	
	@Action(value="test2",results= {@Result(name="success",location="/result.jsp")})
	public String execute() {
		
		System.out.println(user);
		return SUCCESS ;
	}

}
