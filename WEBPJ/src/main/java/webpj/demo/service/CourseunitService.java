package webpj.demo.service;

import webpj.demo.ENTITY.CourseunitEntity;
import webpj.demo.repository.CourseunitRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface CourseunitService  {

	//@Resource
	//private CourseunitRepository rep;
	public List<CourseunitEntity> getunitbycourseID(int ID);
	public CourseunitEntity getbyUnitid(int id);
}
