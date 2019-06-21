package webpj.demo.repository.impl;

import org.springframework.stereotype.Repository;
import webpj.demo.repository.NoteRepositoryCustom;
import webpj.demo.repository.StudentRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class NoteRepositoryImpl implements NoteRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
