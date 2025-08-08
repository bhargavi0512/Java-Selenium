package mypackage;

public class Attendance_Array {
	    public static void main(String[] args) {
	        char[] attendance = {'P', 'P', 'A', 'P', 'P', 'A', 'P'};
	        System.out.println("Attendance for the week:");
	        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	        for (int i = 0; i < 7; i++) {
	            System.out.println(days[i] + ": " + attendance[i]);
	        }
	    }
	}



