package webpj.demo.repository.impl;

import webpj.demo.repository.UsersRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UsersRepositoryImpl implements UsersRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
