package manytomany_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import manytomany_uni.dto.Course;


public class MainCache {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sarang");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.find(Course.class, 2);
		entityManager.find(Course.class, 2);
		
EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		
		entityManager2.find(Course.class, 2);
		entityManager2.find(Course.class, 2);
	}

}
