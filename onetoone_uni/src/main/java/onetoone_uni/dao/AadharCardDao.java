package onetoone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_uni.dto.AadharCard;

public class AadharCardDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sarang");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	AadharCard aadharCard = new AadharCard();

	public void deleteAadhar(int id) {
		AadharCard aadharCard = entityManager.find(AadharCard.class, id);
		if (aadharCard != null) {
			entityTransaction.begin();
			entityManager.remove(aadharCard);
			entityTransaction.commit();

		} else {
			System.out.println("Id NOt Found");
		}
	}

	public void updateAaddhar(int id, AadharCard aadharCard) {
		AadharCard aadharCard2 = entityManager.find(AadharCard.class, id);
		if (aadharCard2 != null) {

			aadharCard.setId(id);

			entityTransaction.begin();
			entityManager.merge(aadharCard);
			entityTransaction.commit();
			System.out.println("UPDATE");

		}else {
			System.out.println("try again");
		}

	}

}
