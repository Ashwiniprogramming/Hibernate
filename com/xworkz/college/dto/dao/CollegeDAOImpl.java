package com.xworkz.college.dto.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.college.dto.CollegeDTO;

public class CollegeDAOImpl implements CollegeDAO {

	@Override
	public void saveCollege(CollegeDTO collegeDTO) {
		Session session = null;
		try {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sessionFactory =con.buildSessionFactory();
	    session = sessionFactory.openSession();
	    session.beginTransaction();
	   //session.save(collegeDTO);
	    session.persist(collegeDTO);
	    
	    session.getTransaction().commit();
	    session.close();
	    
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(Objects.nonNull(session)) {
			session.close();
			System.out.println("session is closed");
		}else {
		       System.out.println("session is not closed");
	}
	}
	}


	@Override
	public void fetchCollege(int college_id) {
		Session session = null;
		try {
		Configuration con = new Configuration();
	    con.configure();
		SessionFactory sessionFactory =con.buildSessionFactory();
	    session = sessionFactory.openSession();
	    CollegeDTO collegeDTO = session.get(CollegeDTO.class,college_id);
	    System.out.println(collegeDTO);
	    
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		if(Objects.nonNull(session)) {
			session.close();
			System.out.println("session is closed");
		}else {
			System.out.println("session is not closed");
	}
	}
	}


	@Override
	public void updateCollege(CollegeDTO collegeDTO, int college_id) {
		Session session = null;
		try {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sessionFactory =con.buildSessionFactory();
	    session = sessionFactory.openSession();
	    collegeDTO = session.get(CollegeDTO.class,college_id);
	    collegeDTO.setNoofstudent(250);
	    collegeDTO.setNoofrooms(600);
	    collegeDTO.setNoofbranches(10);
	    session.beginTransaction();
	    session.update(collegeDTO);
	    
	    session.getTransaction().commit();
	    session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			}else {
				System.out.println("session is not closed");
			}
		}
	    
		
	}

}
