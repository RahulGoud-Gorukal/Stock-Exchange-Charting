package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.model.Sector;
@Service
public class SectorServiceImpl implements SectorService {
	private SectorDao sectorDao;
	

	public Sector insertSector(Sector sector) throws SQLException {
		return sectorDao.insertSector(sector) ;
	}

	public Sector updateSector(Sector sector) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Sector> getSectorList() throws SQLException {
		// TODO Auto-generated method stub
		return sectorDao.getSectorList() ;
	}

}