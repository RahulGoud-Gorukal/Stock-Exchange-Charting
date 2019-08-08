package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.stockspring.model.Company;
import com.example.stockspring.service.CompanyService;

@Controller
public class CompanyControllerImpl implements CompanyController{

	
	@Autowired
	private CompanyService companyService;
	
	
	
	
	
	public Company insertCompany(Company company) throws Exception {
		companyService.insertCompany(company);
		return company;	
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> getCompanyList() throws Exception {
		return companyService.getCompanyList();
	}
	
	
	// try
	public static void main(String [] args) {
		CompanyController controller=new CompanyControllerImpl();
		try {
			System.out.println(controller.getCompanyList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
