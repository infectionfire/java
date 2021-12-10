/*
Выведите на печать наибольшее из трёх целых чисел.

Sample Input:

5 6 12
Sample Output:

12
 */

import java.util.Scanner;

class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
}
