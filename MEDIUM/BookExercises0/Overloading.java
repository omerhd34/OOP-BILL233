package MEDIUM.BookExercises0;

public class Overloading {

    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public static void team(String team1, String team2, String score) {
        System.out.println(team1 + " ve " + team2 + " maçının skoru : " + score);
    }

    public static void team(String team1, String team2) {
        System.out.println(team1 + " ♥ " + team2);
    }

    public static void main(String[] args) {
        add(5, 9);
        add(5, 9, 2);
        team("BJK", "FB", "3-1");
        team("BJK", "GS");
    }
}
