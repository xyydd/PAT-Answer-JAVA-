package Pat12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A1 = 0;
        int A2 = 0;
        int A2State = 0; // 0 为 +，1为-
        int A3 = 0;
        float A4 = 0;
        int A4Num = 0;
        int A5 = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a % 5 == 0 && a % 2 == 0) {
                A1 += a;
            }
            if (a % 5 == 1) {
                if (A2State == 0) {
                    A2 += a;
                } else {
                    A2 -= a;
                }
                A2State = 1 - A2State;
            }
            if (a % 5 == 2) {
                A3++;
            }
            if (a % 5 == 3) {
                A4 += a;
                A4Num++;
            }
            if (a % 5 == 4 && a > A5) {
                A5 = a;
            }
        }
        if (A1 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(A1 + " ");
        }
        if (A2 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(A2 + " ");
        }
        if (A3 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(A3 + " ");
        }
        if (A4 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(String .format("%.1f", A4 / A4Num) + " ");
        }
        if (A5 == 0) {
            System.out.print("N");
        } else {
            System.out.print(A5);
        }
    }
}
