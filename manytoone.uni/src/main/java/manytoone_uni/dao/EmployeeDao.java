package manytoone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoone_uni.dto.Company;
import manytoone_uni.dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sarang");
	EntityManager entityManager=	entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void saveEmployee(Employee employee,int company_id) {
		Company company=entityManager.find(Company.class, company_id);
		
		if (company!=null) {
			employee.setCompany(company);
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
			
			
		}else {
			
		}
		
	}
	
	
	public void findEmployee(int id) {
		Employee employee=entityManager.find(Employee.class,id);
		System.out.println(employee);
	}
	
	public void updateEmployee(int id, Employee employee) {
		Employee employee2 = entityManager.find(Employee.class, id);
		if (employee2 != null) {
			employee2.setId(id);
			employee.setCompany(employee2.getCompany());

			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();

		} else {
			System.out.println("ID NoT Found");
		}

	}


}
