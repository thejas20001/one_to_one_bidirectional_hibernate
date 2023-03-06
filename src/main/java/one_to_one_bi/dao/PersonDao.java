package one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import one_to_one_bi.dto.Person;

public class PersonDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();

	}
	public void getPerson(int id) {
		
		EntityManager entityManager = getEntityManager();
		Person person= entityManager.find(Person.class, id);
		System.out.println(person);

}

	
}
