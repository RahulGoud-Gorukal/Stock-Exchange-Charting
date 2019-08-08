package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Sector;

public interface SectorController {
	
	public Sector insertSector(Sector sector) throws  Exception;
	public List<Sector> getSectorList() throws Exception;


}
