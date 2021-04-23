package com.Example.charts.ws.UserRepositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Example.charts.ws.Entities.OutComeLine;

@Repository
public interface OutcomeLineRepo extends CrudRepository<OutComeLine, Integer>{

	List<OutComeLine> findAll();
}
