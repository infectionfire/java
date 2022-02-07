package parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("");
        Document document = Jsoup.parse(driver.getPageSource());
        Element element = document
                .select("div.product-card-tabs__contents")
                .first();
        List<String> text = List.of(element.toString().split("product-characteristics__spec-title"));
        text.forEach(x -> System.out.println(Jsoup.parse(x).text()));

        driver.quit();
    }
}