/*
На вход подаётся строка текста. Выведите её первый и последний элемент в одну строку через пробел.

Sample Input:

abracadabra
Sample Output:

a a


 */


import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = str.length()-1;
        System.out.println(str.charAt(0)+" "+str.charAt(num));
    }
}