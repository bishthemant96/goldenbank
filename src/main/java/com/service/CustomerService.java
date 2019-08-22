package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.entity.CustomerEntity;
import com.model.CustomerModel;

@Transactional
@Service
public class CustomerService {

	@Autowired
	CustomerDao cDao;

	public CustomerModel createCustomer(CustomerModel customerModel) {
		customerModel.setStatus(false);
		CustomerEntity customer = new CustomerEntity();
		BeanUtils.copyProperties(customerModel, customer);
		try {
			customer = cDao.createCustomer(customer);
			BeanUtils.copyProperties(customer, customerModel);
			customerModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Error occured while Adding customer...");
		}
		return customerModel;
	}

	public CustomerModel deleteCustomer(CustomerModel customerModel) {
		customerModel.setStatus(false);
		CustomerEntity customer = new CustomerEntity();
		BeanUtils.copyProperties(customerModel, customer);
		try {
			customer = cDao.deleteCustomer(customer);
			BeanUtils.copyProperties(customer, customerModel);
			customerModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Error occured while deleting customer...");
		}
		return customerModel;

	}

	public CustomerModel updateCustomer(CustomerModel customerModel) {
		customerModel.setStatus(false);
		
		CustomerEntity cEntity = new CustomerEntity();
		cEntity.setCusID(customerModel.getCusID());
		try {  
			cEntity = cDao.readCustomer(cEntity);
			if (cEntity == null) {
				System.out.println("No customer exists for this customerID...");
			} else {
		    BeanUtils.copyProperties(customerModel, cEntity);
		try {
			cEntity= cDao.updateCustomer(cEntity);
           BeanUtils.copyProperties(cEntity, customerModel);
           customerModel.setStatus(true);
		} catch (Exception e) {
           System.out.println("Error occured while updating..." +e );
		}
		}
	}catch(Exception e) {
	}
		return customerModel;
	}

	public CustomerModel readCustomer(CustomerModel customerModel) {
		customerModel.setStatus(false);
		CustomerEntity customer = new CustomerEntity();
		BeanUtils.copyProperties(customerModel, customer);
		try {
			customer = cDao.readCustomer(customer);
			BeanUtils.copyProperties(customer, customerModel);
			customerModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Error occured while reading customer information...");
		}
		return customerModel;

	}
}
