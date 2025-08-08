package mypackage;

public class Voter {
	    private String name;
	    private int voterId;
	    private boolean hasVoted;
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setVoterId(int id) {
	        voterId = id;
	    }
        public void setHasVoted(boolean voted) {
	        hasVoted = voted;
	    }
	    public String getName() {
	        return name;
	    }
        public int getVoterId() {
	        return voterId;
	    }
        public boolean getHasVoted() {
	        return hasVoted;
	    }
}

	