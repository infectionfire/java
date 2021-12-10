/*
На вход подаётся целое число n. Выведите "YES", если можно построить правильный многогранник
 из правильных плоских n-угольников, в противном случае - "NO".

Sample Input:

3
Sample Output:

YES
 */

import java.util.Scanner;

class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        //количество при вершине 3 или 4 или 5
        if ((count==3)||(count==4)||(count==5)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}