package cl.coders.interactive.springbootcheatsheet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.coders.interactive.springbootcheatsheet.entity.Person;

@Transactional
@Repository
public class PersonDAO implements IPersonDAO{

	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public List<Person> getAllPersons() {
		String hql = "FROM Person as p ORDER BY p.personId";
		return (List<Person>) entityManager.createQuery(hql).getResultList();
	}

}
