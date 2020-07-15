package com.seriesmodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seriesmodel.entity.ModelEntity;

@Repository
public interface ModelRepository extends JpaRepository<ModelEntity, Integer>{

}
