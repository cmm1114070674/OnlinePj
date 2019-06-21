package webpj.demo.service;

import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.CourseEntity;
import webpj.demo.ENTITY.NoteEntity;

import java.util.List;

@Service
public interface NoteService {

	//@Resource
	//private CourseRepository rep;
	public List<NoteEntity> getnotebyuserid(int UID);
	public void addnote(int UID,int CourseID,String description);

}
