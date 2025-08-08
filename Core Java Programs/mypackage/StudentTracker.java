package mypackage;

public class StudentTracker {
	    public static void main(String[] args) {
	        int[][] classes = new int[3][];

	      
	        classes[0] = new int[]{101, 102};

	        
	        classes[1] = new int[]{201, 202, 203, 204};

	       
	        classes[2] = new int[]{301};

	        
	        for (int i = 0; i < classes.length; i++) {
	            System.out.print("Class " + (i + 1) + " students: ");
	            for (int j = 0; j < classes[i].length; j++) {
	                System.out.print(classes[i][j] + " ");
	            }
	            System.out.println(); 
	        }
	    }
	}


