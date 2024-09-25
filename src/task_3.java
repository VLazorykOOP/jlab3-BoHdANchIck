import java.time.LocalDate;
import java.time.LocalTime;

interface Triad1 {
    void increment();

    void print();
}

class Date1 implements Triad1 {
    private LocalDate date;

    public Date1() {
        this.date = LocalDate.now();
    }

    @Override
    public void increment() {
        date = date.plusDays(1);
    }

    @Override
    public void print() {
        System.out.println("Current Date: " + date);
    }

    @Override
    public String toString() {
        return date.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Date1))
            return false;
        Date1 other = (Date1) obj;
        return this.date.equals(other.date);
    }
}

class Time1 implements Triad1 {
    private LocalTime time;

    public Time1() {
        this.time = LocalTime.now();
    }

    @Override
    public void increment() {
        time = time.plusMinutes(1);
    }

    @Override
    public void print() {
        System.out.println("Current Time: " + time);
    }

    @Override
    public String toString() {
        return time.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Time1))
            return false;
        Time1 other = (Time1) obj;
        return this.time.equals(other.time);
    }
}

public class task_3 {
    public static void main(String[] args) {
        Triad1[] triads = new Triad1[4];

        triads[0] = new Date1();
        triads[1] = new Date1();
        triads[2] = new Time1();
        triads[3] = new Time1();

        for (Triad1 triad : triads) {
            triad.print();
            triad.increment();
            triad.print();
        }

        Date1 date1 = new Date1();
        Date1 date2 = new Date1();
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Are dates equal? " + date1.equals(date2));
    }
}
