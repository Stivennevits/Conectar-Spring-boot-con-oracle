package com.example.SP_ConSQL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpConSqlApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpConSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql =  "select * from CLIENTESITITOS";
		
		List<Clientesititos> clientesititos = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Clientesititos.class));
		
		clientesititos.forEach(System.out :: println);
	}
	
	

}
