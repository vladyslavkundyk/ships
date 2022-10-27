package ships;

public class ShipPort {

	private ShipDock[] docks = { new ShipDock(1, "Осн"), new ShipDock(2, "Доп") };

	public void dockService(Ship ship) throws InterruptedException {

		if (ship.getShipTurn() == true) {
			docks[0].unloadShip(ship);
		} else {
			docks[1].unloadShip(ship);
		}
	}
}
