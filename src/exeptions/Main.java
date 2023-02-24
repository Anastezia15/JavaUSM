package exeptions;
import java.util.Scanner;
/*В программе требуется:
->Создать собственное исключение (class).
->Создать метод (throw), который может возбуждать это исключение(throws).
->Написать метод, перехватывающий и обрабатывающий исключение (try-catch), возбуждаемое другим методом.
Исключение: с консоли вводится дата (дд:мм:гггг). Добиться ввода только правильной даты.*/
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        try {
            Calendar date1 = new Calendar(day,month,year);
        }
        catch (WrongDateExeption e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDay()+" "+e.getMonth()+" "+e.getYear());
        }
    }
}
