package ClassPractice.Decision_Making;
import java.util.Scanner;
/*Problem: Choose weather spell based on current temperature, humidity percentage, and wind speed:
- If temp > 35 AND humidity > 80: "Cooling Rain Spell"
- If temp < 0 AND wind > 20: "Blizzard Control Spell"
- If humidity < 30 AND temp > 25: "Drought Breaking Spell"
- If wind > 30: "Wind Calming Spell" + check if temp < 10 then add "with Warmth"
- If temp >= 20 AND temp <= 25 AND humidity >= 40 AND humidity <= 60: "Perfect Weather - No spell needed"
 Otherwise: "Weather Balancing Spell"*/

public class Q1 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter the temp:");
        int temp=SC.nextInt();
        System.out.println("Enter the humidity percentage::");
        float humidity=SC.nextFloat();
        System.out.print("Enter the wind speed:");
        int wind=SC.nextInt();

        if(temp>35 && humidity>80)
        {
            System.out.println("Cooling Rain Spell");

        }
        else if(temp<0 && wind>20)
        {
            System.out.println("Blizzard Control Spell");
        }
        else if(humidity<30 && temp>25)
        {
            System.out.println("Drought Breaking Spell");
        }
        else if(wind>30)
        {

            if(temp<10)
            {
                System.out.println("Wind Calming Spell with Warmth");
            }
            else {
                System.out.println("Wind Calming Spell");
            }
        }
        else if((temp>=20 && temp <= 25) && (humidity >= 40 && humidity <= 60) ){
            System.out.println("Perfect Weather - No spell needed");

        }
        else {
            System.out.println("Weather Balancing Spell");
        }
    }
}
