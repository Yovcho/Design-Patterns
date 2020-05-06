import java.util.ArrayList;
import java.util.List;

import Commands.Exercise;
import Commands.GetUpCommand;
import Commands.LayDownCommand;
import Interfaces.Command;
import Participants.FitnessInstructor;
import Participants.OnlineViewers;
import Participants.Trainee;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		FitnessInstructor fitnessInstructor = new FitnessInstructor();
		Exercise exercise = new Exercise();
	    Trainee trainee = new Trainee();
	    
        List<Command> exercises = new ArrayList<Command>();
        List<OnlineViewers> viewers = new ArrayList<OnlineViewers>();

        exercises.add(new LayDownCommand(exercise));
        exercises.add(new GetUpCommand(exercise));

        viewers.add(new OnlineViewers("Gosho"));
        viewers.add(new OnlineViewers("Pesho"));
        viewers.add(new OnlineViewers("Ivan"));

        for (OnlineViewers viewer : viewers) {
            trainee.subscribe(viewer);
        }

        while (true) {
            for (Command command : exercises) {
            	fitnessInstructor.setCommand(command);
            	trainee.doExercise(fitnessInstructor.switchExercise());
                System.out.println();

                Thread.sleep(3000);
            }
        }
	}

}
