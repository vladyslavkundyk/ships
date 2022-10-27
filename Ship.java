package ships;

public class Ship implements Runnable {

	private boolean shipTurn;
	private int boxesPerShip;
	private ShipPort shipPort;
	private String shipName;

	public Ship(boolean shipTurn, int boxesPerShip, ShipPort shipPort, String shipName) {
		super();
		this.shipTurn = shipTurn;
		this.boxesPerShip = boxesPerShip;
		this.shipPort = shipPort;
		this.shipName = shipName;
	}

	public boolean getShipTurn() {
		return shipTurn;
	}

	public void setShipTurn(boolean shipTurn) {
		this.shipTurn = shipTurn;
	}

	public int getBoxesPerShip() {
		return boxesPerShip;
	}

	public void setBoxesPerShip(int boxesPerShip) {
		this.boxesPerShip = boxesPerShip;
	}

	public ShipPort getShipPort() {
		return shipPort;
	}

	public void setShipPort(ShipPort shipPort) {
		this.shipPort = shipPort;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	@Override
	public void run() {
		try {
			shipPort.dockService(this);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
