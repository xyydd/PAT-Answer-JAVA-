package Pat4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 0;
        String[] str = new String[num];
        int max = -1;
        String maxName = "", maxId = "";
        int min = 101;
        String minName = "", minId = "";
        while (i < num) {
            String name = in.next();
            String id = in.next();
            int score = in.nextInt();
            if (score < min) {
                minName = name;
                minId = id;
                min = score;
            }
            if (score > max) {
                maxName = name;
                maxId = id;
                max = score;
            }
            i++;
        }
        System.out.println(maxName+" "+maxId);
        System.out.println(minName+" "+minId);
    }
}
//
//public class Main {
//
//    private static class student{
//        String name;
//        String id;
//        int score;
//    }
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int maxScore = -1;
//        int maxId = 0;
//        int minScore = 101;
//        int minId = 0;
//        student[] s = new student[n];
//        for(int i=0;i<n;i++) {
//            s[i]=new student();
//            s[i].name=sc.next();
//            s[i].id=sc.next();
//            s[i].score=sc.nextInt();
//            if(s[i].score>maxScore) {
//                maxScore=s[i].score;
//                maxId=i;
//            }
//            if(s[i].score<minScore){
//                minScore=s[i].score;
//                minId=i;
//            }
//        }
//        System.out.println(s[maxId].name+" "+s[maxId].id);
//        System.out.println(s[minId].name+" "+s[minId].id);
//    }
//}
