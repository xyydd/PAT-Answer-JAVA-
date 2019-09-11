package Pat5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Integer[] arr = new Integer[num];
        int i = 0;
        while (i < num) {
            int s = in.nextInt();
            arr[i] = s;
            i++;
        }
        int len = arr.length;
        if (len == num) {
            Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
            for (i = 0; i < len; i++) {
                int n = arr[i];
                map.put(n, false);
            }
            for (i = 0; i < len; i++) {
                int n = arr[i];
                do {
                    if (n % 2 == 1) {
                        n = (3 * n + 1) / 2;
                    } else {
                        n = n / 2;
                    }
                    if (map.get(n) != null) {
                        map.put(n, true);
                    }
                } while (n > 1);
            }
            String res = "";
            int prev = 0;
            for (int key : map.keySet()) {
                if (map.get(key) == false) {
                    if (res.length() <= 0) {
                        res = key + "";
                    } else {
                        if (prev < key) {
                            res = key + " " + res;
                        } else {
                            res = res + " " + key;
                        }
                    }
                    prev = key;
                }
            }
            System.out.println(res);
        }
    }
}
