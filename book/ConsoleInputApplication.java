import java.util.Scanner;
class ConsoleInputApplication{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String day,month;
        System.out.println("What day is it today?");
        day=input.nextLine();
        System.out.println("What month is it today?");
        month=input.nextLine();
        String text;
        text="Today "+day+",month - "+month;
        System.out.println(text);
    }
        }