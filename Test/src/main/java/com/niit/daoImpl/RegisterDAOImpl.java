package com.niit.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.RegisterDAO;
import com.niit.model.Register;
@Repository
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	private SessionFactory sf;
	
	public void addUser(Register register) {
		sf.getCurrentSession().save(register);
	}

}
