package controlselections;

import controlselection.month.DayInMonth;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayofMonthtest {

    @Test
    void dayInMonthTest(){
    DayInMonth dayInMonth = new DayInMonth();

    int days = dayInMonth.DaysofMonths(2021,"november");
    assertEquals(30,days);

    days = dayInMonth.DaysofMonths(2021,"nOVember");
    assertEquals(30,days);

    days = dayInMonth.DaysofMonths(2021,"May");
    assertEquals(0,days);

    days = dayInMonth.DaysofMonths(2004,"február");
    assertEquals(29,days);

    days = dayInMonth.DaysofMonths(1200,"február");
    assertEquals(28,days);
    }

}
