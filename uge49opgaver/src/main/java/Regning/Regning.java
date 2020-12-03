package Regning;

public class Regning {
    public static void regning(int i, int j) {
        if ((i >= 1) && (i <= 50) && (j >= 1) && (j <= 50)) {
            System.out.println(i + j);
            System.out.println(i - j);
            System.out.println(i / j);
            System.out.println(i * j);
        } else {
            System.out.println("\nWrong");
        }
    }
}
