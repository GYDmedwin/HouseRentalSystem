package com.rental.utils;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;


public class JDBCUtils {
	
	private static BasicDataSource dataSource = new BasicDataSource();
	
	static{
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/renting_system");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		dataSource.setInitialSize(10);
		dataSource.setMaxActive(10);
		dataSource.setMaxIdle(8);
		dataSource.setMinIdle(2);
	}
	
	public static DataSource getDataSource(){
		return dataSource;
	}

}
