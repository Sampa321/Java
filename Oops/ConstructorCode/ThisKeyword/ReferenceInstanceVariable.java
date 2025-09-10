package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class ReferenceInstanceVariable {
    String name;
    int age;
    ReferenceInstanceVariable(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Name:"+name+"\nAge:"+age);
    }
    public static void main(String[] args) {
        ReferenceInstanceVariable obj=new ReferenceInstanceVariable("Sampa",20);
        obj.displayInfo();
    }
}
