package dogDoor.model;

public class Remote {
	
	private DogDoor door;
	
	public Remote(DogDoor door) {
		super();
		this.door = door;
	}
	
	public void pressButton() {
		if (!door.isOpen()) {
			door.open(); 
		} else {
			door.close();
		}
	}

}
