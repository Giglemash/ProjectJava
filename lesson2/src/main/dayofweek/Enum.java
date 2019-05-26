package main.dayofweek;

public enum Enum {
    MONDAY(6), TUESDAY(6), WEDNESDAY(0), THURSDAY(6), FRIDAY(6), SATURDAY(0), SUNDAY(6);

    private int hour;

    public int getHour() {
        return hour;
    }

    Enum(int hour) {
        this.hour = hour;
    }
}


