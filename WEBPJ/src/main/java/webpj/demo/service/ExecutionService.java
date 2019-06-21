package webpj.demo.service;

import webpj.demo.ENTITY.ExecutionEntity;
import webpj.demo.repository.ExecutionRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface ExecutionService {

    //@Resource
    //private ExecutionRepository rep;
    public List<ExecutionEntity> getexebyHID(int id);

    public List<ExecutionEntity> getexebyUID(int id);

    public ExecutionEntity getexebyHIDANDUID(int id, int id2);

    public void handhomework(int hid, int uid, int score, String homework);
}
