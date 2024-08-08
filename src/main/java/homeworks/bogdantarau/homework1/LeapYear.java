package homeworks.bogdantarau.homework1;

public class LeapYear {
   public static void main(String[] args) {
        System.out.println("Enter a year between 1900 and 2016:");
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;
        int daysInFebruary;

        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " is a leap year.");
            isLeapYear = true;
        } else if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
            isLeapYear = true;
        } else {
            System.out.println(year + " is not a leap year.");
            isLeapYear = false;
        }
        if(isLeapYear){
             daysInFebruary = 29;
        }else {
            daysInFebruary = 28;
        }
        if (year < 1900 || year > 2016) {
            System.out.println("Year must be between 1900 and 2016.");
        } else {
            System.out.println("Number of days in February " + year + ": " + daysInFebruary);
        }
    }
}
