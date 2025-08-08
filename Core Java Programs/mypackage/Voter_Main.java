package mypackage;

public class Voter_Main {
	    public static void main(String[] args) {
	        Voter user = new Voter();

	        user.setName("Bhargavi");
	        user.setVoterId(12345);
	        user.setHasVoted(true); 
	        System.out.println("Name: " + user.getName());
	        System.out.println("Voter ID: " + user.getVoterId());
	        System.out.println("Has Voted: " + user.getHasVoted());
	    }

}



