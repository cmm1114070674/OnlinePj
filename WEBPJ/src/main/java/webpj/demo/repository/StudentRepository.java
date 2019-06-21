package webpj.demo.repository;

    import webpj.demo.ENTITY.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>, StudentRepositoryCustom {
public StudentEntity getStudentEntityByCourseIdAndUid(int id,int id2);
public List<StudentEntity> findAllByCourseId(int id);
public List<StudentEntity> findAllByUid(int id);
}
