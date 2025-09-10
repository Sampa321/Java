package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class ConstructorChaining {
    String color;
    int price;
    ConstructorChaining()
    {
        this("red",34);
    }
    ConstructorChaining(String color,int price)
    {
        this.color=color;
        this.price=price;
    }
    void displayInfo()
    {
        System.out.println("Car color:"+color+"\nPrice:"+price);
    }
    public static void main(String[] args) {
        ConstructorChaining obj1=new ConstructorChaining();
        obj1.displayInfo();
    }
}
