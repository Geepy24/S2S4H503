package com.demo.service;

import java.util.List;

import com.demo.domain.Customer;

public interface ICustomerService {

	/**
	 * ��ѯ���пͻ�
	 * @return
	 */
	List<Customer> findAllCustomer();
	
	/**
	 * ����ͻ�
	 * @param customer
	 */
	void saveCustomer(Customer customer);
	
	
}
