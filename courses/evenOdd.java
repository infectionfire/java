/*
 три числа. true, если два чётных, и false - если нет.
 */

import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int count = 0;
        if(a % 2 == 0)
            count++;
        if(b%2 == 0)
            count++;
        if(c%2 == 0)
            count++;
        if(count == 2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}