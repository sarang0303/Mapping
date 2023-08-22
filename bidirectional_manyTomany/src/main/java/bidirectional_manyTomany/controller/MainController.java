package bidirectional_manyTomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bidirectional_manyTomany.dto.Language;
import bidirectional_manyTomany.dto.Person;

public class MainController {
	public static void main(String[] args) {
		Language language1 = new Language();
		language1.setName("Marathi");
		language1.setOrigin("Mahareshtra");

		Language language2 = new Language();
		language2.setName("Panjabi");
		language2.setOrigin("Panjab");

		Language language3 = new Language();
		language3.setName("Tamil");
		language3.setOrigin("Karnataka");

		Person person1 = new Person();
		person1.setName("Sarang");
		person1.setAddress("AMT");
		person1.setPhone(983453641);

		Person person2 = new Person();
		person2.setName("Rio");
		person2.setAddress("pune");
		person2.setPhone(983453641);

		Person person3 = new Person();
		person3.setName("Tokiyo");
		person3.setAddress("Mum");
		person3.setPhone(983453641);

		List<Language> list1 = new ArrayList<Language>();
		list1.add(language1);
		list1.add(language2);

		person1.setLanguages(list1);

		List<Language> list2 = new ArrayList<Language>();
		list2.add(language1);
		list2.add(language3);

		person2.setLanguages(list2);

		List<Language> list3 = new ArrayList<Language>();
		list3.add(language1);
		list3.add(language2);
		list3.add(language3);

		person3.setLanguages(list3);

		List<Person> list4 = new ArrayList<Person>();
		list4.add(person3);
		list4.add(person2);

		language1.setPersons(list4);

		List<Person> list5 = new ArrayList<Person>();
		list5.add(person3);
		list5.add(person1);

		language2.setPersons(list4);

		List<Person> list6 = new ArrayList<Person>();
		list6.add(person3);
		list6.add(person2);
		list6.add(person1);

		language3.setPersons(list6);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sarang");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
//		entityManager.persist(language1);
//		entityManager.persist(language2);
//		entityManager.persist(language3);

		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);

		entityTransaction.commit();

	}

}
