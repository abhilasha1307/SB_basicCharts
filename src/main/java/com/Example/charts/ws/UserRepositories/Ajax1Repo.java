package com.Example.charts.ws.UserRepositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Example.charts.ws.Entities.Entityajax1;

@Repository
public interface Ajax1Repo extends CrudRepository<Entityajax1, Integer> {

	List<Entityajax1> findAll();
}
