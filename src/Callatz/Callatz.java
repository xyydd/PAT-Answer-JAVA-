package Callatz;

import java.util.Scanner;

public class Callatz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n > 1) {
                int number = 0;
                do {
                    if (n % 2 == 1) {
                        n = (3 * n + 1) / 2;
                    } else {
                        n = n / 2;
                    }
                    number ++;
                } while (n > 1);
                System.out.println(number);
            } else {
                System.out.println(0);
            }
        }
    }
}
