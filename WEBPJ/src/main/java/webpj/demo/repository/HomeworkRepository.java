package webpj.demo.repository;

    import webpj.demo.ENTITY.HomeworkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

public interface HomeworkRepository extends JpaRepository<HomeworkEntity, Integer>, HomeworkRepositoryCustom {
public HomeworkEntity getHomeworkEntityByHid(int id);
    public List<HomeworkEntity> findAllByCourseId(int id);
}
