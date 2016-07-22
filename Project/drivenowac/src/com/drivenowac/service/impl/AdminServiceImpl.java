package com.drivenowac.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.drivenowac.dao.AdminDAO;
import com.drivenowac.service.AdminService;
import com.drivenowcore.ac.model.Admin;

public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDAO adminDAO;
	@Override
	public ArrayList<Admin> getAdminList() {
	
		return adminDAO.getAdminList();
	}

	@Override
	public Admin getAdminbyId(String id) {
		
		return adminDAO.getAdminbyId(id);
	}

	@Override
	public Admin getAdminbyUserId(String UserId) {
	
		return adminDAO.getAdminbyUserId(UserId);
	}

	@Override
	public Admin getAdminbyEmailId(String EmailId) {
		
		return adminDAO.getAdminbyEmailId(EmailId);
	}

	@Override
	public String getAdminNamebyEmailId(String EmailId) {
	
		return adminDAO.getAdminNamebyEmailId(EmailId);
	}

	@Override
	public String CreateAdmin(Admin admin) {
		
		return adminDAO.CreateAdmin(admin);
	}

}
