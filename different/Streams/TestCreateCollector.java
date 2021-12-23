package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;

public class TestCreateCollector {

    public static void main(String[] args) {

        // ******** Работа со строками
        Collection<String> strings = Arrays.asList("a1", "b2", "c3", "a1");

        // Напишем собственный Collector, который будет выполнять объединение строк с помощью StringBuilder
        Collector<String,StringBuilder, String> stringBuilderCollector =  Collector.of(
                StringBuilder::new, // метод инициализации аккумулятора
                (b ,s) -> b.append(s).append(" , "), // метод обработки каждого элемента
                (b1, b2) -> b1.append(b2).append(" , "), // метод соединения двух аккумуляторов при параллельном выполнении
                StringBuilder::toString // метод, выполняющийся в самом конце
        );
        String joinBuilder = strings.stream()
                .collect(stringBuilderCollector);
        System.out.println("joinBuilder = " + joinBuilder); // напечатает joinBuilder = a1 , b2 , c3 , a1 ,

        // Аналог Collector'а выше стилем JDK7 и ниже
        StringBuilder b = new StringBuilder(); // метод инициализации аккумулятора
        for(String s: strings) {
            b.append(s).append(" , "); // метод обработки каждого элемента
        }
        String joinBuilderOld = b.toString(); // метод, выполняющийся в самом конце
        System.out.println("joinBuilderOld = " + joinBuilderOld); // напечатает joinBuilderOld = a1 , b2 , c3 , a1 ,

        // Напишем свой аналог toList для получение списка из коллекции строк без дубликатов
        Collector<String, List<String>, List<String>> toList = Collector.of(
                ArrayList::new, // метод инициализации аккумулятора
                List::add, // метод обработки каждого элемента
                (l1, l2) -> { l1.addAll(l2); return l1; } // метод соединения двух аккумуляторов при параллельном выполнении
        );
        List<String> distinct1 = strings.stream()
                .distinct()
                .collect(toList);
        System.out.println("distinct1 = " + distinct1); // напечатает distinct1 = [a1, b2, c3]
    }
}
