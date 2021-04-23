package com.Example.charts.ws.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Example.charts.ws.Entities.ActiveCasesCol;
import com.Example.charts.ws.Entities.COVIDLine;
import com.Example.charts.ws.Entities.Entityajax1;
import com.Example.charts.ws.Entities.Entityajax2;
import com.Example.charts.ws.Entities.OutComeLine;
import com.Example.charts.ws.Entities.TotalCasesCol;
import com.Example.charts.ws.UserRepositories.ActiveCasesRepo;
import com.Example.charts.ws.UserRepositories.Ajax1Repo;
import com.Example.charts.ws.UserRepositories.Ajax2Repo;
import com.Example.charts.ws.UserRepositories.COVIDLineRepo;
import com.Example.charts.ws.UserRepositories.OutcomeLineRepo;
import com.Example.charts.ws.UserRepositories.TotalCasesRepo;


@RestController
@RequestMapping() //http://localhost:8080
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
	
	@Autowired
	Ajax1Repo repo1;
	
	@Autowired
	Ajax2Repo repo2;
	
	@Autowired
	OutcomeLineRepo repo3;
	
	@Autowired
	COVIDLineRepo repo4;
	
	@Autowired
	TotalCasesRepo repo5;
	
	@Autowired
	ActiveCasesRepo repo6;
	
	@GetMapping(path= "/getajax1")
	public List<Entityajax1> getajax1data()
	{
		return repo1.findAll();
	}
	
	@GetMapping(path= "/getajax2")
	public List<Entityajax2> getajax2data()
	{
		return repo2.findAll();
	}
	
	@GetMapping(path= "/getoutcomeline")
	public List<OutComeLine> getOutComedata()
	{
		return repo3.findAll();
	}
	
	@GetMapping(path= "/getcovidline")
	public List<COVIDLine> getCOVIDLine()
	{
		return repo4.findAll();
	}
	
	@GetMapping(path= "/gettotalcases")
	public List<TotalCasesCol> getTotalCases()
	{
		return repo5.findAll();
	}
	
	@GetMapping(path= "/getactivecases")
	public List<ActiveCasesCol> getActiveCases()
	{
		return repo6.findAll();
	}
    
}
