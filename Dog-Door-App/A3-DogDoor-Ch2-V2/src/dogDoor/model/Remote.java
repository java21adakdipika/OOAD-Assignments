package dogDoor.model;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
	
	private DogDoor door;
	
	public Remote(DogDoor door) {
		super();
		this.door = door;
	}
	
	public void pressButton() {
		Timer timer = new Timer();  
		if (!door.isOpen()) {
			door.open();
			
			timer.schedule(new TimerTask(){  // timer.schehule(*task Object*, *how much to wait before executing task object*)
				@Override
				public void run() {
					// TODO Auto-generated method stub
					if (door.isOpen()) {
						System.out.println("Time to close the door automatically");
						door.close();
						timer.cancel(); 	  // turn off the timer
					}
				}
			}, 5000);
		} else {
			door.close();
			timer.cancel();
		}
	}

}
