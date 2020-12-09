package com.team.team;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {

	@Autowired
	private DataSource ds;
	
	@Test
	public void testConnection() {
		try {
			Connection con = ds.getConnection();
			System.out.println("데이터베이스 접속 성공!");
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}
}
