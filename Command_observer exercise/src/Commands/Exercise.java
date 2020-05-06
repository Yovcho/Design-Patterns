package Commands;

public class Exercise {
	private Boolean isLieDown;
	
	public void getUp() {
		System.out.println("getting up");
		this.isLieDown = false;
	}
	
	public void layDown() {
		System.out.println("laying down");
		this.isLieDown = true;
	}
}
