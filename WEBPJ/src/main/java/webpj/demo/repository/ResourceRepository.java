package webpj.demo.repository;

    import webpj.demo.ENTITY.ResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

public interface ResourceRepository extends JpaRepository<ResourceEntity, Integer>, ResourceRepositoryCustom {
public ResourceEntity getResourceEntityByRid(int id);
public List<ResourceEntity> findAllByCourseId(int id);
}
