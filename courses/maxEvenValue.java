/*
На вход подаётся три целых числа. Выведите максимальное чётное из них. Если чётных чисел нет, выведите "Чётных чисел нет".

Sample Input:

5 10 15
Sample Output:

10
 */

import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

// если а четное, то записываем его значение, если нет, то -1
        a = a % 2 == 0 ? a : -1;
        b = b % 2 == 0 ? b : -1;
        c = c % 2 == 0 ? c : -1;

        if ((a < 0) && (b < 0) && (c < 0))
            System.out.print("Чётных чисел нет");
        else
            System.out.print(Math.max(a, Math.max(b,c)));
    }
}