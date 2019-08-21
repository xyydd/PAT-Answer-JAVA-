package Pat3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0 && num < 10) {
            while (in.hasNextLine()) {
                int i = 0;
                String[] str = new String[num];
                while (i < num) {
                    String s = in.nextLine();
                    if (!s.equals("\\n") && !s.equals("") && s.length() <= 100) {
                        str[i] = s;
                        i++;
                    }
                }
                String pattern = "^((A*))P(A{1,2})T((A*))$";
                Pattern r = Pattern.compile(pattern);
                for (i = 0; i < num; i++) {
                    Matcher m = r.matcher(str[i]);
                    System.out.println(m.matches() ? "YES" : "NO");
                }
            }
        } else {
            System.out.println("No");
        }
    }
}
