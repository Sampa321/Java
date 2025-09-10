package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class CurrentClassInstance {
    String name;
    public CurrentClassInstance(String name)
    {
        this.name=name;
    }
    public CurrentClassInstance getCurrentClassInstance()
    {
        return this;
    }
    public void displayInfo(){
        System.out.println("Name:"+name);
    }
    public static void main(String[] args) {
        CurrentClassInstance obj=new CurrentClassInstance("Bob");
        obj.getCurrentClassInstance().displayInfo();
    }
}
