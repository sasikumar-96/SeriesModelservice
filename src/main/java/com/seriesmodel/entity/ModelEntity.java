package com.seriesmodel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MODEL")
public class ModelEntity {
	
	@Id
	@Column(name="MODEL_ID")
	private Integer modelID;
	
	@Column(name="MODEL_NAME")
	private String modelName;
	
	@Column(name="SERIES_ID")
	private Integer seriesId;
	
	@Column(name="PRICE")
	private double price;

	public Integer getModelID() {
		return modelID;
	}

	public void setModelID(Integer modelID) {
		this.modelID = modelID;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ModelEntity(Integer modelID, String modelName, Integer seriesId, double price) {
		super();
		this.modelID = modelID;
		this.modelName = modelName;
		this.seriesId = seriesId;
		this.price = price;
	}

	public ModelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	

}
