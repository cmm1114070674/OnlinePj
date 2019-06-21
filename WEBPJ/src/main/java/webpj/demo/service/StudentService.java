package webpj.demo.service;

import webpj.demo.ENTITY.StudentEntity;
import webpj.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface StudentService {

    //@Resource
    //private StudentRepository rep;
    public List<StudentEntity> getbycourseid(int id);
    public List<StudentEntity> getbyUID(int id);
    public StudentEntity getbycourseidanduid(int id,int ID);
    public void selectcourse(int UID,int CourseID);

}
