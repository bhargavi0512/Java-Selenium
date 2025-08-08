package mypackage;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("You: ");
        String input = scanner.nextLine().toLowerCase();

        if (input.equals("hi") || input.equals("hello")) {
            System.out.println("Bot: Hello! ");
        } else {
            System.out.println("Bot: I don’t understand.");
        }

        scanner.close();
    }
}