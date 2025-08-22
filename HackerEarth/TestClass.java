package ClassPractice.ExtraQuestion.HackerEarth.CostOfBolloons;

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of test case:");
        int t = sc.nextInt();
        while (t-- >0)
        {
            System.out.print("Green balloons price:");
            int GballonPrice = sc.nextInt();
            System.out.print("Purple balloons price:");
            int PBallonPrice = sc.nextInt();
            System.out.print("No of participate:");
            int p = sc.nextInt();
            int NoOfRightQs1 = 0;
            int NoOfRightQs2 = 0;
            System.out.println("please give for right answer 1 and wrong answer 0");
            for(int j=0;j<p;j++)
            {
                System.out.print((j+1)+"no of participate given ans for qs1:");
                int Q1 = sc.nextInt();
                System.out.print((j+1)+"no of participate given ans for qs2:");
                int Q2 = sc.nextInt();
                if(Q1 == 1)
                {
                    NoOfRightQs1++;
                }
                if(Q2 == 1)
                {
                    NoOfRightQs2++;
                }
            }

            int price1 = GballonPrice*NoOfRightQs1+PBallonPrice*NoOfRightQs2;
            int price2 = PBallonPrice*NoOfRightQs1+GballonPrice*NoOfRightQs2;
            if(price1>price2)
            {
                System.out.println(price2);
            }
            else
            {
                System.out.println(price1);
            }
        }
    }
}


