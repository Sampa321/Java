class Demo{
    int x;
    String abc;
    char c;
   Demo(int x,String abc,char c){
        this.x=x;
        this.abc=abc;
        this.c=c;

    }
    //a member function
    void showDetails(){
        System.out.println("Displaying the field of the object:");
        System.out.println("int x="+x);
        System.out.println("String abc="+abc);
        System.out.println("char c="+c);
    }
}
