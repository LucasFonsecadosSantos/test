package dev.handler;

import java.util.Date;
import java.util.Calendar;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This class is responsible for any date 
 * manipulation.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public class DateHandler {

    /**
     * It verifys if the date informed by the user 
     * is a weekend.
     * 
     * @param date Date object with date informed by the user.
     * @return true If the date informed is weekend.
     */
    public boolean isWeekend(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return (
            calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
            calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
        );

    }
    
}
