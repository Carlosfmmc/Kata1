package Kata1;

import java.util.Date;

public class Person {
    //En 2m 55s xd
    private final String name;
    private final Date birthday;
    private static final long MS_PER_Seconds = 1000;
    private static final long Seconds_Per_Minuts = 60;
    private static final long Minuts_Per_Hour = 60;
    private static final long Hour_Per_Day = 24;
    private static final double Day_Per_Year = 365.25;
    private static final double MS_PER_Year = MS_PER_Seconds * Seconds_Per_Minuts * Minuts_Per_Hour * Hour_Per_Day *Day_Per_Year;

    public String getName() {
        return name;
    }

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int get age(){
        long ms = new Date().getTime() - birthday.getTime();
        return toYears(ms);
00    }

    private int toYears(long ms) {
        return (int)(ms/MS_PER_Year);
    }
    
}
