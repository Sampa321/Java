package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class Example {
    int x;
    Example()
        {
            System.out.println("zero parameter Constructor");
            x=10;
    }
    public Example getDoubleCurrent(){
        Example newObj=new Example();
        newObj.x=this.x*2;
        return newObj;
    }
    public void displayInfo(){
        System.out.println("value is:"+this.x);
    }
    public static void main(String[] args) {
        Example e1=new Example();
        e1.displayInfo();
        Example e2=e1.getDoubleCurrent();
        e1.displayInfo();
        e2.displayInfo();
    }
}
