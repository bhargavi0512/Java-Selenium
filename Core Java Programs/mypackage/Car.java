package mypackage;

public class Car {
	private boolean enginestatus;
	private int speed;
	private double fuellevel;
	public void setEngineStatus(boolean enginestatus) {
		   this.enginestatus  = enginestatus;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	public void setFuelLevel(double fuellevel) {
		this.fuellevel = fuellevel;
	}
	public boolean getEngineStatus() {
		return enginestatus;
	}
	public int getSpeed() {
		return speed;
	}
	public double getFuelLevel() {
		return fuellevel;
	}

}
