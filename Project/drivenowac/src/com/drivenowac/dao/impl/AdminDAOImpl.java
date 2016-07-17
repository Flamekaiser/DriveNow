package com.drivenowac.dao.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.drivenowac.dao.AdminDAO;
import com.drivenowcore.ac.model.Admin;

public class AdminDAOImpl implements AdminDAO {

	@Autowired
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

}
