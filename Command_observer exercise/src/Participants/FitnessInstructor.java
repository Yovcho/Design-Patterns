package Participants;

import Interfaces.Command;

public class FitnessInstructor {
	
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public String switchExercise() {
		System.out.println("Fitness Instructor is switching the exercise.");
		return this.command.execute();
	}
}
