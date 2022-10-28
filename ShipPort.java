package ships;

public class ShipPort {

	private ShipDock[] docks = { new ShipDock(1, "Осн"), new ShipDock(2, "Доп"), new ShipDock(3, "Спец") };

	public void dockService(Ship ship) throws InterruptedException {

//		if (ship.getShipTurn() == true) { // Через true/false если дока всего 2
//			docks[0].unloadShip(ship);
//		} else {
//			docks[1].unloadShip(ship);
//		}
		
		if (ship.getShipTurn() == 0) { // Если доков больше чем 2
			docks[0].unloadShip(ship);
		} else if (ship.getShipTurn() == 1) {
			docks[1].unloadShip(ship);
		} else {
			docks[2].unloadShip(ship);
		}
	}
}
