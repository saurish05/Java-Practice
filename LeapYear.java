/* Write a Java program that given year is a leap year or not.*/

class LeapYear{
public static void main(String args[]){
int year = 2200;
boolean leap = false;

// if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0){
          leap = true;
	}
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
      System.out.println(year + " is not a leap year.");
}
}



/*
if ((year % 4) == 0 ){
if ((year % 100) == 0){
if ((year % 400) == 0){

System.out.println("Leap year")
}
}
System.out.println("Leap year")
}
}
}
*/