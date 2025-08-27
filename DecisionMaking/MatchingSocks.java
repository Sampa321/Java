package ClassPractice.Decision_Making;

import java.util.Scanner;
/*
Question 4 -  A student has red, blue, and green socks. Write a program to check if they're wearing matching socks and give fashion advice.
 If both socks are the same color: "Perfect match!"
 If one sock is red and the other is blue: "Christmas vibes!"
 If one sock is blue and the other is green: "Nature lover!"
 If one sock is red and the other is green: "Watermelon style!"
 Any other combination: "Creative chaos!"
 */
public class MatchingSocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sock1:");
        String sock1=sc.next();
        sock1=sock1.toLowerCase();
        System.out.print("Enter sock2:");
        String sock2=sc.next();
        sock2=sock2.toLowerCase();
        if(sock1.equals(sock2))
        {
            System.out.println("Perfect match!");
        } else if ((sock1.equals("red")) && (sock2.equals("blue"))||(sock1.equals("blue")) && (sock2.equals("red"))) {
            System.out.println("Christmas vibes!");
        }else if ((sock1.equals("blue")) && (sock2.equals("green"))||(sock1.equals("green")) && (sock2.equals("blue"))) {
            System.out.println("Nature lover!");
        }else if ((sock1.equals("red")) && (sock2.equals("green"))||(sock1.equals("green")) && (sock2.equals("red"))) {
            System.out.println("Watermelon style!");
        }
        else {
            System.out.println("Creative chaos!");
        }
    }
}
