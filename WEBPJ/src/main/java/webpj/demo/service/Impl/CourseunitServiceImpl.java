package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.CourseunitEntity;
import webpj.demo.repository.CourseunitRepository;

import java.util.List;

@Service
public class CourseunitServiceImpl implements webpj.demo.service.CourseunitService {
    @Autowired
    CourseunitRepository courseunitRepository;

    @Override
    public List<CourseunitEntity> getunitbycourseID(int ID) {
        return courseunitRepository.findAllByCourseId(ID);
    }

    ;

    @Override
    public CourseunitEntity getbyUnitid(int id) {
        return courseunitRepository.getCourseunitEntityByUnitId(id);
    }

    ;
}
