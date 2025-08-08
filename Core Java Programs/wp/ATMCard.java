package wp;

import java.util.Scanner;

class InvalidPinException extends Exception {
 public InvalidPinException(String message) {
     super(message);
 }
}

public class ATMCard {
 public static void main(String[] args) {
     final int correctPIN = 1234;
     Scanner sc = new Scanner(System.in);

     System.out.println("Insert your ATM card...");
     System.out.print("Enter your 4-digit PIN: ");

     try {
         int enteredPIN = sc.nextInt();

         if (enteredPIN != correctPIN) {
             throw new InvalidPinException("Incorrect PIN entered.");

         }

         System.out.println("PIN accepted.");
     } 
     catch (InvalidPinException e) {
         System.out.println("Error: " + e.getMessage());
     } 
     catch (Exception e) {
         System.out.println("Invalid input. Please enter numbers only.");
     } 
     finally {
         System.out.println("Transaction attempt logged.");
         sc.close();
     }
 }
}