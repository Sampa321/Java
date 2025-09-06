package ClassPractice.Method;

public class MethodDemo2 {
    private void show(int [] phuchka)//parameter
    {
        for(int i=0;i<phuchka.length;i++)
        {
            phuchka[i]*=5;
        }
    }
    public static void main(String[] args) {
        int thela []={12,3,4,5,6,7,8,};
        MethodDemo2 beguni=new MethodDemo2();
        beguni.show(thela);//argument
        //we pass Non-primitive type value so can change the original value(argument)
        for(int i:thela)
        {
            System.out.print(i+" ");
        }

    }
}
