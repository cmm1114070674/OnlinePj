package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.ExecutionEntity;
import webpj.demo.ENTITY.HomeworkEntity;
import webpj.demo.repository.HomeworkRepository;
import webpj.demo.service.HomeworkService;

import java.util.List;
@Service
public class HomeworkServiceImpl implements HomeworkService {
    @Autowired
    HomeworkRepository homeworkRepository;
    @Override
    public List<HomeworkEntity> getcoursehomework(int id){
        return homeworkRepository.findAllByCourseId(id);
    };
    @Override
    public HomeworkEntity gethomeworkbyHID(int id){
        return homeworkRepository.getHomeworkEntityByHid(id);
    }

}
