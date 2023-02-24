package exeptions;

public class Calendar
{
    private int day;
    private int month;
    private int year;

    public Calendar() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Calendar(int day, int month, int year) throws WrongDateExeption{
        if (day>31 || day <= 0) {
            throw new WrongDateExeption("The day is entered incorrect", day, month, year);
        } else {
            this.day = day;
        }
        if (month>12 || month <= 0) {
            throw new WrongDateExeption("The month is entered incorrect",day,month,year);
        } else {
            this.month = month;
        }
        if(year <= 0) {
            throw new WrongDateExeption("The year is entered incorrect",day,month,year);
        } else {
            this.year = year;
        }

    }



}
