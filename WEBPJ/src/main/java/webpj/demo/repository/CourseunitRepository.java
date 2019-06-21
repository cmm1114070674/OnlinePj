package webpj.demo.repository;

import webpj.demo.ENTITY.CourseunitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseunitRepository extends JpaRepository<CourseunitEntity, Integer>, CourseunitRepositoryCustom {
    public CourseunitEntity getCourseunitEntityByUnitId(int id);

    public List<CourseunitEntity> findAllByCourseId(int ID);
}
