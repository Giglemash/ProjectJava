package main.dayofweek;

public class DayOfWeek {
    public static int getWorkingHours(Enum dayOfWeek) {
        int result = 0;
        for(int i = dayOfWeek.ordinal(); i < dayOfWeek.values().length; i++ )
            result += dayOfWeek.values()[i].getHour();
        return result;
    }


    public static void main(final String[] args) {
        System.out.println(getWorkingHours(Enum.MONDAY));
    }
}
