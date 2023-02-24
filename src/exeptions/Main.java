package exeptions;

import java.util.Scanner;

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
