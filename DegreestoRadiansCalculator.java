import java.util.Scanner;

public class DegreestoRadiansCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radian/degree value in degrees. ");
        System.out.println("It will return radian value in decimals");
        System.out.println();

        System.out.println("Enter the number for each option. ");

       
        double pi = 22.0 / 7.0; // Make sure pi is calculated as a double

        while(true){

        System.out.println("1. Degrees To Radians ");
        System.out.println("2. Radians to Degrees");
        int option = scanner.nextInt(); // Read the option from user input
        
        switch (option) {

            case 1:
                double degrees = 0;
                System.out.print("Enter the number in degrees: ");
                degrees = scanner.nextDouble();
                double radianVal = degToRadian(degrees, pi);
                System.out.println(degrees + " degrees in radians is " + radianVal); 
                break;
                
            case 2:
                double radians  = 0;
                System.out.print("Enter the radian value in decimals: ");
                radians = scanner.nextDouble();
                double degVal = radianToDeg(radians, pi);
                System.out.println(radians + " in radians is " + degVal + " degrees");
                break;            

            default:
                System.out.println("Invalid option");
        }
    }

    }

    public static double degToRadian(double degrees, double pi) {

        double radianVal = degrees * (pi / 180);
        radianVal = Math.round(radianVal * 100.0) / 100.0; // Round to 2 decimal places

        return radianVal;  // Formula for degrees to radians conversion
    }

    public static double radianToDeg(double radians, double pi){

        double degVal = radians * (180/pi);
        degVal = Math.round(degVal);

        return degVal;
    }
}
