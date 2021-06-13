package com.stockproject.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApplication {

	public static void main(String[] args) {
		System.out.println("in main");
		SpringApplication.run(SpringRestApplication.class, args);
		System.out.println("out main");
	}

//@Override
	/// public void run(String... args) throws Exception {
	// // TODO Auto-generated method stub
	// String sql="insert into stockproject.sectordb (id,brief,sector_name) values
	/// (?,?,?)";
	// int result= jdbcTemplate.update(sql,28,"harshit","dasd");
	// if(result>0) {
	// System.out.println("Row inserted");
	// }
//}
}
