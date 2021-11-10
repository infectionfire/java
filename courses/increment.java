/*
На вход подаются два числа: x и y.
Выведите на печать значение выражения
z = {x + 1}{y - 1} + {y + 1}{x - 1}
 Гарантируется, что x и у не равны нулю
Sample Input:

5 3
Sample Output:

4
 */

import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int z = (x+1)/(y-1)+(y+1)/(x-1);
        System.out.print(z);
    }
}