package webpj.demo.service;

import webpj.demo.ENTITY.CourseEntity;
import webpj.demo.repository.CourseRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface CourseService  {

	//@Resource
	//private CourseRepository rep;
	public List<CourseEntity> getonesallclass(int UID);
	public List<CourseEntity> getALLclass();
	public CourseEntity getcoursebyCourseID(int ID);

}
