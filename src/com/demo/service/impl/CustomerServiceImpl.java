package com.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.ICustomerDao;
import com.demo.domain.Customer;
import com.demo.service.ICustomerService;
@Service("customerService")
@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
public class CustomerServiceImpl implements ICustomerService {
	
	@Resource(name="customerDao")
	private ICustomerDao customerDao;
	

	@Transactional(readOnly=true,propagation=Propagation.SUPPORTS)
	@Override
	public List<Customer> findAllCustomer() {
		return customerDao.findAllCustomer();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}
	
	
}
