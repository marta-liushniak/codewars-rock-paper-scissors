package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(rps("paper", "scissors"));
    }

    public static String rps(String p1, String p2) {
        return p1.equals(p2) ? "Draw!" : (p1.equals("scissors") && p2.equals("paper")
                || p1.equals("rock") && p2.equals("scissors")
                ||(p1.equals("paper") && p2.equals("rock")) ? "Player 1 won!" : "Player 2 won!");
    }
}
