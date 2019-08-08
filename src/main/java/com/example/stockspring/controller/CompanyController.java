package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyController {

  	    public Company insertCompany(Company company) throws  Exception;
	    public Company updateCompany(Company company) throws Exception;;
		public List<Company> getCompanyList() throws Exception;

	
}
