package mypackage;

public class String3 {
	    public static void main(String[] args) {
	        StringBuffer report = new StringBuffer();

	        report.append("Employee Profile Report\n");
	        report.append("--------\n");
	        report.append("Name       : Munny\n");
	        report.append("ID         : 101\n");
	        report.append("Department : IT\n");
	        report.append("Position   : Developer\n");

	        int position = report.indexOf("Department");
	        report.insert(position, "Location   : Vijayawada\n");

	        int start = report.indexOf("Developer");
	        int end = start + "Developer".length();
	        report.replace(start, end, "Team Lead");

	        int delStart = report.indexOf("ID");
	        int delEnd = report.indexOf("\n", delStart) + 1;
	        report.delete(delStart, delEnd);

	        System.out.println(report.toString());
	    }
	}


