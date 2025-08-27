package ClassPractice.Decision_Making;

import java.util.Scanner;
/*
Question 3 - Problem: Calculate battle outcome based on: hero health, monster health, and hero weapon damage:
 If hero health <= 0: "Hero is defeated!"
 If monster health <= 0: "Monster defeated!"
 If hero health < 20 AND monster health > 50: "Retreat recommended"
 If weapon damage >= monster health: "One-hit victory!"
 If hero health > monster health AND weapon damage > 10: "Hero has advantage"
 If monster health > hero health * 2: "Monster has major advantage"
 Otherwise: "Balanced fight"
 */
public class BattleOutcome {
    public static void main(String[] args) {
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter the hero health:");
    int hero_health=SC.nextInt();
    System.out.println("Enter the monster health:");
    int monster_health=SC.nextInt();
    System.out.println("Enter hero weapon damage:");
    int hero_weapon_damage=SC.nextInt();
    if(hero_health <= 0)
    {
        System.out.println("Hero is defeated!");
    }
    else if(monster_health <= 0){
        System.out.println("Monster defeated!");
    }
    else if(hero_health < 20 && monster_health > 50)
    {
        System.out.println("Retreat recommended");
    }
    else if(hero_weapon_damage >= monster_health)
    {
        System.out.println("One-hit victory!");
    }
    else if(hero_health > monster_health && hero_weapon_damage> 10){
        System.out.println("Hero has advantage");
    }
    else if(monster_health > hero_health * 2)
    {
        System.out.println("Monster has major advantage");
    }
    else {
        System.out.println("Balanced fight");
    }
    }
}
