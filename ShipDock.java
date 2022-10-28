package ships;

public class ShipDock {

	private int dockNumber;
	private String dockName;

	public ShipDock(int dockNumber, String dockName) {
		super();
		this.dockNumber = dockNumber;
		this.dockName = dockName;
	}

	public int getDockNumber() {
		return dockNumber;
	}

	public void setDockNumber(int dockNumber) {
		this.dockNumber = dockNumber;
	}

	public String getDockName() {
		return dockName;
	}

	public void setDockName(String dockName) {
		this.dockName = dockName;
	}

	public synchronized void unloadShip(Ship ship) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			ship.setBoxesPerShip(10 - i);
			System.out.println("Док " + dockNumber + " - " + dockName + ", корабль " + ship.getShipName() + ", ящиков: " + ship.getBoxesPerShip());
			Thread.sleep(100);
		}
		System.out.println(ship.getShipName() + " завершил выгрузку в доке " + dockNumber + " - " + dockName);
	}
}
