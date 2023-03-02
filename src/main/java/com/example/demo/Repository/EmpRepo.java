package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.EmpEntity;

public interface EmpRepo extends JpaRepository<EmpEntity, Integer> {

}
