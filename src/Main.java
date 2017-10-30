public class Main {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入成績");
        int grade = sc.nextInt();

        if (grade >= 60) {
            System.out.println("成績及格:" + grade);
        } else
            System.out.println("成績不及格:" + grade);

        System.out.println("End");


        }
    }

