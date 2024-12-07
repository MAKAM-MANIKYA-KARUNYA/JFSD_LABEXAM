package com.klef.jfsd.rest_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.rest_api.model.StudentModel;
import com.klef.jfsd.rest_api.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studRepo;

	@Override
	public void insertStudent(StudentModel student) {
		studRepo.save(student);
		System.out.println("Student Inserted successfully");
	}

	@Override
	public List<StudentModel> getAll() {
		return studRepo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		studRepo.delete(studRepo.getStudentById(id));
	}

	@Override
	public void updateStudent(Integer id, StudentModel updatedBody) {
		try {
			StudentModel std = studRepo.getStudentById(id);
			std.setName(updatedBody.getName());
			std.setCgpa(updatedBody.getCgpa());
			studRepo.save(std);
			System.out.println("Updated student");
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

}
