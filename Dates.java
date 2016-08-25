import java.util.Scanner;
/**
 * Date validation.
 * @author ËÎÓëçñ
 * @version 1.0
 */
public class Dates {
    /**
     * Drive my program
     * @param args args command line arguments.
     */
    public static void main(String[] args) {
        int month, day, year; // date read in from user
        int daysInMonth; // number of days in month read in
        boolean monthValid, yearValid, dayValid; // true if input from user is
                                                 // valid
        boolean leapYear; // true if user's year is a l eap year
        Scanner scan = new Scanner(System.in);
        // Get integer month, day, and year from user
        System.out.println("Please enter a month: ");
        month = scan.nextInt();
        System.out.println("Please enter a day: ");
        day = scan.nextInt();
        System.out.println("Please enter a year: ");
        year = scan.nextInt();

        // Check to see if month is valid
        if(month>=1 && month<=12)
            monthValid = true;
            else
                monthValid = false;
        
        // Check to see if year is valid
        if(year>=1000 && year<=1999)
            yearValid = true;
            else
                yearValid = false;
        // Determine whether it's a leap year
        if(year%400==0 || year%4==0 || year%100==0)
            leapYear = true;
            else
                leapYear = false;
        // Determine number of days in month
        if(monthValid == true)
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            daysInMonth = 31;
            else if (month==2)
                if(leapYear == true)
            daysInMonth = 29;
                else
            daysInMonth = 28;
            else
            daysInMonth = 30;
        else
            daysInMonth = 0;
        
        if(day<1 || day>daysInMonth)
            dayValid = false;
        else 
            dayValid = true;
        
        if(dayValid==true && monthValid == true && yearValid == true)
            System.out.println("Date is valid.");
        else
            System.out.println("Date is not valid.");
        
        if(dayValid==true && monthValid == true && yearValid == true && leapYear==true)
            System.out.println("This year is a leap year.");
        // User number of days in month to check to see if day is valid
        // Determine whether date is valid and print appropriate message
    }
}