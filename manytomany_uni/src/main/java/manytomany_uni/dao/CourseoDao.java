package manytomany_uni.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytomany_uni.dto.Course;

public class CourseoDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sarang");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insertCourse(Course course) {
		entityTransaction.begin();
		entityManager.persist(course);
		entityTransaction.commit();

	}

	public void deleteCourse(int id) {
		Course course = entityManager.find(Course.class, id);
		if (course != null) {
			entityTransaction.begin();
			entityManager.refresh(course);
			entityTransaction.commit();

		}

	}

	public void displayCourse() {
		Query query = entityManager.createQuery("SELECT c FROM Course c");
		List<Course> courses = query.getResultList();
		System.out.println(courses);

	}
}
