package webpj.demo.repository.impl;

import org.springframework.stereotype.Repository;
import webpj.demo.repository.CollectionRepositoryCustom;
import webpj.demo.repository.StudentRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CollectionRepositoryImpl implements CollectionRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
