package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.ResourceEntity;
import webpj.demo.repository.ResourceRepository;
import webpj.demo.service.ResourceService;

import java.util.List;
@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    ResourceRepository resourceRepository;
    @Override
    public ResourceEntity getresbyid(int id){
        return resourceRepository.getResourceEntityByRid(id);
    };
    @Override
    public List<ResourceEntity> getressbycoureseid(int id){
        return resourceRepository.findAllByCourseId(id);
    };
}
