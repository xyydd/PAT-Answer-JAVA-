package Pat2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("0", "ling");
        m.put("1", "yi");
        m.put("2", "er");
        m.put("3", "san");
        m.put("4", "si");
        m.put("5", "wu");
        m.put("6", "liu");
        m.put("7", "qi");
        m.put("8", "ba");
        m.put("9", "jiu");
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            int len = str.length();
            int res = 0;
            for (int i = 0; i < len; i++) {
                res += Integer.parseInt(str.substring(i, i + 1));
            }
            String result = res + "";
            len = result.length();
            for (int i = 0; i < len; i++) {
                String s = result.substring(i, i + 1);
                if (i == (len - 1)) {
                    System.out.print( m.get(s) );
                } else {
                    System.out.print( m.get(s) + " " );
                }
            }
        }
    }
}
