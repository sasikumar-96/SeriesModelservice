package com.seriesmodel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.seriesmodel.entity.ModelEntity;
import com.seriesmodel.entity.SeriesEntity;
import com.seriesmodel.service.ModelService;
import com.seriesmodel.service.SeriesService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class SeriesModelController {
	
	
	@Autowired
	SeriesService service;
	
	@Autowired
	ModelService ser;
	
	@GetMapping("/series")
	public List<SeriesEntity> getSeriesList(){
		
		return service.getSeriesList();
	}
	
	@GetMapping("/model/{seriesID}")
	public List<ModelEntity> getModelList(@PathVariable int seriesID){
		
		return ser.getModelList(seriesID);
	}
	
	
}
