package webpj.demo.repository.impl;

import webpj.demo.repository.HomeworkRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class HomeworkRepositoryImpl implements HomeworkRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
