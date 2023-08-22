package oneToone_bidirection.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneToone_bidirection.dto.AadharCard;
import oneToone_bidirection.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sarang");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
  public void savePerson(Person person){
//	AadharCard aadharCard=  person.getAadharcard();
		entityTransaction.begin();
		entityManager.persist(person);
//		entityManager.persist(aadharCard);
		entityTransaction.commit();
	  
  }
	
	
	public void findPerson(int id) {
		Person person=entityManager.find(Person.class, id);
		System.out.println(person);
		
		
	}
	
	public void deletePersson(int id) {
		Person person=entityManager.find(Person.class, id);
		if (person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			
		}else {
			System.out.println("id Not Found");
		}
		
	}
	public void updatePerson(int id,Person person) {
		Person dbperson=entityManager.find(Person.class, id);
		if (dbperson!=null) {
			person.setId(id);
			person.getAadharcard().setId(dbperson.getAadharcard().getId());
			
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			
		}
		
	}

}
