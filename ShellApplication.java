public class ShellApplication {

    public static void main(String[] args) {
       

       final int PENNIES_PER_QUARTER = 25; 
       int pennies = 113;
       

       int quarters = pennies / PENNIES_PER_QUARTER;
       System.out.println("There are " + quarters + "quarters in" + pennies + "pennies");


       int penniesLeftOver = pennies % PENNIES_PER_QUARTER;
       System.out.println("There are " + penniesLeftOver + "pennies left over");

       final double MONTHS_PER_YEAR = 12;
       double annualSalery = 50000;

       double monthlySalery = annualSalery / MONTHS_PER_YEAR;
       System.out.println("The montly salery is" + monthlySalery);

    }

}