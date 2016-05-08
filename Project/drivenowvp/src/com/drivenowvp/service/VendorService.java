package com.drivenowvp.service;
import java.util.ArrayList;
import com.drivenowcore.vp.model.Vendor;

public interface VendorService {
	public ArrayList<Vendor> getVendorList(); 
	public Vendor getVendorbyId(String id);
	public Vendor getVendorbyUserId(String UserId);
	public Vendor getVendorbyEmailId(String EmailId);
	public Vendor getVendorbyContactNo(String contactNo);

}
