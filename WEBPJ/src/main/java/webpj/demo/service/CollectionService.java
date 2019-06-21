package webpj.demo.service;

import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.CollectionEntity;
import webpj.demo.ENTITY.StudentEntity;

import java.util.List;

@Service
public interface CollectionService {

    //@Resource
    //private StudentRepository rep;
    public List<CollectionEntity> getbycourseid(int id);
    public List<CollectionEntity> getbyUID(int id);
    public CollectionEntity getbycourseidanduid(int id, int ID);
    public void addfavocourse(int UID,int CourseID);
}
