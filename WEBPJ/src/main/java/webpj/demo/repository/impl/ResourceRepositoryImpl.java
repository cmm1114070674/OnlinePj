package webpj.demo.repository.impl;

import webpj.demo.repository.ResourceRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ResourceRepositoryImpl implements ResourceRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
