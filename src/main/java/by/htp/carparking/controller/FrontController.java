package by.htp.carparking.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.carparking.controller.command.Command;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private final CommandProvider provider = new CommandProvider();
	
	public FrontController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		String command = request.getParameter("command");
		Command commandObject = provider.getCommand(command);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String command = request.getParameter("command");
		Command commandObject = provider.getCommand(command);
		try {
			commandObject.execute(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
