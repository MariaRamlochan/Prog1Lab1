import java.util.*;

public class DateSample{

public static void main(String[] args){

System.out.println("\n**** Date Sample ****");

Date today = new Date();
Date afterToday = new Date();
Date year = new Date(120,1,5);


System.out.println("\nDate today: " + today.toString());
System.out.println("\nDate yesterday: " + today.toString());
System.out.println("\nToday after yesterday: " + today.toString());
//System.out.println("\nDate today: " + today.getYear());
//System.out.println("\nDate today: " + today.getMonth());


System.out.println("The year of the date is " + afterToday.getYear());
System.out.println("The month of the date is " + afterToday.getMonth());
System.out.println("The date of the date is " + afterToday.getDate());



Date copyToday = today;
Date cloneToday = (Date)today.clone();

today.setYear(130);
System.out.println(copyToday);
System.out.println(today);
System.out.println(cloneToday);





	}
}