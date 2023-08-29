package dogDoor.model;

public class DogDoor {
	
	private boolean open = false;
	
	public void open() {
		System.out.println("Dog door opens");
		open = true;
	}
	
	public void close() {
		System.out.println("Dog door closes");
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}

}
