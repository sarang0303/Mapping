package oneToone_bidirection.Controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneToone_bidirection.dao.PersonDao;
import oneToone_bidirection.dto.AadharCard;
import oneToone_bidirection.dto.Person;

public class mainController {
	public static void main(String[] args) {
		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sarang");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner scanner=new Scanner(System.in);
		AadharCard aadharCard=new AadharCard();
		Person person=new Person();
		PersonDao dao=new PersonDao();
		
		System.out.println("Enter a Choice\n1.Save Person\n2.find person  Details\n3.DeletePerson\n4.update Person");
		int choice=scanner.nextInt();
		
		switch (choice) {
		case 1:
			
			System.out.println("Enter a  name");
			person.setName(scanner.next());
			
			
			System.out.println("Enter a Phone");
			person.setPhone(scanner.nextLong());
			
			System.out.println("Enter a Address");
			person.setAddress(scanner.next());
			
			System.out.println("Enter a Aadhar Details");
			
			System.out.println("Enter  a Name");
			aadharCard.setName(scanner.next());
			
			System.out.println("Enter a address");
			aadharCard.setAddress(scanner.next());
			
			
			aadharCard.setPerson(person);
			
			person.setAadharcard(aadharCard);
			
			dao.savePerson(person);
				
			
			
//			entityTransaction.begin();
//			entityManager.persist(person);
//			entityManager.persist(aadharCard);
//			entityTransaction.commit();
//			
			
			
			
			
			break;
			
		case 2:{
			System.out.println("Enter a ID");
			int id=scanner.nextInt();
			
			
			dao.findPerson(id);
				
				
			}

			break;
			case 3:{
				System.out.println("Enter a ID");
				int id=scanner.nextInt();
				
				dao.deletePersson(id);
				
			}
			
			case 4:{
				System.out.println("Enter a ID");
				int id=scanner.nextInt();
				System.out.println("Update Person");
				System.out.println("Enter a  name");
				person.setName(scanner.next());
				
				
				System.out.println("Enter a Phone");
				person.setPhone(scanner.nextLong());
				
				System.out.println("Enter a Address");
				person.setAddress(scanner.next());
				
				System.out.println("Enter a Upadte Aadhar Details");
				
				System.out.println("Enter  a Name");
				aadharCard.setName(scanner.next());
				
				System.out.println("Enter a address");
				aadharCard.setAddress(scanner.next());
				
				dao.updatePerson(id, person);
			}
		}

		
		
			
		}
	}


