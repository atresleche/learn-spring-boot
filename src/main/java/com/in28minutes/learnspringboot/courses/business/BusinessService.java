package com.in28minutes.learnspringboot.courses.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringboot.courses.data.DataService;

@Component
public class BusinessService {
	
	@Autowired
	private DataService dataService;
	
	BusinessService(DataService dataService){
		this.dataService = dataService;
	}
	
}