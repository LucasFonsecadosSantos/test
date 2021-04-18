package dev.util;

import java.util.Date;
import java.util.Calendar;

public abstract class DateUtils {

    public static boolean isWeekend(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return (
            calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
            calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
        );

    }
    
}
