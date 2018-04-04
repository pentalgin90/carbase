package by.htp.carparking.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.api.jdbc.Statement;

import by.htp.carparking.dao.BaseDao;
import by.htp.carparking.domain.Car;


public class CarDBDaoImpl implements BaseDao<Car>{
	
	DaoConnectionHelper conect = new DaoConnectionHelper();
	
	@Override
	public void create(Car entity) {
		
		
	}

	@Override
	public Car read(int id) {
		
		return null;
	}

	@Override
	public List<Car> readAll() throws SQLException {
		List<Car> carAll = new ArrayList<Car>();
		Statement statement = (Statement) DaoConnectionHelper.connect().createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM cars;");
		while(rs.next()) {
			int idcar = rs.getInt(1);
			String model = rs.getString(2);
			String brands = rs.getString(3);
			carAll.add(new Car(idcar, model, brands));
		}
		
		return carAll;
		
	}

	@Override
	public void update(Car entity) {
		
		
	}

	@Override
	public void delete(int id) {
				
	}

}
