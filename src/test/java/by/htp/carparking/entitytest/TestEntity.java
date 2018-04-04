package by.htp.carparking.entitytest;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mysql.cj.api.jdbc.Statement;

import by.htp.carparking.dao.impl.CarDBDaoImpl;
import by.htp.carparking.dao.impl.DaoConnectionHelper;
import by.htp.carparking.domain.Car;

public class TestEntity {

	
	@Test
	public void properties() {
		DaoConnectionHelper dch = new DaoConnectionHelper();
		
		System.out.println(dch.getUrl());
	}
	
	
	@Test
	public void findAllCarsTest() throws SQLException {
		CarDBDaoImpl dao = new CarDBDaoImpl();
		
		List<Car> cars = dao.readAll();
		
		cars.forEach(car -> System.out.println(car.toString()));
		
		assertTrue(cars.size() == 3);
	}
 	
	
	
}
