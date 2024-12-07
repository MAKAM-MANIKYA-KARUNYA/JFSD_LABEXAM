package com.klef.jfsd.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.rest_api.model.StudentModel;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Integer> {
	@Query("SELECT s FROM StudentModel s WHERE s.id = ?1")
	public StudentModel getStudentById(Integer id);
}
