package webpj.demo.service;

import webpj.demo.ENTITY.HomeworkEntity;
import webpj.demo.repository.HomeworkRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface HomeworkService  {

	//@Resource
	//private HomeworkRepository rep;
	public List<HomeworkEntity> getcoursehomework(int id);
	public HomeworkEntity gethomeworkbyHID(int id);

}
