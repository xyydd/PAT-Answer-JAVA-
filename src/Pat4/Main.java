package Pat4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0 && num <= 100) {
            int i = 0;
            String[] str = new String[num];
            while (i < num) {
                String s = in.nextLine();
                if (!s.equals("\\n") && !s.equals("")) {
                    str[i] = s;
                    i++;
                }
            }
            sortGrade(str);
        }
    }
    public static void sortGrade (String[] sArr) {
        int len = sArr.length;
        String[] z = sArr[0].split(" ");
        String max = z[0] + " " + z[1];
        String min = z[0] + " " + z[1];
        int maxGrade = Integer.parseInt(z[2]);
        int minGrade = Integer.parseInt(z[2]);
        for (int i = 0; i < len; i++) {
            String s = sArr[i];
            String[] splitS = s.split(" ");
            int grade = Integer.parseInt(splitS[2]);
            if (grade > maxGrade) {
                maxGrade = grade;
                if (splitS[0].length() <= 10 && splitS[1].length() <= 10) {
                    max = splitS[0] + " " + splitS[1];
                }
            }
            if (grade < minGrade) {
                minGrade = grade;
                if (splitS[0].length() <= 10 && splitS[1].length() <= 10) {
                    min = splitS[0] + " " + splitS[1];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
