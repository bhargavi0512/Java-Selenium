package mypackage;

public class StringFunction {
	public static void main(String[]args) {
	String str = " Munny Reddy ";
	
	System.out.println(" Length: " + str.length());
	System.out.println(" CharAt(2): " + str.charAt(2));
	System.out.println(" Substring(2): " + str.substring(2));
	System.out.println(" concat: " + str.concat("Vemireddy"));
	
	String str2 = "Bhargavi Reddy";
    System.out.println("Equals: " + str.equals(str2));                   
    System.out.println("EqualsIgnoreCase: " + str.trim().equalsIgnoreCase(str2)); 

    
    System.out.println("IndexOf('u'): " + str.indexOf('u'));             
    System.out.println("LastIndexOf('y'): " + str.lastIndexOf('y'));     
    System.out.println("Contains 'Reddy': " + str.contains("Reddy"));    
    System.out.println("StartsWith 'Mu': " + str.trim().startsWith("Mu"));
    System.out.println("EndsWith 'dl': " + str.trim().endsWith("dl"));   

	
	
    System.out.println(" toUpper: " + str.toUpperCase());
	System.out.println(" tolower: " + str.toLowerCase());
	
	
	System.out.println(" trim: " + str.trim());
	System.out.println(" Replace 'n' with 'x': " + str.replace('n','x'));
	System.out.println(" ReplaceAll 'y' with 'b': " + str.replaceAll("y","b"));
	

    
    String[] parts = str.trim().split(" ");                              
    System.out.println("Split: " + java.util.Arrays.toString(parts));
    String joined = String.join("-", parts);                             
    System.out.println("Join with '-': " + joined);
    
   
    
    System.out.println("Matches '.Munny Reddy.': " + str.matches(".Munny Reddy.")); 

    
    String interned = str.intern();                                      
    System.out.println("Interned: " + interned);
    System.out.println("IsEmpty: " + str.isEmpty());                     
    System.out.println("IsBlank (Java 11+): " + str.isBlank());   
	}
}



