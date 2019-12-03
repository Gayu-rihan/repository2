package prodapt.javaProgram;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class YearProgram {
	static String day(int year){
        String date = "";
        if(year < 1918) {       //checking for leap year
            date = date + ((year % 4 == 0) ? "12.09." + year : "13.09." + year);
        } else if(year == 1918) {      
            date =date + ("26.09." + year);
        } else {                       //checking for leap year
            date =date +( ((year % 400 == 0) ||                               
            (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year);
        }
        return date;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String date = day(year);
        System.out.println(date);
        sc.close();
    }
}

