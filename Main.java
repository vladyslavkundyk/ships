package ships;

public class Main {

	public static void main(String[] args) {

		ShipPort mainPort = new ShipPort();

		Ship ship1 = new Ship(0, 10, mainPort, "Титаник");
		Ship ship2 = new Ship(1, 10, mainPort, "Лузитания");
		Ship ship3 = new Ship(2, 10, mainPort, "Наутилус");
		
		Ship ship4 = new Ship(0, 10, mainPort, "Нью-Джерси");
		Ship ship5 = new Ship(1, 10, mainPort, "Лексингтон");
		Ship ship6 = new Ship(2, 10, mainPort, "Миссури");

		Thread thread1 = new Thread(ship1);
		Thread thread2 = new Thread(ship2);
		Thread thread3 = new Thread(ship3);
		
		Thread thread4 = new Thread(ship4);
		Thread thread5 = new Thread(ship5);
		Thread thread6 = new Thread(ship6);

		thread1.start();
		thread2.start();
		thread3.start();
		
		thread4.start();
		thread5.start();
		thread6.start();
	}
}
