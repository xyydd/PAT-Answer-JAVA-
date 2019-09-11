package Pat6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num <= 999) {
            Integer[] numArr = {0, 0, 0};
            int i = 0;
            while (num > 0) {
                numArr[i] = num % 10;
                num = num / 10;
                i++;
            }
            handleNum(numArr);
        }
    }
    public static void handleNum (Integer[] numArr) {
        String res, g, s, b;
        g = "";
        s = "";
        b = "";
        if (numArr[0] >= 1) {
            int a = 1;
            while (numArr[0] >= 1) {
                numArr[0] = numArr[0] - 1;
                g += String.valueOf(a);
                a += 1;
            }
        }
        if (numArr[1] >= 1) {
            for (int i = 0; i < numArr[1]; i++) {
                s += "S";
            }
        }
        if (numArr[2] >= 1) {
            for (int i = 0; i < numArr[2]; i++) {
                b += "B";
            }
        }
        System.out.println(b + s + g);
    }
}
