package webpj.demo.repository.impl;

import webpj.demo.repository.CourseunitRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CourseunitRepositoryImpl implements CourseunitRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
