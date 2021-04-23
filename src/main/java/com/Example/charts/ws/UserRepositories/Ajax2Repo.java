package com.Example.charts.ws.UserRepositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Example.charts.ws.Entities.Entityajax2;

@Repository
public interface Ajax2Repo extends CrudRepository<Entityajax2, Integer> {

	List<Entityajax2> findAll();
}
