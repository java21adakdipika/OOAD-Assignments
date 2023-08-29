package dogDoor.test;

import dogDoor.model.DogDoor;
import dogDoor.model.Remote;

public class DogDoorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		remote.pressButton();
		remote.pressButton();
		remote.pressButton();

	}

}
