package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Link;

public interface LinkDao extends JpaRepository<Link, Integer>{
	List<Link> getAllByJobSeekerId(int id);
}
