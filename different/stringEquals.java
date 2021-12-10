/*

На первой строке подаётся пароль, хранящийся в базе данных, на второй - пароль, введённый пользователем.

Выведите на печать фразу "Access is granted", если пользователь ввёл верный пароль, и "Access is denied" - если нет.

Sample Input:

111111
111111
Sample Output:

Access is granted
 */

import java.util.Scanner;

class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(), str2 = sc.nextLine();
        if (str1.equals(str2)){
            System.out.println("Access is granted");
        }else{
            System.out.println("Access is denied");
        }
    }
}