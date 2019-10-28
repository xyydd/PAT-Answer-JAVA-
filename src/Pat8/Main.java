package Pat8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while (i < n) {
            arr[i] = in.nextInt();
            i++;
        }
        int temp = arr[n - 1];
        for (int j = 0; j < m; j++) {
            for (i = 0; i < n; i++) {
                if (i == 0) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                } else if (i < (n - 1)) {
                    int t2 = arr[i + 1];
                    arr[i + 1] = temp;
                    temp = t2;
                } else {
                    arr[0] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if (i < (n -1)) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
