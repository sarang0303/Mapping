package bidirection_oneTomany.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bidirection_oneTomany.dto.College;
import bidirection_oneTomany.dto.Student;

public class MainController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		College college = new College();

		System.out.println("Enter a Choice\n1.Save Details");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:

			System.out.println("Enter a Colloge Details");
			System.out.println("Enter a Colloge Name");
			college.setName(scanner.next());

			System.out.println("Enter a Fees");
			college.setFees(scanner.nextLong());

			System.out.println("Enter a Location");
			college.setLocation(scanner.next());

			System.out.println("Enter Student Details");
			System.out.println("Enter a Name");
			student.setName(scanner.next());

			

			System.out.println("Enter a address");
			student.setAddress(scanner.next());
			System.out.println("Enter a PHone");
			student.setPhone(scanner.nextLong());
			List<Student> list = new ArrayList<Student>();
			list.add(student);
			college.setStudents(list);

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sarang");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			entityManager.persist(student);
//			entityManager.persist(college);
			entityTransaction.commit();

			break;

		default:
			break;
		}
	}

}
