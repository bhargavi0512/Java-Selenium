package mypackage;

public class Atmtracker_Array {
	    public static void main(String[] args) {
	        
	        int[][] cash = {
	            {10, 20, 30},  
	            {5, 10, 15},   
	            {8, 5, 10}   
	        };

	        int[] denominations = {2000, 500, 100};

	        for (int i = 0; i < cash.length; i++) {
	            System.out.println("ATM " + (i + 1) + ":");
	            for (int j = 0; j < cash[i].length; j++) {
	                System.out.println("  ₹" + denominations[j] + " notes: " + cash[i][j]);
	            }
	            System.out.println();
	        }
	    }
	}


