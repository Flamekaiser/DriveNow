package com.drivenowac.service;

import java.util.ArrayList;

import com.drivenowcore.ac.model.Admin;


public interface AdminService {
	public ArrayList<Admin> getAdminList(); 
	public Admin getAdminbyId(String id);
	public Admin getAdminbyUserId(String UserId);
	public Admin getAdminbyEmailId(String EmailId);
	public String getAdminNamebyEmailId(String EmailId);
	public String CreateAdmin(Admin admin);

}
