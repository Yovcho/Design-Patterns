package Participants;

import Interfaces.Observable;
import Interfaces.Observer;

public class OnlineViewers implements Observer
{

    private String name;
    private Observable trainee;

    public OnlineViewers(String name) {
        this.setName(name);
    }
	@Override
	public void update() {
		if (trainee == null) {
            System.out.println("trainee is not here");
            return;
        }
        String exercise = trainee.getUpdate();
        System.out.println(this.getName() + " is notified with the new exercise. " + "What to do : " + exercise);
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee=trainee;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
