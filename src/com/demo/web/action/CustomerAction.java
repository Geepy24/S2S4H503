package com.demo.web.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.demo.domain.Customer;
import com.demo.service.ICustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 *	 客户的动作类
 * @author Huangjiping
 *
 */
@ParentPackage("struts-default")
@Namespace("/customer")
@Results({
	@Result(name="addUICustomer",type="dispatcher",location="/jsp/customer/add.jsp"),
	@Result(name="findAllCustomer",type="dispatcher",location="/jsp/customer/list.jsp")
})
@Action
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	//模型驱动
	private Customer customer = new Customer() ;
	private List<Customer> customers ;
	@Resource(name="customerService")
	private ICustomerService customerService ;
	
//	
//	//得到应用域
//	ServletContext sc = ServletActionContext.getServletContext() ;
//	//得到Spring容器
//	ApplicationContext ac =  WebApplicationContextUtils.getWebApplicationContext(sc) ;
//	
//	private ICustomerService customerService = (ICustomerService) ac.getBean("customerService") ;
//	//但是此时没有容器，要在web中配置监听器，在action中从应用域中取出容器，再取出bean
//	
	
	
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	//customers的getter and setter,struts会自动把customers放入值栈
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public Customer getModel() {
		return customer ;
	}
	
	
	
	//获取添加用户的界面
	@Action("addUICustomer")
	public String addUICustomer() {
		return "addUICustomer" ;
	}
	
	
	
	//获取用户列表
	@Action("findAllCustomer")
		public String findAllCustomer() {
			//调用客户层查询客户列表
			customers = customerService.findAllCustomer() ;
			 
			return "findAllCustomer" ;
		}
}
