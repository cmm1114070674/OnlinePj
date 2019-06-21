package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.ExecutionEntity;
import webpj.demo.repository.ExecutionRepository;
import webpj.demo.service.ExecutionService;

import java.util.List;
@Service
public class ExecutionServiceImpl implements ExecutionService {
    @Autowired
    ExecutionRepository executionRepository;
    @Override
    public List<ExecutionEntity> getexebyHID(int id){
        return executionRepository.findAllByHid(id);
    };
    @Override
    public List<ExecutionEntity> getexebyUID(int id){
        return executionRepository.findAllByUid(id);
    };
    @Override
    public ExecutionEntity getexebyHIDANDUID(int id,int id2){
        return executionRepository.getExecutionEntityByHidAndUid(id,id2);
    };
    @Override
    public void handhomework(int hid, int uid, int score, String homework){
        ExecutionEntity executionEntity=new ExecutionEntity();
        executionEntity.setHid(hid);
        executionEntity.setHomework(homework);
        executionEntity.setScore(score);
        executionEntity.setUid(uid);
        executionRepository.save(executionEntity);

    };
}
