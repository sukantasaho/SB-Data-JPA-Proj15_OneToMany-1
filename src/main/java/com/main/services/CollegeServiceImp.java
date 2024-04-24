package com.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.College;
import com.main.repository.CollegeRepository;
import com.main.repository.StudentRepository;

@Service("cService")
public class CollegeServiceImp implements ICollegeService 
{

	@Autowired
	private CollegeRepository cRepo;
	@Autowired
	private StudentRepository sRepo;
	
	@Override
	public String registerStudent(College college) 
	{
		    College c =  cRepo.save(college);
		    
		return "Student is record saved with id-"+c.getCid();
	}

}
