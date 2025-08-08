package mypackage;

abstract class Game{
	abstract void start();
	abstract void play();
	abstract void end();
	
	public void run() {
		start();
		play();
		end();
	}
}
class Cricket extends Game{
	void start() {
		System.out.println(" Cricket game started ");
	}
	void play() {
		System.out.println(" Playing Cricket ");
	}
	void end() {
		System.out.println(" Cricket game Ended ");
	}
}
