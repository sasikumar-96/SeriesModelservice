package com.seriesmodel.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriesmodel.entity.ModelEntity;
import com.seriesmodel.repository.ModelRepository;

@Service
@Transactional
public class ModelService {

	@Autowired
	ModelRepository repo;

	public List<ModelEntity> getModelList(int seriesID) {
		
		return repo.findAll().stream().filter(x->x.getSeriesId()==seriesID).collect(Collectors.toList());
	}
	
}
