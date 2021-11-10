/*Реализуйте простые домашние часы.

На вход подаётся число секунд, которое прошло с момента начала суток (00:00:00).
Выведите текущее время в формате ЧЧ:ММ:СС.

Примечание 1. Используйте 24-часовой формат.
Примечание 2. Для преобразования типа int в тип String (если это понадобится)
можно использовать встроенный служебный метод String.valueOf(num), который преобразует число num в строку "num".

Sample Input 1:

        41000
Sample Output 1:

        11:23:20
Sample Input 2:

        3600
Sample Output 2:

        01:00:00

 */

import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вводим числа
        int sec = sc.nextInt();
        //выводим часы с проверкой на количество суток (24 часа*60*60)
        int hours = sec%(24*60*60)/3600;
        //минуты
        int minuts = (sec%3600)/60;
        //секунды
        int seconds = sec%60;
        System.out.format("%02d"+":"+"%02d"+":"+"%02d", hours,minuts,seconds);
    }
}