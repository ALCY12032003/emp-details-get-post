package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.EmpEntity;
import com.example.demo.Repository.EmpRepo;
@Service
public class EmpService {
	@Autowired //extends another class
    EmpRepo stRepo; //reference variable
	
	public EmpEntity saveDetails(EmpEntity e) {
		return stRepo.save(e);
	}
	public List <EmpEntity>getDetails()

{
		return stRepo.findAll();
		
}
}