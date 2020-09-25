package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.
        int month = myCal.get(Calendar.MONTH);
        int monthFixed = month+1;
        int dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);
        int year = myCal.get(Calendar.YEAR);

        System.out.println ("Date is " + monthFixed + "/" + dayOfMonth + "/" + year);
        System.out.println ("Expected: 9/23/2020");

        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html

        myCal.add(Calendar.DAY_OF_YEAR,100);

        System.out.println ("New date is " +(myCal.get(Calendar.MONTH)+1) + "/" + myCal.get(Calendar.DAY_OF_MONTH) + "/" + myCal.get(Calendar.YEAR));


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)

        myCal.add(Calendar.MONTH,6);
        myCal.add(Calendar.DAY_OF_MONTH, 26);
        myCal.add(Calendar.YEAR,-1);
        System.out.println ("My 2020 birthday was "+myCal.get(Calendar.MONTH)+"/"+myCal.get(Calendar.DAY_OF_MONTH)+"/"+ myCal.get(Calendar.YEAR));
        System.out.println ("My birthday is a: "+myCal.get(Calendar.DAY_OF_WEEK));

        myCal.add(Calendar.DAY_OF_YEAR,10000);
        System.out.println ("10,000 days from now is: " +(myCal.get(Calendar.MONTH)) + "/" + myCal.get(Calendar.DAY_OF_MONTH) + "/" + myCal.get(Calendar.YEAR));







    }

}