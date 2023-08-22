package manytoone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoone_uni.dto.Company;

public class CompanyDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sarang");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	
	public void saveCompany(Company company) {

		
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();

	}
	
	public void findcompany(int id) {
		Company company=entityManager.find(Company.class, id);
		System.out.println(company);
		
		
	}

}
