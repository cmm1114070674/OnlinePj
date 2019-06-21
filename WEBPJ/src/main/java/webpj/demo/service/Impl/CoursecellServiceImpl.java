package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.CoursecellEntity;
import webpj.demo.repository.CoursecellRepository;
import webpj.demo.service.CoursecellService;

import javax.websocket.server.ServerEndpoint;
import java.util.List;
@Service
public class CoursecellServiceImpl implements CoursecellService {
    @Autowired
    CoursecellRepository coursecellRepository;

    @Override
    public List<CoursecellEntity> getall() {
        return coursecellRepository.findAll();
    }

    @Override
    public List<CoursecellEntity> getcellsintUnitID(int unitid){

        return coursecellRepository.findByUnitId(unitid);
    };
}
