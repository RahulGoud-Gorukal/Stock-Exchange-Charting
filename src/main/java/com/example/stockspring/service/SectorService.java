package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Sector;

public interface SectorService {
	 public Sector insertSector(Sector sector) throws Exception;
	
		public List<Sector> getSectorList() throws Exception;


}
