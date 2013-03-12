package org.bgrimm.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.bgrimm.jpa.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl {
	@PersistenceContext
	private EntityManager entityManager;

	public void saveUser(User user) {
		entityManager.persist(user);
	}
}
