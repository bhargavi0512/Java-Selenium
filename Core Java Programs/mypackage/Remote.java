package mypackage;

import java.util.Scanner;

abstract class Remote {
    abstract void pressButton();
	}

	class ACRemote extends Remote {
	    void pressButton() {
	        System.out.println("AC turned ON.");
	    }
	}

	