package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Sector;

public interface SectorDao {
	 public Sector insertSector(Sector sector) throws SQLException;
		public List<Sector> getSectorList() throws SQLException;

}
