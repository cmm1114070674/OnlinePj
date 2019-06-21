package webpj.demo.repository.impl;

import webpj.demo.repository.ExecutionRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ExecutionRepositoryImpl implements ExecutionRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
