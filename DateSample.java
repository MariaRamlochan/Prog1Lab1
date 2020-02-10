import java.util.*;

public class DateSample{

public static void main(String[] args){

System.out.println("\n**** Date Sample ****");

Date today = new Date();
Date year = new Date(120,1,5);


System.out.println("\nDate today: " + today.toString());
System.out.println("\nDate yesterday: " + today.toString());
System.out.println("\nToday after yesterday: " + today.toString());
//System.out.println("\nDate today: " + today.getYear());
//System.out.println("\nDate today: " + today.getMonth());

	}
}