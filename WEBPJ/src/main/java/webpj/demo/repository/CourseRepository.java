package webpj.demo.repository;

import webpj.demo.ENTITY.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer>, CourseRepositoryCustom {
public CourseEntity getCourseEntityByCourseId(int id);
    public List<CourseEntity> findAllByUid(int UID);

}
