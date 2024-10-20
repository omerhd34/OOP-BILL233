package MEDIUM.BookExercises4;

public class DeMorgansLaws {
    public static void main(String[] args) {
        int x = 4, y = 7;
        int a = 3, b = 3, g = 5;
        int i = 5, j = 6;

        // (a) İfadesi
        boolean originalA = !(x < 5) && !(y >= 7);
        boolean demorganA = (x >= 5) || (y < 7);
        System.out.printf("(a) Original: %b, De Morgan: %b\n", originalA, demorganA);

        // (b) İfadesi
        boolean originalB = !(a == b) || !(g != 5);
        boolean demorganB = (a != b) || (g == 5);
        System.out.printf("(b) Original: %b, De Morgan: %b\n", originalB, demorganB);

        // (c) İfadesi
        boolean originalC = !((x <= 8) && (y > 4));
        boolean demorganC = (x > 8) || (y <= 4);
        System.out.printf("(c) Original: %b, De Morgan: %b\n", originalC, demorganC);

        // (d) İfadesi
        boolean originalD = !((i > 4) || (j <= 6));
        boolean demorganD = (i <= 4) && (j > 6);
        System.out.printf("(d) Original: %b, De Morgan: %b\n", originalD, demorganD);
    }
}
/*
(a) Original: false, De Morgan: false
(b) Original: true, De Morgan: true
(c) Original: false, De Morgan: false
(d) Original: false, De Morgan: false
*/