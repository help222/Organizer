package com.sss.organizer;

import java.util.GregorianCalendar;

/**
 * Created by Zheka on 09.12.2015.
 */
public class Calendar {

    public GregorianCalendar getToday() {
        final GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(java.util.Calendar.HOUR_OF_DAY, 0);
        calendar.set(java.util.Calendar.MINUTE, 0);
        calendar.set(java.util.Calendar.SECOND, 0);
        calendar.set(java.util.Calendar.MILLISECOND, 0);
        return calendar;
    }
}
