package Commands;

import Interfaces.Command;

public class GetUpCommand implements Command {

	private Exercise exercise;
	
	public GetUpCommand(Exercise exercise)
	{
		this.exercise = exercise;
	}
	@Override
	public void execute() 
	{
		this.exercise.getUp();
	}

}
