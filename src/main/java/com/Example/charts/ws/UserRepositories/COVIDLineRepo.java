package com.Example.charts.ws.UserRepositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Example.charts.ws.Entities.COVIDLine;

@Repository
public interface COVIDLineRepo extends CrudRepository<COVIDLine, Integer> {
	
	List<COVIDLine> findAll();

}
