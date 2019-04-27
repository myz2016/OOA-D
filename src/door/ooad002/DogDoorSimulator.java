package door.ooad002;

public class DogDoorSimulator {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println("Fido barks to go outside...");
		remote.pressButton();
		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido is all done...");
		try {
			Thread.currentThread().sleep(1000 * 10);
		} catch (InterruptedException e) {}
		System.out.println("...but he is stuck outside!");	//狗被卡在了外面
		System.out.println("\nFido starts barking....");	//狗开始叫唤了
		System.out.println("...so Gina grabs the remote control..");
		remote.pressButton();
		System.out.println("\nFido is back inside...");		
	}
}
