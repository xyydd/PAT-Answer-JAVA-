package Pat11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            System.out.println("Case #" + (i + 1) + ": " + (a + b > c));
        }
    }
}
