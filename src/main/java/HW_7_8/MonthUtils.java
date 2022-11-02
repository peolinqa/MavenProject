package HW_7_8;

public class MonthUtils {
    static final Month[] MONTHS_ARRAY = {
            new Month("January", 31, 22),
            new Month("February", 28, 21),
            new Month("March", 31, 22),
            new Month("April", 30, 22),
            new Month("May", 31, 22),
            new Month("June", 30, 23),
            new Month("July", 31, 22),
            new Month("August", 31, 24),
            new Month("September", 30, 22),
            new Month("October", 31, 22),
            new Month("November", 30, 22),
            new Month("December", 31, 23)
    };

    static final Month getMonth(int index) {
        return MONTHS_ARRAY[index]; //хорошая идея, т.к. мы здесь возвращаем конкретный
        // иммьютбл обжект и проблема с тем, что кто-то изменит массив исчезает
    }

    static final int getMonthSize() {
        return MONTHS_ARRAY.length;
    }

    static final Month[] getMonthArray() {
        return MONTHS_ARRAY;
    }

    static final Month[] getMonth_() { // тоже вариант на случай, если кто-то изменит массив
        return new Month[]{
                new Month("January", 31, 22),
                new Month("February", 28, 21),
                new Month("March", 31, 22),
                new Month("April", 30, 22),
                new Month("May", 31, 22),
                new Month("June", 30, 23),
                new Month("July", 31, 22),
                new Month("August", 31, 24),
                new Month("September", 31, 22),
                new Month("October", 31, 22),
                new Month("November", 31, 22),
                new Month("December", 31, 23)
        };
    }

    static final Month[] FIRST_HALF_YEAR_ARRAY = {
            new Month("January", 31, 22),
            new Month("February", 28, 21),
            new Month("March", 31, 22),
            new Month("April", 30, 22),
            new Month("May", 31, 22),
            new Month("June", 30, 23),
    };

    static final Month[] SECOND_HALF_YEAR_ARRAY = {
            new Month("July", 31, 22),
            new Month("August", 31, 24),
            new Month("September", 31, 22),
            new Month("October", 31, 22),
            new Month("November", 31, 22),
            new Month("December", 31, 23)
    };

    static final Month[] MONTH_1_QUARTER_ARRAY = {
            new Month("January", 31, 22),
            new Month("February", 28, 21),
            new Month("March", 31, 22),
    };

    static final Month[] MONTH_2_QUARTER_ARRAY = {
            new Month("April", 30, 22),
            new Month("May", 31, 22),
            new Month("June", 30, 23),
    };

    static final Month[] MONTH_3_QUARTER_ARRAY = {
            new Month("July", 31, 22),
            new Month("August", 31, 24),
            new Month("September", 31, 22),
    };

    static final Month[] MONTH_4_QUARTER_ARRAY = {
            new Month("October", 31, 22),
            new Month("November", 31, 22),
            new Month("December", 31, 23)
    };

    public static Month[] getMonthsArray() {
        return MONTHS_ARRAY;
    }

    public static Month[] getMonth1QuarterArray() {
        return MONTH_1_QUARTER_ARRAY;
    }

    public static Month[] getMonth2QuarterArray() {
        return MONTH_2_QUARTER_ARRAY;
    }

    public static Month[] getMonth3QuarterArray() {
        return MONTH_3_QUARTER_ARRAY;
    }

    public static Month[] getMonth4QuarterArray() {
        return MONTH_4_QUARTER_ARRAY;
    }

    public static Month[] getFirstHalfYearArray() {
        return FIRST_HALF_YEAR_ARRAY;
    }

    public static Month[] getSecondHalfYearArray() {
        return SECOND_HALF_YEAR_ARRAY;
    }
// Это константы, мы не хотим, чтобы они менялись, поэтому сеттеры не ставим
}
