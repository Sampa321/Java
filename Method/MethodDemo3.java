package ClassPractice.Method;

public class MethodDemo3 {
    int add(float a,char c,int...momos)
    {
        int sum=0;
        //This is normally use for print the value:
        System.out.println("The value of baguni:"+a);
        System.out.println("First letter of shingara:"+c);
        //Main topic:
        for (int i=0;i<momos.length;i++)
        {
            sum+=momos[i];
        }
        return sum;
    }
    public static void main(String[] args) {
       float beguni=10.6f;
       char shingara='s';
       //Main topic:
       MethodDemo3 food=new MethodDemo3();
       int result=food.add(beguni,shingara,12,3,4,5,6,7);//we pass the interger value store in momos
        System.out.println("Sum of the momos:"+result);
    }
}
