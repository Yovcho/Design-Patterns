package Commands;

public class Exercise {
	private Boolean isLieDown;
	
	public String getUp() {
		System.out.println("Exercise is now getting up.");
		this.isLieDown = false;
		return "get up";
			
	}
	
	public String layDown() {
		System.out.println("Exercise is now laying down.");
		this.isLieDown = true;
		return "lay down";
	}
	
}
