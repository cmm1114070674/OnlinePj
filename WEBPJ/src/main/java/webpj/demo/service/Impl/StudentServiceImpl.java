package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.StudentEntity;
import webpj.demo.repository.StudentRepository;
import webpj.demo.service.StudentService;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<StudentEntity> getbycourseid(int id){
        return studentRepository.findAllByCourseId(id);
    };
    @Override
    public List<StudentEntity> getbyUID(int id){
        return studentRepository.findAllByUid(id);
    };
    @Override
    public StudentEntity getbycourseidanduid(int id,int ID){
        return studentRepository.getStudentEntityByCourseIdAndUid(id,ID);
    };
    @Override
    public void selectcourse(int UID,int CourseID){
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setUid(UID);
        studentEntity.setCourseId(CourseID);
        studentRepository.save(studentEntity);
    };

}
