package manytomany_uni.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytomany_uni.dto.Course;
import manytomany_uni.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sarang");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
//	
//	public void insertStudent( Student student) {
//		entityTransaction.begin();
//		List<Course>list =student.getCourses();
//		for (Course course:list) {
//			entityManager.persist(course);
//		}
//		entityManager.persist(student);
//		
//		entityTransaction.commit();
//		
//		
//	}
	
	
	public void saveStudent(Student student,List<Integer> ids) {
		
		entityTransaction.begin();
		List<Course> list=new ArrayList<Course>();
		
		for(Integer integer:ids) {
			Course course=entityManager.find(Course.class, integer);
			list.add(course);
		}
		student.setCourses(list);
		entityManager.persist(student);
		entityTransaction.commit();
				
		
		
	}
	
	public void findStudent(int id) {
	Student student=	entityManager.find(Student.class, id);
	
	System.out.println(student);
	}
	
	public void findAllStudent() {
		
		Query query= entityManager.createQuery("SELECT s FROM Student s");
	List<Student> list=	query.getResultList();
	System.out.println(list);
		
	}
	
	public void updateStudent(int id,Student student) {
		Student student2=entityManager.find(Student.class, id);
		if (student2!=null) {
			student.setId(id);
			student.setCourses(student2.getCourses());
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			
		}
		else {
			System.out.println("ID NOT Found");
		}
	}
	
	public void deleteStudent(int id) {
		Student student=entityManager.find(Student.class, id);
		
		if (student!=null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			
			CourseoDao dao=new CourseoDao();
			dao.deleteCourse(id);
			System.out.println("Delete Succefully");
			
		}
		else {
			System.out.println("ID not Found");
		}
		
	}

}
