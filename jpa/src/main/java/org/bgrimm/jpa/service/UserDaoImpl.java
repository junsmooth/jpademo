package org.bgrimm.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.bgrimm.jpa.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoImpl {
//	 @Resource(name = "entityManagerFactory")
//	 protected EntityManagerFactory emf;

	
	@PersistenceUnit
	private EntityManager emf;

//	@PersistenceUnit
//	public void setEntityManagerFactory(EntityManagerFactory emf) {
//		this.emf = emf;
//		System.out.println("aaaaa"+emf.getProperties());
//	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void saveUser(User user) {
		System.out.println("bbbbb"+emf);
		emf.persist(user);
	}
}
