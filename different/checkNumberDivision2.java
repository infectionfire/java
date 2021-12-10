/*
На вход подаётся целое число. Выведите "YES", если оно нацело делится на 7, но не делится на 5, и "NO" - в обратном случае.

Sample Input:

7
Sample Output:

YES
 */

import java.util.Scanner;

class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (((num%7)==0)&&((num%5)!=0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}