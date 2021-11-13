/*
ООО "Круче Гугла" наняло трёх разработчиков.
Внезапно разработчики узнали, что их зарплаты различаются.
Разработчики решили объявить забастовку, если разница максимальной и минимальной зарплаты превысит определённый уровень.
 Определите, грозит ли ООО "Круче Гугла" забастовка.

Формат ввода:

В первой строке - зарплаты разработчиков через пробел, три целых числа.

Во второй строке - разница, при превышении которой будет объявлена забастовка.

Формат вывода:

"Ура, бастуем!" - если критический уровень превышен;

"За работу, Солнце ещё высоко" - если критический уровень не превышен.

Sample Input:

300 400 500
100
Sample Output:

Ура, бастуем!
 */

import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        int vilka = sc.nextInt();
        int max, min;
        //максимум
        if (num1>=num2&&num1>=num3){
            max = num1;
        }else if (num2>=num1&&num2>=num3){
            max = num2;
        }else{
            max = num3;
        }
        //минимум
        if (num1<=num2&&num1<=num3){
            min = num1;
        }else if (num2<=num1&&num2<=num3){
            min = num2;
        }else{
            min = num3;
        }
        //вычисление разницы
        if ((max-min)> vilka){
            System.out.println("Ура, бастуем!");
        }else{
            System.out.println("За работу, Солнце ещё высоко");
        }
    }
}