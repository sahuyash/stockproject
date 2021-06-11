package com.stockproject.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringRestMySqlApplication implements CommandLineRunner {

	@Autowired
	 private JdbcTemplate jdbcTemplate;
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringRestMySqlApplication.class, args);
		//System.out.println("in main");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into stockproject.sectordb (id,brief,sector_name) values (?,?,?)";
		int result= jdbcTemplate.update(sql,19,"pharma","xyz");
		if(result>0) {
			System.out.println("Row inserted");
		}
	}
}
