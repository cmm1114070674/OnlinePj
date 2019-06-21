package webpj.demo.repository;

import webpj.demo.  ENTITY.ExecutionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.logging.Level;

public interface ExecutionRepository extends JpaRepository<ExecutionEntity, Integer>, ExecutionRepositoryCustom {
public ExecutionEntity getExecutionEntityByHidAndUid(int id,int id2);
public List<ExecutionEntity> findAllByUid(int uid);
public List<ExecutionEntity> findAllByHid(int HID);
}
