/*
Два индийских программиста, Махатма и Джавахарлал, решили выяснить, чей код длиннее.
Напишите программу, которая поможет им выяснить это.

На вход подаются две строки текста. Если первая строка длиннее второй, необходимо вывести на печать "Махатма",
 если наоборот - "Джавахарлал". Гарантируется, что строки имеют разную длину.

Sample Input:

abracadabra
The world is mine
Sample Output:

Джавахарлал
 */


import java.util.Scanner;

class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(), str2 = sc.nextLine();
        int num1 = str1.length();
        int num2 = str2.length();
        if (num1>num2){
            System.out.println("Махатма");
        }else{
            System.out.println("Джавахарлал");
        }
    }
}