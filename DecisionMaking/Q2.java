package ClassPractice.Decision_Making;
import  java.util.Scanner;
/*
Question 2 - Determine landing safety based on: fuel level (0-100), landing pad condition (1-5), and weather
severity (1-10):
- If fuel < 10: "EMERGENCY LANDING - Any available spot!"
- If weather > 8: "Abort landing - Too dangerous"
- If fuel < 30 AND pad < 3: "Risky landing attempt"
- If fuel >= 50 AND pad >= 4 AND weather <= 3: "Perfect landing conditions"
- If pad >= 3 AND weather <= 6: "Proceed with standard landing"
 Otherwise: "Wait for better conditions"
 */


public class Q2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter fuel level:");
        int fuel = SC.nextInt();
        System.out.println("landing pad condition:");
        int pad = SC.nextInt();
        System.out.println("weather severity:");
        int weather = SC.nextInt();
        if (weather > 8) {
            System.out.println("Abort landing - Too dangerous");
        }
        if (pad >= 3 && weather <= 6) {
            System.out.println("Proceed with standard landing");
        }
        if (fuel >= 50 && pad >= 4 && weather <= 3) {
            System.out.println("Perfect landing conditions");
        } else if (fuel < 30 && pad < 3) {
            System.out.println("Risky landing attempt");
        } else if (fuel < 10) {
            System.out.println("EMERGENCY LANDING - Any available spot!");
        } else {
            System.out.println("Wait for better conditions");
        }
    }
}
