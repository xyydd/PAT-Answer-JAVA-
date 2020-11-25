package Pat7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int res = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                arr.add(i);
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) - arr.get(i) == 2) {
                res++;
            }
        }
        System.out.println(res);
    }
    public static Boolean isPrime (Integer a) {
        if (a % 2 == 0 && a != 2) {
            return false;
        }
        for (int i = 3; i <=Math.sqrt(a); i+=2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
