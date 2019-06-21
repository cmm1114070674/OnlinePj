package webpj.demo.repository.impl;

import webpj.demo.repository.StudentRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class StudentRepositoryImpl implements StudentRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
