package webpj.demo.repository;

import webpj.demo.ENTITY.CoursecellEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursecellRepository extends JpaRepository<CoursecellEntity, Integer>, CoursecellRepositoryCustom {
        public  CoursecellEntity getCoursecellEntityByCellId(int id);
        public List<CoursecellEntity> findByUnitId(int id);
}
