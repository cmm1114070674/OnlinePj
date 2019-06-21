package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.CourseEntity;
import webpj.demo.repository.CourseRepository;
import webpj.demo.service.CourseService;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Override
    public List<CourseEntity> getonesallclass(int UID){
        return courseRepository.findAllByUid(UID);
    };
    @Override
    public List<CourseEntity> getALLclass(){
        return courseRepository.findAll();
    };
    @Override
    public CourseEntity getcoursebyCourseID(int ID){
        return courseRepository.getCourseEntityByCourseId(ID);
    };

}
