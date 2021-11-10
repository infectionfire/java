/*

На вход подаётся строка текста, затем слово. Выведите на печать true, если слово содержится в строке,
и false - если не содержится.

Sample Input 1:

My name is John
name
Sample Output 1:

true
Sample Input 2:

My name is John
john
Sample Output 2:

false
 */

import java.util.Scanner;


class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), check = sc.nextLine();
        boolean value1 = str.contains(check);
        System.out.println(value1);
    }
}