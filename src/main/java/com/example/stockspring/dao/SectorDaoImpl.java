package com.example.stockspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Sector;
@Repository
public class SectorDaoImpl implements SectorDao{

	public Sector insertSector(Sector sector) throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/stock_db?useSSL=false","root","pass@word1");
		PreparedStatement ps=conn.prepareStatement("insert into sectors (id,sector_name,brief) value(?,?,?)");
		ps.setInt(1, sector.getId());
		ps.setString(2, sector.getSector_name());
		ps.setString(3, sector.getBreif());
		ps.executeUpdate();
		
		return null;
	}

	public Sector updateSector(Sector sector) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Sector> getSectorList() throws SQLException {
		List <Sector> sectorList=new ArrayList<Sector>();
		try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/stock_db?useSSL=false","root","pass@word1");
		PreparedStatement ps=conn.prepareStatement("select * from sectors");
		ResultSet rs=	ps.executeQuery();
		Sector sector=null;
		while(rs.next()){
			sector=new Sector();
			 int id=rs.getInt("id");
			 sector.setId(id);
			 sector.setSector_name(rs.getString("sector_name"));
			 sector.setBreif(rs.getString("brief"));
			 sectorList.add(sector);
		}
		}catch(SQLException e){
			System.out.println(e);
			throw e;
		}
		return sectorList;
		
		
	}
	
	
	public static void main(String []args) throws Exception{
		SectorDaoImpl dao=new SectorDaoImpl();
		Sector sector=new Sector();
		sector.setId(2001);
		sector.setSector_name("IT");
		sector.setBreif("All IT related stuff");
		dao.insertSector(sector);
		
		System.out.println(dao.getSectorList());
	}

}
