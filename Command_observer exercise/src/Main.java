import Commands.Exercise;
import Commands.GetUpCommand;
import Commands.LayDownCommand;
import Interfaces.Command;
import Participants.FitnessInstructor;

public class Main {

	public static void main(String[] args) {

		FitnessInstructor fitnessInstructor = new FitnessInstructor();
		Exercise exercise = new Exercise();
		Command lightsOnCommand = new GetUpCommand(exercise);
		Command lightsOffCommand = new LayDownCommand(exercise);
		
		fitnessInstructor.setCommand(lightsOnCommand);
		fitnessInstructor.switchExercise();
		
		fitnessInstructor.setCommand(lightsOffCommand);
		fitnessInstructor.switchExercise();
	}

}
