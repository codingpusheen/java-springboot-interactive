package cl.codefluffylearning.interactive.springbootcheatsheet.dao;

import java.util.List;

import cl.codefluffylearning.interactive.springbootcheatsheet.entity.Course;

public interface ICourseDAO {

	  List<Course> getAllCourses();
}
