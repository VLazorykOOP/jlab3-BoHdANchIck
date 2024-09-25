import java.time.LocalDate;
import java.time.LocalTime;

abstract class Triad {
    public abstract void increment();

    public abstract void print();
}

class Date extends Triad {
    private LocalDate date;

    public Date() {
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
        if (!(obj instanceof Date))
            return false;
        Date other = (Date) obj;
        return this.date.equals(other.date);
    }
}

class Time extends Triad {
    private LocalTime time;

    public Time() {
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
        if (!(obj instanceof Time))
            return false;
        Time other = (Time) obj;
        return this.time.equals(other.time);
    }
}

public class task_2 {
    public static void main(String[] args) {
        Triad[] triads = new Triad[4];

        triads[0] = new Date();
        triads[1] = new Date();
        triads[2] = new Time();
        triads[3] = new Time();

        for (Triad triad : triads) {
            triad.print();
            triad.increment();
            triad.print();
        }

        Date date1 = new Date();
        Date date2 = new Date();
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Are dates equal? " + date1.equals(date2));
    }
}
