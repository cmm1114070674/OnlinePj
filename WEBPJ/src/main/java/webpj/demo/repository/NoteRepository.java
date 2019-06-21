package webpj.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webpj.demo.ENTITY.NoteEntity;
import webpj.demo.ENTITY.StudentEntity;

import java.util.List;

public interface NoteRepository extends JpaRepository<NoteEntity, Integer>, NoteRepositoryCustom {
public List<NoteEntity> findAllByUid(int id);
}
