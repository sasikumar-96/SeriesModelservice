package com.seriesmodel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SERIES")
public class SeriesEntity {
	
	@Id
	@Column(name="SERIES_ID")
	private Integer seriesID;
	
	@Column(name="SERIES_NAME")
	private String seriesName;

	public Integer getSeriesID() {
		return seriesID;
	}

	public void setSeriesID(Integer seriesID) {
		this.seriesID = seriesID;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public SeriesEntity(Integer seriesID, String seriesName) {
		super();
		this.seriesID = seriesID;
		this.seriesName = seriesName;
	}

	public SeriesEntity() {
		super();
	}
	
	

}
