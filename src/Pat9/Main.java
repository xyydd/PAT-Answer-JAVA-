package Pat9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] str = s.split("\\s+");
        for (int i = str.length - 1; i > 0; i--) {
            System.out.print(str[i] + " ");
        }
        System.out.println(str[0]);
    }
}
