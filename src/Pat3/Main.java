package Pat3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0 && num < 10) {
            int i = 0;
            String[] str = new String[num];
            while (i < num) {
                String s = in.next();
                if (!s.equals("\\n") && !s.equals("") && s.length() <= 100) {
                    str[i] = s;
                    i++;
                }
            }
            for (i = 0; i < num; i++) {
                passString(str[i]);
            }
        } else {
            System.out.println("NO");
        }
    }
    public static void passString (String s) {
        int NumA = 0, NumP = 0, NumT = 0;
        int PoiP = 0, PoiT = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                NumA++;
            }
            if (s.charAt(i) == 'P') {
                NumP++;
                PoiP = i;
            }
            if (s.charAt(i) == 'T') {
                NumT++;
                PoiT = i;
            }
            if (NumA + NumP + NumT == n && NumA != 0 && NumP == 1 && NumT == 1 && PoiT - PoiP > 1 && PoiP * (PoiT - PoiP - 1) == (n - PoiT - 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
