package ClassPractice.OOPS.Abstraction;

public abstract class Guns {
    int ammoCapacity;
    boolean scope;
    boolean silencer;
    String gunType;

    Guns(int ammo,boolean scope,boolean s,String type)
    {
        this.ammoCapacity=ammo;
        this.scope=scope;
        this.silencer=s;
        this.gunType=type;
    }

    public abstract void reload();

    public void fire(){
        if(this.ammoCapacity==0)
        {
            System.out.println("Bhai,reload maar!");
        }
        else {
            System.out.println("maut ka nanga naach");
        }
    }

    public static void main(String[] args) {
        DesertEagle o1=new DesertEagle(0,false,false,"Desert Eagle",5.4f);
        o1.fire();
        o1.reload();
    }
}
