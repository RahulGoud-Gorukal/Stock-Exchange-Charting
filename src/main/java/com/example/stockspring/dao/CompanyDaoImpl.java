package com.example.stockspring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.stockspring.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao{

	public Company insertCompany(Company company) throws SQLException  {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/stock_db?useSSL=false","root","pass@word1");
		
		PreparedStatement stmt=conn.prepareStatement("Insert into company ('company_code',`company_name`, `turnover`, `ceo`, `boardofdirectors`, `sector_id`, `breifwriteup`, `stock_Code`) values(?,?,?,?,?,?,?)");
		
		stmt.setInt(1, company.getCompanyCode());
		stmt.setString(2, company.getCompanyName());
		stmt.setDouble(3, company.getTurnOver());
		stmt.setString(4, company.getCeo());
		stmt.setString(5, company.getBoardOfDirectors());
		stmt.setInt(6, company.getSectorId());
		stmt.setString(7, company.getBriefWriteUp());
		stmt.setInt(8, company.getStockCode());
		System.out.println(stmt.execute());
		return company;
	}

	
	public List<Company> getCompanyList() throws SQLException {
		try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/stock_db?useSSL=false","root","pass@word1");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		List<Company> list=new ArrayList<Company>();
		while(rs.next()) 
		{
			Company comp=new Company();
			comp.setCompanyCode(rs.getInt(1));
			comp.setCompanyName(rs.getString(2));
			comp.setTurnOver(rs.getDouble(3));
			comp.setCeo(rs.getString(4));
			comp.setBoardOfDirectors(rs.getString(5));
			comp.setSectorId(rs.getInt(6));
			comp.setBriefWriteUp(rs.getString(7));
			comp.setStockCode(rs.getInt(8));
			
			list.add(comp);
		
		}
		return list;
		}
		catch(SQLException e){
			System.out.println(e);
			throw e;
		}
	}

	
	
	
	
	
	
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception{
		CompanyDaoImpl dao=new CompanyDaoImpl();
		Company compnay=new Company();
		compnay.setCompanyCode(1001);
		compnay.setBoardOfDirectors("rahul");
		dao.insertCompany(compnay);
		
		System.out.println(dao.getCompanyList());
	}

}





