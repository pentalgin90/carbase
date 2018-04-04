package by.htp.carparking.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.carparking.controller.command.*;
import by.htp.carparking.controller.command.impl.CarAll;

public class CommandProvider {
	
	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("carsAll",new CarAll());
		
	}

	Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		return command;
	}
	
}
