package com.drivenowac.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.drivenowcore.ac.model.Admin;

public class AdminRowMapper implements RowMapper<Admin> {
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admin admin=new Admin();
		
		admin.setId(rs.getString("id"));
		admin.setEmailId(rs.getString("email_id"));
		admin.setContactNo(rs.getString("contact_no"));
		admin.setPassword(rs.getString("password"));
		admin.setFullName(rs.getString("full_name"));
		admin.setImageURL(rs.getString("image_url"));
	    return admin;
	}

}
