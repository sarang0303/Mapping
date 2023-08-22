package manytomany_uni.controller;

import java.util.Scanner;

import manytomany_uni.dao.CourseoDao;
import manytomany_uni.dao.StudentDao;
import manytomany_uni.dto.Course;
import manytomany_uni.dto.Student;

public class MainScannerController {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Course course=new Course();
		CourseoDao courseoDao=new CourseoDao();
		Student student=new Student();
		StudentDao dao=new StudentDao();
		
		System.out.println("Press 1.Course Interface 2.Student Interface");
		int choice=scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Enter a Choice\n1.save course");
			int key=scanner.nextInt();
			switch (key) {
			case 1:{
				System.out.println("Enter a Course Name");
				course.setName(scanner.next());
				
				System.out.println("Enter a Fees");
				course.setFee(scanner.nextDouble());
				
				System.out.println("Enter a Duration");
				course.setDuration(scanner.nextDouble());
				
				courseoDao.insertCourse(course);
			}
				
				break;

			default:
				break;
			}
		case 2:{
			System.out.println("Enter a Choice\n1.save Student");
			int key1=scanner.nextInt();
			switch (key1) {
			case 1:
				System.out.println("How many coures you join");
				int size=scanner.nextInt();
				for (int i = 0; i < size; i++) {
					
					
				}
				System.out.println("Enter a Name");
				student.setName(scanner.next());
				
				System.out.println("Enter a Phone");
				student.setPhone(size);
				
				System.out.println("Enter a Address");
				student.setAddress(scanner.next());
				
				break;

			default:
				break;
			}
			
			
		}
			
			
			
			break;

		default:
			break;
		}
	}

}
