package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.College;

public interface CollegeRepository extends JpaRepository<College, Integer> 
{

}
