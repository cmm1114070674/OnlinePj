package webpj.demo.service;

import webpj.demo.ENTITY.CoursecellEntity;
import webpj.demo.repository.CoursecellRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface CoursecellService  {

	//@Resource
	//private CoursecellRepository rep;
	public List<CoursecellEntity> getall();

	public List<CoursecellEntity> getcellsintUnitID(int unitid);
}
