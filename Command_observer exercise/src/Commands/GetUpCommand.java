package Commands;

import Interfaces.Command;

public class GetUpCommand implements Command {

	private Exercise exercise;
	
	public GetUpCommand(Exercise exercise)
	{
		this.exercise = exercise;
	}
	@Override
	public String execute() 
	{
		return this.exercise.getUp();
	}

}
