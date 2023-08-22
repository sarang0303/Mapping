package onetoone_uni.controller;

import java.util.Scanner;

import onetoone_uni.dao.AadharCardDao;
import onetoone_uni.dao.PersonDao;
import onetoone_uni.dto.AadharCard;
import onetoone_uni.dto.Person;

public class MainController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PersonDao dao = new PersonDao();
		AadharCardDao cardDao = new AadharCardDao();
		AadharCard aadharCard = new AadharCard();
		Person person = new Person();

		System.out.println("Enter the choice\n1.Enter Details\n2.Find Person \n3.Find all Person\n4.Delete Person\n5.Update Details\n6.Update aadhar");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Enter a AddharCard Details :");
			System.out.println("Enter a AadharCard ID");
			aadharCard.setId(scanner.nextInt());

			System.out.println("Enter a AadharCard Name");
			aadharCard.setName(scanner.next());

			System.out.println("Enter a AadharCard Address");
			aadharCard.setAddress(scanner.next());

			System.out.println("Enter a Person Details:");

			System.out.println("Enter a ID");
			person.setId(scanner.nextInt());

			System.out.println("Enter a name");
			person.setName(scanner.next());

			System.out.println("Enter a Phone");
			person.setPhone(scanner.nextLong());

			System.out.println("Enter a Address");
			person.setAddress(scanner.next());

			person.setAddharcard(aadharCard);

			dao.savePerson(person);
			break;
		}

		case 2: {
			
			
			
			
			System.out.println("ENter a id");
			int id = scanner.nextInt();
			dao.findPerson(id);
			break;
		}

		case 3: {
			dao.findAll();
		}
		case 4: {
			System.out.println("Enter A id");
			int id = scanner.nextInt();
			dao.deletePerson(id);
		}
		case 5: {
			System.out.println("Enter the choice\n1.Update Person\n2.Update AAdhar Card");
			int key = scanner.nextInt();

			switch (key) {
			
			case 1:
			System.out.println("Enter a ID");
			int id=scanner.nextInt();
			
			System.out.println("Update name");
			person.setName(scanner.next());
			
			System.out.println("Update Address");
			person.setAddress(scanner.next());
			
			System.out.println("Enter a Phone");
			person.setPhone(scanner.nextLong());
			dao.updatePerson(id, person);
						
			case 2:
				System.out.println("Enter a AID");
				int id1 =scanner.nextInt();
				System.out.println("Update Aadhar card name");
				aadharCard.setName(scanner.next());
				
				System.out.println("Update address");
				aadharCard.setAddress(scanner.next());
				
				
				
				cardDao.updateAaddhar(id1, aadharCard);
				
				break;

			default:
				break;
			}
		}
		case 6:{
			System.out.println("Enter a Id");
			int id=scanner.nextInt();

			System.out.println("Enter a name");
			person.setName(scanner.next());

			System.out.println("Enter a Phone");
			person.setPhone(scanner.nextLong());

			System.out.println("Enter a Address");
			person.setAddress(scanner.next());
			
			System.out.println("Enter a AadharCard ID");
			aadharCard.setId(scanner.nextInt());

			System.out.println("Enter a AadharCard Name");
			aadharCard.setName(scanner.next());

			System.out.println("Enter a AadharCard Address");
			aadharCard.setAddress(scanner.next());
			
//			dao.updatePesonAadhar(id, id);
		}

		default:
			break;

		}

//		
//		

	}

}
