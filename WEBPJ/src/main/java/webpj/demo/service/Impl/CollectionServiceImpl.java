package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.CollectionEntity;
import webpj.demo.ENTITY.StudentEntity;
import webpj.demo.repository.CollectionRepository;
import webpj.demo.repository.StudentRepository;
import webpj.demo.service.CollectionService;
import webpj.demo.service.StudentService;

import java.util.List;

@Service
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    CollectionRepository collectionRepository;
    @Override
    public List<CollectionEntity> getbycourseid(int id){
        return collectionRepository.findAllByCourseId(id);
    };
    @Override
    public List<CollectionEntity> getbyUID(int id){
        return collectionRepository.findAllByUid(id);
    };
    @Override
    public CollectionEntity getbycourseidanduid(int id, int ID){
        return collectionRepository.getCollectionEntityByCourseIdAndUid(id,ID);
    };
    @Override
    public void addfavocourse(int UID,int CourseID){
        CollectionEntity collectionEntity=new CollectionEntity();
        collectionEntity.setUid(UID);
        collectionEntity.setCourseId(UID);
        collectionRepository.save(collectionEntity);
    };

}
