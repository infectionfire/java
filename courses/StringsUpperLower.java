/*

На вход подаётся строка. Выведите её на печать сначала строчными, а затем прописными буквами.

Sample Input:

This is new string
Sample Output:

this is new string
THIS IS NEW STRING
 */

import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.toLowerCase()+"\n"+str.toUpperCase());
    }
}