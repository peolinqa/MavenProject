package HW_7_8;

/**
 * Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
 * Создать класс MonthUtils
 * который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
 */

public final class Month {

    private String monthName;
    private int days;
    private int workdays;

    public Month(String monthName, int days, int workdays) {
        this.monthName = monthName;
        this.days = days;
        this.workdays = workdays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDays() {
        return days;
    }

    public int getWorkdays() {
        return workdays;
    }
}
