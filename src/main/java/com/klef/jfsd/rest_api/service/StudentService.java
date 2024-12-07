package com.klef.jfsd.rest_api.service;

import java.util.List;

import com.klef.jfsd.rest_api.model.StudentModel;

public interface StudentService {

	public void insertStudent(StudentModel student);

	public List<StudentModel> getAll();

	public void updateStudent(Integer id,StudentModel updatedBody);

	public void deleteStudent(Integer id);

}
