package wp;
import java.util.HashMap;
import java.util.Scanner;

class Scoreboard {
    HashMap<String, Integer> scores;

    public Scoreboard() {
        scores = new HashMap<>();
    }

    public void addPlayer(String name, int score) {
        scores.put(name, score); 
    }

    public void updateScore(String name, int extra) {
        if (scores.containsKey(name)) {
            int current = scores.get(name); 
            scores.put(name, current + extra);
        } else {
            System.out.println("Player not found.");
        }
    }

    public void display() {
        System.out.println("\n--- Final Scoreboard ---");
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scoreboard sb = new Scoreboard(); 

        System.out.print("Enter player 1 name: ");
        System.out.print("Enter score: ");
        String p1 = sc.nextLine();
        int s1 = sc.nextInt();
        sc.nextLine();
        sb.addPlayer(p1, s1);

        System.out.print("Enter player 2 name: ");
        System.out.print("Enter score: ");
        String p2 = sc.nextLine();
        int s2 = sc.nextInt();
        sc.nextLine();
        sb.addPlayer(p2, s2);

        System.out.print("Enter player name to update score: ");
        String name = sc.nextLine();
        System.out.print("Enter extra runs: ");
        int extra = sc.nextInt();

        sb.updateScore(name, extra);

        sb.display();
    }
}

