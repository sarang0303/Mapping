package onetoone_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetoone_uni.dto.AadharCard;
import onetoone_uni.dto.Person;

public class PersonDao {

	private static final List Person = null;
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sarang");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void savePerson(Person person) {

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		AadharCard aadharCard = person.getAddharcard();

		entityManager.persist(aadharCard);
		entityManager.persist(person);
		entityTransaction.commit();

	}

	public void findPerson(int id) {
		Person person = entityManager.find(Person.class, id);
		System.out.println(person);

	}

	public void findAll() {
		Query query = entityManager.createQuery("SELECT  p FROM Person p");
		List<Person> list = query.getResultList();
		System.out.println(list);

	}

	public void deletePerson(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person1 = entityManager.find(Person.class, id);
		if (person1 != null) {
			entityTransaction.begin();
			entityManager.remove(person1);
			entityTransaction.commit();
			AadharCardDao cardDao = new AadharCardDao();
			cardDao.deleteAadhar(id);

		} else {
			System.out.println("Id NOt Found");
		}
	}

	public void updatePerson(int id, Person person) {
		Person person2 = entityManager.find(Person.class, id);
		if (person2 != null) {
			person.setId(id);
			person.setAddharcard(person2.getAddharcard());

			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();

		} else {
			System.out.println("ID NoT Found");
		}

	}

	public void updatePesonAadhar(int id, Person person) {

		Person dbperson = entityManager.find(Person.class, id);

		if (dbperson != null) {

			person.setId(id);
			person.getAddharcard().setId(dbperson.getAddharcard().getId());

			entityTransaction.begin();
			entityManager.merge(person.getAddharcard());
			entityManager.merge(person);
			entityTransaction.commit();

		} else {
			System.out.println("not update");
		}

	}
}
