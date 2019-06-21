package webpj.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webpj.demo.ENTITY.CollectionEntity;
import webpj.demo.ENTITY.StudentEntity;

import java.util.List;

public interface CollectionRepository extends JpaRepository<CollectionEntity, Integer>, CollectionRepositoryCustom {
public CollectionEntity getCollectionEntityByCourseIdAndUid(int id, int id2);
public List<CollectionEntity> findAllByCourseId(int id);
public List<CollectionEntity> findAllByUid(int id);
}
