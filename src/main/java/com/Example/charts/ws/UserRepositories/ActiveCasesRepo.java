package com.Example.charts.ws.UserRepositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Example.charts.ws.Entities.ActiveCasesCol;

@Repository
public interface ActiveCasesRepo extends CrudRepository<ActiveCasesCol, Integer>{

	List<ActiveCasesCol> findAll();
}
