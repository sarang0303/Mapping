
package manytomany_uni.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany_uni.dao.CourseoDao;
import manytomany_uni.dao.StudentDao;
import manytomany_uni.dto.Course;
import manytomany_uni.dto.Student;

public class MainController {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Course course1 = new Course();
		course1.setName("SQL");
		course1.setFee(10000);
		course1.setDuration(2);

		Course course2 = new Course();
		course2.setName("JAVA");
		course2.setFee(18000);
		course2.setDuration(7);

		Course course3 = new Course();
		course3.setName("MT");
		course3.setFee(15000);
		course3.setDuration(1.5);

		Student student1 = new Student();
		student1.setName("John");
		student1.setPhone(789456123);
		student1.setAddress("USA");

		Student student2 = new Student();
		student2.setName("Rio");
		student2.setPhone(789456123);
		student2.setAddress("AMT");

		Student student3 = new Student();
		student3.setName("Tokio");
		student3.setPhone(789456123);
		student3.setAddress("USA");

//		
//		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sarang");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		
//		entityTransaction.begin();
//		entityManager.persist(course1);
//		entityManager.persist(course2);
//		entityManager.persist(course3);
//		
//		entityManager.persist(student1);
//		entityManager.persist(student2);
//		entityManager.persist(student3);
//		entityTransaction.commit();
//		

		StudentDao dao = new StudentDao();
//		dao.insertStudent(student1);
//		dao.insertStudent(student2);
//		dao.insertStudent(student3);
	

//		CourseoDao courseoDao = new CourseoDao();
//		courseoDao.insertCourse(course1);
//		courseoDao.insertCourse(course2);
//		courseoDao.insertCourse(course3);
//
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//
//		dao.saveStudent(student1, list);
//
//		dao.saveStudent(student3, list);
//
//		List<Integer> list1 = new ArrayList<Integer>();
//		list1.add(1);
//
//		list1.add(3);
//		dao.saveStudent(student2, list1);

		

		
		Student student=new Student();
		


		System.out.println("Enter the choice\n1.Find student \n2.Find all Student\n3.Delete Student\n4.Update Student Details\n6.Update aadhar");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:{
//			find Student
			
			System.out.println("Enter a id");
			int id=scanner.nextInt();
			
			dao.findStudent(id);
			
		}
			
			break;
			case 2:{
//				Find all Student
				
				dao.findAllStudent();
				
				break;
			}
			case 3:{
//				Delete Student
				System.out.println("Enter a ID");
				int id=scanner.nextInt();
				
				dao.deleteStudent(id);
				break;
				
			}
			case 4:{
//				update student
				
				System.out.println("Enter a ID");
				int id=scanner.nextInt();
				
				System.out.println("Update name");
				student.setName(scanner.next());
				
				System.out.println("Update Address");
				student.setAddress(scanner.next());
				
				System.out.println("Enter a Phone");
				student.setPhone(scanner.nextLong());
				
				dao.updateStudent(id, student);
				

				
			}

		default:
			break;
		}


	}
	
	

	
	    
	
	

}
