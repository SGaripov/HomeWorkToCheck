package lesson1.ReverseNumber;

// Переворот числа с выводом промежуточных значений vvv
public class ReverseNumber {

    public static void main(String[] args) {

        int a=614, rev=0;

        if ( a >= 100 && a<= 999) {

            rev=rev*10+a%10; // rev=4

            System.out.println(rev);

            a=a/10;           // a=61

            System.out.println(a);

            rev=rev*10+a%10; // rev=41

            System.out.println(rev);

            a=a/10;           // a= 6

            System.out.println(a);

            rev=rev*10+a%10; // rev= 416

            System.out.println(rev);
  
            a=a/10;
            System.out.println(a);
        }
        System.out.println("Reversed Number: " + rev);
    }
}

