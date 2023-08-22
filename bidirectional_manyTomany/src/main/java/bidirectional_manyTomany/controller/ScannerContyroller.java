//package bidirectional_manyTomany.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//import bidirectional_manyTomany.dto.Language;
//import bidirectional_manyTomany.dto.Person;
//
//public class ScannerContyroller {
//	public static void main(String[] args) {
//		Language language=new Language();
//		Person person=new Person();
//		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter a Language Name");
//		language.setName(scanner.next());
//		
//		System.out.println("Enter A Language Origin");
//		language.setOrigin(scanner.next());
//	
//		System.out.println("Enter a Person");
//		
//		System.out.println("Enter a Person Name");
//		person.setName(scanner.next());
//		
//		System.out.println("Enter a Phone");
//		person.setPhone(scanner.nextLong());
//		
//		System.out.println("Enter a Address");
//		person.setAddress(scanner.next());
//		
//		List<Language>list=new ArrayList<Language>();
//		list.add(language);
//		language.setPersons();
//		
//		List<Person>list2=new ArrayList<Person>();
//		list2.add(person);
//		person.setLanguages(list);
//		
//
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sarang");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		
//		entityTransaction.begin();
//		entityManager.persist(language);
//		entityManager.persist(person);
//		
//		entityTransaction.commit();
//		
//				
//	}
//
//}
