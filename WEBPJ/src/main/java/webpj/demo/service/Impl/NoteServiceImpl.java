package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.NoteEntity;
import webpj.demo.ENTITY.StudentEntity;
import webpj.demo.repository.NoteRepository;
import webpj.demo.repository.StudentRepository;
import webpj.demo.service.NoteService;
import webpj.demo.service.StudentService;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    NoteRepository noteRepository;
    @Override
    public List<NoteEntity> getnotebyuserid(int id){
        return noteRepository.findAllByUid(id);
    };
    @Override
    public void addnote(int UID,int CourseID,String description){
        NoteEntity noteEntity=new NoteEntity();
        noteEntity.setUid(UID);
        noteEntity.setCourseId(CourseID);
        noteEntity.setDiscription(description);
        noteRepository.save(noteEntity);
    };

}
