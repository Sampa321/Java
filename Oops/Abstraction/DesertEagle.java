package ClassPractice.OOPS.Abstraction;

public class DesertEagle extends Guns{
    float gunWeight;
    DesertEagle(int a,boolean s,boolean s1,String type,float w)
    {
        super(a,s,s1,type);
        this.gunWeight=w;
    }
    public void reload(){
        this.ammoCapacity = 30;
        System.out.println("Chal,apun ready hai.");
    }
}
