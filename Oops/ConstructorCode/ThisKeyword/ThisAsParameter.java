package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class ThisAsParameter {
    int a;
    ThisAsParameter(int a)
    {
        this.a=a;
    }
    int add(ThisAsParameter obj)
    {
        return obj.a;
    }
    void show()
    {
        System.out.println("vai,emni ai method k call korlam");
        int a=this.add(this);
        System.out.println("vai amake add() eita dilo:"+a);
    }
    public static void main(String[] args) {
        ThisAsParameter o1=new ThisAsParameter(20);
        o1.show();
    }
}


