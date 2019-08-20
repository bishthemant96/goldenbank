package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.EmployeeEntity;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	EntityManager em;
	
	public EmployeeEntity createEmployee(EmployeeEntity employee) {
		em.persist(employee);
		return employee;
	}

	public EmployeeEntity readEmployee(EmployeeEntity employee) {
		EmployeeEntity reEmployee = em.find(EmployeeEntity.class, employee.getEmpID() ); //Replace 1 with getID function.
		return reEmployee;
	}

	public EmployeeEntity updateEmployee(EmployeeEntity employee) {
		EmployeeEntity reEmployee = em.find(EmployeeEntity.class, employee.getEmpID()); //Replace 1 with getID function
		
	    reEmployee.setEmpName(employee.getEmpName());
	    reEmployee.setEmpBranch(employee.getEmpBranch());
	    reEmployee.setEmpPost(employee.getEmpPost());
	    reEmployee.setEmpAge(employee.getEmpAge());
	    reEmployee.setEmpNo(employee.getEmpNo());
	    reEmployee.setEmpEmail(employee.getEmpEmail());
	    
		return reEmployee;
	}

	public EmployeeEntity deleteEmployee(EmployeeEntity employee) {
		EmployeeEntity reEmployee = em.find(EmployeeEntity.class, employee.getEmpID()); //Replace 1 with getID function
		em.remove(reEmployee);
		return employee;
	}

	public List<EmployeeEntity> displayAllEmployee() {
		List<?> temp = em.createQuery("Select e from Employee e").getResultList();
		List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>(temp.size());
		
		for(Object obj: temp)
			employeeList.add(((EmployeeEntity)obj));	

		return employeeList;
	}

}
