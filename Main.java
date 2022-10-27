package ships;

public class Main {

	public static void main(String[] args) {

		ShipPort mainPort = new ShipPort();

		Ship ship1 = new Ship(false, 10, mainPort, "Титаник");
		Ship ship2 = new Ship(true, 10, mainPort, "Лузитания");
		Ship ship3 = new Ship(false, 10, mainPort, "Наутилус");
		Ship ship4 = new Ship(true, 10, mainPort, "Нью-Джерси");

		Thread thread1 = new Thread(ship1);
		Thread thread2 = new Thread(ship2);
		Thread thread3 = new Thread(ship3);
		Thread thread4 = new Thread(ship4);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
