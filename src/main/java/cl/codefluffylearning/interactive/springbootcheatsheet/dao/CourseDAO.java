package cl.codefluffylearning.interactive.springbootcheatsheet.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.codefluffylearning.interactive.springbootcheatsheet.entity.Course;

@Transactional
@Repository
public class CourseDAO implements ICourseDAO{

	@PersistenceContext	
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Course> getAllCourses() {
		
		List<Course> result = new ArrayList<Course>();
		
		try {
			
			String hql = "FROM Course as c ORDER BY c.courseId";
			
			result = (List<Course>) entityManager.createQuery(hql).getResultList();
			
			return result;
			
		} catch(Exception e) {
			e.printStackTrace();
			return result;
		}

	}

}
