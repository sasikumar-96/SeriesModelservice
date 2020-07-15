package com.seriesmodel.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriesmodel.entity.SeriesEntity;
import com.seriesmodel.repository.SeriesRepository;

@Service
@Transactional
public class SeriesService {
	
	@Autowired
	SeriesRepository repo;

	public List<SeriesEntity> getSeriesList() {
		
		return repo.findAll();
	}
	
	

}
