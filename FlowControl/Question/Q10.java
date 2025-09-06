package ClassPractice.FlowControl.Question;
/*write a java program that prints the odd numbers between 9 and 48 using
a while loop.*/



public class Q10 {
    public static void main(String[] args)
    {
        System.out.println("The odd numbers between 9 to 48:");
        int i=9;
        while(i<49)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
