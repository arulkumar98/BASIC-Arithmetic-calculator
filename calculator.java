import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        // here I am going to make a calculator using Nested if-else
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number one :");
        int num1 = in.nextInt();
        System.out.println("Current version Supported operator +,-,*,/,Reminder % ");
        System.out.print("Enter the Math operator :");
        char op = in.next().trim().charAt(0);
        System.out.print("Enter the Number two :");
        int num2 = in.nextInt();
        int ans = 0;

        if (op == '+'){
           ans = num1+num2;

         } else if (op == '-') {
            ans = num1-num2;

            }else if (op == '*') {
              ans = num1 * num2;

             }else if (op == '/') {
               ans = num1 / num2;

               }else if ( op == '%') {
                  ans = num1 % num2;
                 }else System.out.println("Sorry our current version app not support this feature");

        System.out.println("Answer is " +ans);

    }
}
