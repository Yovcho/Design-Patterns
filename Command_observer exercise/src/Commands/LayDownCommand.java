package Commands;

import Interfaces.Command;

public class LayDownCommand implements Command {

	private Exercise exercise;
	
	public LayDownCommand(Exercise exercise)
	{
		this.exercise = exercise;
	}
	@Override
	public void execute() 
	{
		this.exercise.layDown();
	}
}
