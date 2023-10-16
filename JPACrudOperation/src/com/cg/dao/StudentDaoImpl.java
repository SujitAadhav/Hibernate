package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.Student;

public class StudentDaoImpl implements StudentDao{

	private EntityManager entityManager;
	
	
	public StudentDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		//persist
		entityManager.persist(student);
	}

	@Override
	public Student getStudentById(int id) {
		//find
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		//merge
		entityManager.merge(student);
	}

	@Override
	public void removeStudent(Student student) {
		//remove
		entityManager.remove(student);
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
