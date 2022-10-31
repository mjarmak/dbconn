package com.jarmak.dbconn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class DbconnApplication {

	private static final Logger logger = LoggerFactory.getLogger(DbconnApplication.class);

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(DbconnApplication.class, args);
	}

}
