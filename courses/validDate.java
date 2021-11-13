/*
На вход три целых числа - день, месяц и год (по григорианскому календарю).
true, если эти числа составляют валидную дату, и false если нет.
 */

import java.util.Scanner;

class MyProg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        boolean z;
        //проверка на валидность данных
        if ((y<1)||(m<1||m>12)||(d<1||d>31)) {
            z=false;
        }else{
            //проверка на 29 февраля
            if (((y%4==0)||(y%100!=0)&&(y%400==0))&&(m==2)&&(d>29)) {
                z=false;
            }else{
                ////проверка на 29 февраля
                if (((y%4!=0)||(y%100==0)&&(y%400!=0))&&(m==2)&&(d>28)) {
                    z=false;
                }else{
                    //проверка на число дней в месяце
                    if ((m==4||m==6||m==9||m==11)&&(d>30)) {
                        z=false;
                    }else{
                        z=true;
                    }
                }
            }
        }
        System.out.println(z);
    }
}