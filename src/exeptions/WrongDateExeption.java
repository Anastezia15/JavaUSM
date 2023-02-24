package exeptions;

public class WrongDateExeption extends Exception{
    private final int day;
    private final int month;
    private final int year;

    public WrongDateExeption(String message , int dd , int mm , int yyyy){
        super((message));
        day=dd;
        month=mm;
        year=yyyy;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
