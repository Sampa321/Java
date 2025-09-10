package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class CurrentInstanceArgument {
    String name;
    public CurrentInstanceArgument(String name)
    {
        this.name=name;
    }
    public void displayInfo(){
        Printer printer=new Printer();
        printer.printPersonInfo(this);
    }
    public static void main(String[] args) {
       CurrentInstanceArgument obj=new CurrentInstanceArgument("Charlie");
        obj.displayInfo();
    }
}


