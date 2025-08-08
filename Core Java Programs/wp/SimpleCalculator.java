package wp;

public class SimpleCalculator {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Operation add = (a,b) -> a + b;
    	Operation sub = (a,b) -> a - b;
    	Operation mul = (a,b) -> a * b;
    	
    	int a = 10;
    	int b = 20;
    	
    	System.out.println("Addition:" +add.sum(a, b));
    	System.out.println("Subtraction:" +sub.sum(a, b));
    	System.out.println("Multiplication:" +mul.sum(a, b));
	}
}


