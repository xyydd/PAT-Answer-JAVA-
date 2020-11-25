package Pat10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] arr = s.split("\\s+");
        int[] inArr = new int[100];
        int[] outArr = new int[100];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            inArr[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < inArr.length - 1; i+=2) {
            int a = inArr[i] * inArr[i + 1];
            if (a != 0) {
                outArr[index] = a;
                outArr[index + 1] = inArr[i + 1] - 1;
                index += 2;
            }
        }
        if (index > 0) {
            for (int i = 0; i < index - 1; i++) {
                System.out.print(outArr[i] + " ");
            }
            System.out.print(outArr[index - 1]);
        } else {
            System.out.println("0 0");
        }
    }
}
