package one_to_one_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_one_bi.*;
import one_to_one_bi.*;
import one_to_one_bi.dao.PersonDao;
import one_to_one_bi.dto.AadharCard;
import one_to_one_bi.dto.Person;

public class MainController {
	public static void main(String[] args) {
		AadharCard aadharCard= new AadharCard();
		aadharCard.setId(101);
		aadharCard.setName("ANAND");
		aadharCard.setAddress("crn");

		Person person = new Person();
		person.setId(1);
		person.setName("ANAND R");
		person.setPhone(45);

		
		
		
		person.setAadharCard(aadharCard);
		aadharCard.setPerson(person);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();
			entityManager.persist(person);
			entityManager.persist(aadharCard);
			entityTransaction.commit();
////			
//			PersonDao dao= new PersonDao();
//			dao.getPerson(1);
			
			

		}

		
	}


