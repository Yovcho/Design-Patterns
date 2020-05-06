package Participants;

import Interfaces.Command;

public class FitnessInstructor {
	
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void switchExercise() {
		System.out.println("Switching the exercise.");
		this.command.execute();
	}
}
