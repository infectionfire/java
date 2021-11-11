/*

В 1997 году во время боксёрского боя за звание чемпиона мира Майк Тайсон откусил ухо Эвандеру Холифилду (не целиком). Рефери нужно определить, как поступить. Если откушенный кусок уха меньше норматива, бой продолжится. Если нет - Майк Тайсон должен быть дисквалифицирован, и чемпионом становится Холифилд.

На вход подаются два числа -  масса откушенного куска уха и норматив. Выведите "Бой продолжается!" или "Холифилд - чемпион!" в зависимости от выполнения условия.

Sample Input:

5 10
Sample Output:

Бой продолжается!
 */

import java.util.Scanner;

class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next();
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
        if (num1 >= num2){
            System.out.println("Холифилд - чемпион!");
        }else{
            System.out.println("Бой продолжается!");
        }
    }
}