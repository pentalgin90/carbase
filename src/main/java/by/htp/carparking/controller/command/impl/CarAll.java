package by.htp.carparking.controller.command.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.carparking.controller.command.Command;
import by.htp.carparking.dao.impl.CarDBDaoImpl;
import by.htp.carparking.domain.Car;

public class CarAll implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		
		CarDBDaoImpl carDBDaoImpl = new CarDBDaoImpl();
		
		List<Car> readAll = carDBDaoImpl.readAll();
		
		readAll.forEach(car -> System.out.println(car.toString()));
		String goToPage = null;
		if(readAll != null) {
			request.setAttribute("listcar", readAll);
			goToPage="/WEB-INF/jsp/listCar.jsp";
		}else {
			goToPage="error.jsp";
		}
		
	}

	
	
}
