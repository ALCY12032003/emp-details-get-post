package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EmpEntity;
import com.example.demo.Service.EmpService;

@RestController
public class EmpController {
	@Autowired //extends another class
         EmpService stuService;
	
	@PostMapping("/addDetails")
	
	public EmpEntity addInfo(@RequestBody EmpEntity st) {
		return stuService.saveDetails(st);
	}
	@GetMapping("/showDetails")
	public List<EmpEntity>fetchDetails()
	{
		return stuService.getDetails();
	}

}