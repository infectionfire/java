package org.example;

public class CreditCalculator {

    private double monthPayment;
    private int months;
    private int amount;
    private double percents;
//конструктор класса кредит
    public void Credit(int months, int amount, double percents) {
        this.months = months;
        this.amount = amount;
        this.percents = percents;
    }
//геттеры
    public int getMonths(int i) {
        return months;
    }

    public int getAmount(int i) {
        return amount;
    }

    public double getPercents(String s) {
        return percents;
    }
//сеттеры
    public void setMonths(int months) {
        this.months = months;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPercents(double percents) {
        this.percents = percents;
    }
//простая логика без сложных процентов
    public double getMonthPayment() {
        monthPayment = ((amount*(1+(percents/100/12)))/months);
        return monthPayment;
    }
    }
