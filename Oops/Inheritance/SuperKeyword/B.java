class B extends A{
    int c;
    B(int a,int b,int c)
    {
        super(a,b);
        this.c=c;
        System.out.println(super.a); //This is parent class instance variable
        int r=super.add();
        System.out.println(r); //parent class function call
    }

    public static void main(String[] args) {
        B obj=new B(4,5,6);
    }
}
