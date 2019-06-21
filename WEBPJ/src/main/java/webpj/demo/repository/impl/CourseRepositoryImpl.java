package webpj.demo.repository.impl;

import webpj.demo.repository.CourseRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CourseRepositoryImpl implements CourseRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
