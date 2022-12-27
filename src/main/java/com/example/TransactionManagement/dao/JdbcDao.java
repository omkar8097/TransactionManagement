package com.example.TransactionManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class JdbcDao {

	@Autowired
	JdbcTemplate j;
	
	public String get() {
		String aa = j.query("select * from omkarscchma.table1", rs ->{
			System.out.println(rs.next());
			System.out.println(rs.getString(2));
			return rs.getString(2);
		});
		System.out.println(aa);
		return aa;
	}
	
	public List<String> gets() {
		List<String> list = j.query("select * from omkarscchma.table1", (rs, rowNum) ->{
			
			return rs.getString(2);
		});
		
		return list;
	}
	
	
	
	public int insert(String a) {
		int t = j.update("INSERT INTO omkarscchma.table1(  name ) VALUES ( '"+a+"' )");
		
		return t;
	}
	
	
	public int insert1(String a) {
		int t = j.update("INSERT INTO omkarscchma.table1(  name ) VALUES (' "+a+" ')");
		
		return t;
	}
	
	
}
