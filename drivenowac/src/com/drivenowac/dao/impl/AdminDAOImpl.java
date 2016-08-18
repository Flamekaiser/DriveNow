package com.drivenowac.dao.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.drivenowac.dao.AdminDAO;
import com.drivenowcore.ac.model.Admin;

public class AdminDAOImpl implements AdminDAO {

	//@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ArrayList<Admin> getAdminList() {
		String sql="select * from Admin";
		return (ArrayList<Admin>) jdbcTemplate.query(sql , new AdminRowMapper());
	}

	@Override
	public Admin getAdminbyId(String id) {
		String sql="select * from Admin where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new AdminRowMapper());
	}

	@Override
	public Admin getAdminbyUserId(String UserId) {
		String sql="select * from Admin where user_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{UserId}, new AdminRowMapper());
	}

	@Override
	public Admin getAdminbyEmailId(String EmailId) {
		String sql="select * from Admin where email_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{EmailId}, new AdminRowMapper());
	}

	@Override
	public String getAdminNamebyEmailId(String EmailId) {
		String sql="select full_name from Admin where email_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{EmailId}, String.class);
	}

	@Override
	public String CreateAdmin(Admin admin) {
		String response = null;
		String checkEmail="select count(id) from admin where email_id=?";
		int checkEmailCount = jdbcTemplate.queryForInt(checkEmail, new Object[]{admin.getEmailId()});
		if(checkEmailCount > 0){
			response="ERR:EMAILEXISTS";
		}
		String checkPhone="select count(id) from admin where contact_no=?";
		int checkPhoneCount = jdbcTemplate.queryForInt(checkPhone, new Object[]{admin.getContactNo()});
		if(checkPhoneCount > 0){
			response="ERR:PHONEEXISTS";
		}
		String sql = "insert into admin values(0,?,?,?,?,?)";
		int createResponse = jdbcTemplate.update(sql, new Object[]{admin.getEmailId(),admin.getContactNo(),admin.getPassword(),admin.getFullName(),admin.getImageURL()});
		if(createResponse == 1){
			response="SUCCESS";
		}
		else{
			response="ERR:FAILED";
		}
		
		return response;
	}

}
