package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.ICustomerService;

public class test1 {
	/**	
	 * 	����IOC�Ƿ���ʹ��
	 */
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml") ;
		ICustomerService customerService =(ICustomerService) ac.getBean("customerService") ;
		customerService.findAllCustomer() ;
	}
		
		
		
	
	
	
}
