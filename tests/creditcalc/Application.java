package org.example;

import java.util.Scanner;

public class Application {
    Scanner sc = new Scanner(System.in);
    private CreditCalculator calculator;

    public void init(){
        calculator = new CreditCalculator();
    }

    public void run(){
        System.out.println("Ведите сумму");
        calculator.setAmount(sc.nextInt());
        System.out.println("Введите срок");
        calculator.setMonths(sc.nextInt());
        calculator.setPercents(Math.random()*100);
        calculator.getMonthPayment();
        System.out.println("Месячный платеж:" +calculator.getMonthPayment());

    }
    public static void main(String[] args) {
            Application application = new Application();
            application.init();
            application.run();
    }
}
