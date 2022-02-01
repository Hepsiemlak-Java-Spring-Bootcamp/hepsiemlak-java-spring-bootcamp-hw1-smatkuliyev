package week1Homework;

public class Q01 {
    private static int count;

    public static void main(String[] args) {

        long num = 0;
        long numCount = 0;

        for (long i = 10; i < 100 ; i++) {
    //       System.out.println("For " + i + ":");
            count=0;
            isPolindrome(i);
    //        System.out.println(count + " times repeated");
    //        System.out.println("=========================");

            if(count>numCount){
                numCount=count;
                num=i;
            }

        }
        System.out.println("Most repeated number is: " + num);
        System.out.println(numCount + " times iteration");


    }

    private static void isPolindrome(long number) {

        String str1 = Long.toString(number);
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }

        if (str1.equals(str2)) {
    //        System.out.println(number + " is polindrome");
        } else {
            count++;
            long num = addReverse(number);
            isPolindrome(num);
        }

    }

    private static long addReverse(long number) {

        String str1 = Long.toString(number);
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
        long num1 = Long.parseLong(str1);
        long num2 = Long.parseLong(str2);

        return num1 + num2;
    }
}
