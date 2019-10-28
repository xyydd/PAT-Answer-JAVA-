package Pat7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num < 100000 && num >= 0) {
            int res = 0;
            Map<Integer, String> map = new HashMap<>();
            for (int i = 3; i <= num - 2; i++) {
                String a = i + "|" + (i + 2);
                map.put(i, a);
            }
            for (int i = 3; i <= num - 2; i++) {
                String[] str = map.get(i).split("\\|");
                int j = Integer.parseInt(str[0]);
                int k = Integer.parseInt(str[1]);
                if (isPrime(j) && isPrime(k)) {
                    res++;
                }
            }
            System.out.println(res);
        } else {
            System.out.println(0);
        }
    }
    public static Boolean isPrime (Integer a) {
        Boolean res = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                res = false && res;
            }
        }
        return res;
    }
}
