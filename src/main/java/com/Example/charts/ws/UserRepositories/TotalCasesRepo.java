package com.Example.charts.ws.UserRepositories;

import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Example.charts.ws.Entities.TotalCasesCol;

@Repository
public interface TotalCasesRepo extends CrudRepository<TotalCasesCol, Integer>{

	ArrayList<TotalCasesCol> findAll();
}
