/*
На вход подаются два числа. Выведите сначала их сумму, а на следующей строке переведите числа в строковый формат и сложите в строковом формате.

Sample Input:

8 11
Sample Output:

19
811
 */

import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.println(num1+num2);
        System.out.println(Integer.toString(num1)+Integer.toString(num2));
    }
}