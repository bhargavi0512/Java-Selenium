package mypackage;

public class String1 {

	    public static void main(String[] args) {
	        String name = "Bhargavi Prasanna";

	        printOriginal(name);
	        countLength(name);
	        toUpper(name);
	        toLower(name);
	        reverseString(name);
	        containsWord(name, "Prasanna");
	    }

	    public static void printOriginal(String str) {
	        System.out.println("Original String: " + str);
	    }

	    public static void countLength(String str) {
	        System.out.println("Length: " + str.length());
	    }

	    public static void toUpper(String str) {
	        System.out.println("Uppercase: " + str.toUpperCase());
	    }
	    
	    public static void toLower(String str) {
	    	System.out.println("Lowercase: " +str.toLowerCase());
	    }

	    public static void reverseString(String str) {
	        String rev = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev += str.charAt(i);
	        }
	        System.out.println("Reversed String: " + rev);
	    }

	    public static void containsWord(String str, String word) {
	        if (str.contains(word)) {
	            System.out.println("The string contains '" + word + "'");
	        } else {
	            System.out.println("The string does not contain '" + word + "'");
	        }
	    }
	}


