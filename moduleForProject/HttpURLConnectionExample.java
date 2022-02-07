
import java.net.*;
import java.io.*;
import java.util.*;

public class HttpURLConnectionExample {

    public static void main(String[] args) throws Exception {
        URL myUrl = new URL("https://www.cbr-xml-daily.ru/latest.js");
        HttpURLConnection myUrlCon =
                (HttpURLConnection) myUrl.openConnection();

        // Вывести метод запроса

        System.out.println("Метод запроса: " +
                myUrlCon.getRequestMethod());

        // Вывести код ответа

        System.out.println("Ответное сообщение: " +
                myUrlCon.getResponseMessage());

        // Получить список полей и множество ключей из заголовка

        Map<String, List<String>> myMap = myUrlCon.getHeaderFields();
        Set<String> myField = myMap.keySet();
        System.out.println("\nДалее следует заголовок:");

        // Вывести все ключи и значения из заголовка
        for(String k : myField) {
            System.out.println( k +": "+ myMap.get(k));
        }
    }

}