package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class CarThis {
    int YearOfManufacture;
    String color;
    String brand;
    CarThis()
    {
        YearOfManufacture=2023;
    }
    CarThis(String c,String B)
    {
        this();        //we can't access YearOfManufacture value
        color=c;
        brand=B;
    }
    public static void print(int shirts,int pants)
    {
        System.out.println("Ami "+shirts+" jama ar "+pants+" ache");
    }
    public void display()
    {
        System.out.println("color:"+color+"brand:"+brand);
    }
    public static void main(String[] args) {
        CarThis.print(12,34);
        CarThis c1=new CarThis("Motor","Gold");
        c1.display();
    }
}
