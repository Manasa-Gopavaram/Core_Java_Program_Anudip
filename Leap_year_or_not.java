/* Write a program to check leap year using if else. How to check whether a given year is a leap year or not */

package ANP_D0453.com;

import java.util.Scanner;

public class Leap_year_or_not {
	
	  public static void main(String[] args) {
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Mention year: ");
		  int year=sc.nextInt();
		    boolean leap = false;

		    // if the year is divided by 4
		    if (year % 4 == 0) {

		      // if the year is century
		      if (year % 100 == 0) {

		        // if year is divided by 400
		        // then it is a leap year
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      
		      // if the year is not century
		      else
		        leap = true;
		    }
		    
		    else
		      leap = false;

		    if (leap)
		      System.out.println(year + " is a leap year.");
		    else
		      System.out.println(year + " is not a leap year.");
		  }
		
}


//Output
Mention year: 2004
2004 is a leap year.

Mention year: 1998
1998 is not a leap year.
