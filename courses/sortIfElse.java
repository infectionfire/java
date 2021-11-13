/*
на вход идут 3 слова через пробел, отсортировать путем применения ифелс конструкции
 */

import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next(), str3 = sc.next();
        //берем символ из строки
        char ch1 = str1.charAt(0), ch2 = str2.charAt(0), ch3 = str3.charAt(0);
        //сравниваем
        if (ch1>ch2&&ch1>ch3){
            if (ch2>ch3){
                System.out.println(str3+"\n"+str2+"\n"+str1);
            }else{
                System.out.println(str2+"\n"+str3+"\n"+str1);
            }
        }else if (ch2>ch1&&ch2>ch3){
            if (ch1>ch3){
                System.out.println(str3+"\n"+str1+"\n"+str2);
            }else{
                System.out.println(str1+"\n"+str3+"\n"+str2);
            }
        }else{
            if (ch1>ch2){
                System.out.println(str2+"\n"+str1+"\n"+str3);
            }else{
                System.out.println(str1+"\n"+str2+"\n"+str3);
            }
        }

    }
}