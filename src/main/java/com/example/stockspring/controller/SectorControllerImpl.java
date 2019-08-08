package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.model.Sector;

import com.example.stockspring.service.SectorService;
@Service
public class SectorControllerImpl implements SectorController {
	@Autowired
	private SectorService sectorService;
	

	@Override
	public Sector insertSector(Sector sector) throws Exception {
		sectorService.insertSector(sector);
		return sector;	
	}

	@Override
	public List<Sector> getSectorList() throws Exception {
		return sectorService.getSectorList();
	}
	
	public static void main(String [] args) {
		SectorController controller=new SectorControllerImpl();
		try {
			System.out.println(controller.getSectorList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
