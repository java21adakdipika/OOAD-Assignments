package dogDoor.test;

import dogDoor.model.DogDoor;
import dogDoor.model.Remote;

public class DogDoorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		System.out.println("Doggy Barks ");
		remote.pressButton();
		System.out.println("Doggy is still playing");
//		remote.pressButton();  // manually closing
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		
		System.out.println("Doogy is Stuck!!");
		System.out.println("Doggy is barking");
		remote.pressButton();

	}

}
