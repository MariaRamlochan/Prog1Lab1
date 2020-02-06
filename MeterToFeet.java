public class MeterToFeet {

    public static void main(String[] args) {
        // Variables
		double meter = int input("Type meter values: " + 10);
		double centimeter = int input("Type centimeter value: " + 1000);
		
		double metertocentimeter = 100;
		double centimetertoinches = 0.393700787;
		double foottoinches = 12;
		
		
		double feet = meter * centimetertoinches * metertocentimeter/foottoinches;
		
		
		
        System.out.println("Value of feet" + feet);
    }

}