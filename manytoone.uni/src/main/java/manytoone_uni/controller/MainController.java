package manytoone_uni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoone_uni.dao.CompanyDao;
import manytoone_uni.dao.EmployeeDao;
import manytoone_uni.dto.Company;
import manytoone_uni.dto.Employee;


public class MainController {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
//		Company company=new Company();
//		company.setId(101);
//		company.setName("Infosys");
//		company.setLocation("Pune");
//		company.setGst("abc");
//		
//		Employee employee1=new Employee();
//		employee1.setId(6);
//		employee1.setName("Sarang");
//		employee1.setPhone(1234567890);
//		employee1.setAddress("pune");
//		employee1.setCompany(company);
		
//		Employee employee2=new Employee();
//		employee2.setId(5);
//		employee2.setName("Sarang");
//		employee2.setPhone(1234567890);
//		employee2.setAddress("pune");
//		employee2.setCompany(company);
		
//		Employee employee3=new Employee();
//		employee3.setId(4);
//		employee3.setName("Sarang");
//		employee3.setPhone(1234567890);
//		employee3.setAddress("pune");
//  	employee3.setCompany(company);
		
		
		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sarang");
//	EntityManager entityManager=	entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	entityManager.persist(company1);
//	entityManager.persist(employee1);
//	entityManager.persist(employee2);
//	entityManager.persist(employee3);
//	
//	entityTransaction.commit();
		Company company=new Company();
		Employee employee=new Employee();
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.saveCompany(company);
//	
	EmployeeDao dao=new EmployeeDao();
	
	
//	dao.saveEmployee(employee3, 101);
//	dao.saveEmployee(employee2, 101);
//	dao.saveEmployee(employee1, 101);

//	System.out.println("Enter a ID");
//	int id=scanner.nextInt();
//	dao.findEmployee(id);
//	
//    dao.findEmployee(id);	
	System.out.println("Enter a ID");
	int id=scanner.nextInt();
	
	System.out.println("Update name");
	employee.setName(scanner.next());
	
	System.out.println("Update Address");
	employee.setAddress(scanner.next());
	
	System.out.println("Enter a Phone");
	employee.setPhone(scanner.nextLong());
	dao.updateEmployee(id, employee);
	
	System.out.println("Enter a id");
	company.setId(scanner.nextInt());
	
	System.out.println("Enter a Name");
	company.setName(scanner.next());
	
	System.out.println("Enter a Location");
	company.setLocation(scanner.next());
	
	System.out.println("Enter a GST");
	company.setGst(scanner.next());
	
	
	
	}

}
