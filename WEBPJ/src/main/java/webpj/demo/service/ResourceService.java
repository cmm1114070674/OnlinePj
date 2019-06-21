package webpj.demo.service;

import webpj.demo.ENTITY.ResourceEntity;
import webpj.demo.repository.ResourceRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface ResourceService  {

	//@Resource
	//private ResourceRepository rep;
	public ResourceEntity getresbyid(int id);
	public List<ResourceEntity> getressbycoureseid(int id);
}
