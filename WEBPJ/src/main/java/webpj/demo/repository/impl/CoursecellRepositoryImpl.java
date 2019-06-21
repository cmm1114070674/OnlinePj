package webpj.demo.repository.impl;

import webpj.demo.repository.CoursecellRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CoursecellRepositoryImpl implements CoursecellRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
