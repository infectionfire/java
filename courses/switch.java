/*
Реализуйте простой справочник по командам Java.
На вход подаётся команда, по которой необходима справка (ограничимся тремя командами).
В соответствии с этим выведите текст:

Ввод: System.out.println()

Вывод: Это команда вывода на печать

Ввод: if

Вывод: Это условный оператор

Ввод: else

Вывод: Это альтернативная конструкция условного оператора



Если введено что-либо другое, выведите фразу "Раздел в разработке" (без кавычек).


 */

import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        switch (command) {

            case "System.out.println()":
                System.out.println("Это команда вывода на печать");
                break;
            case "if":
                System.out.println("Это условный оператор");
                break;
            case "else":
                System.out.println("Это альтернативная конструкция условного оператора");
                break;
            default:
                System.out.println("Раздел в разработке");
        }

    }
}