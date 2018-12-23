package com.demo.dao;

import java.util.List;

import com.demo.domain.Customer;

public interface ICustomerDao {
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
