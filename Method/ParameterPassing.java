package PdfNote.Method.Q1;

public class ParameterPassing {
    public static void main(String[] args) {
        int num=10;
        changeValue(num);
        System.out.println(num);

        String str = "Hello";
        changeString(str);
        System.out.println(str);

        Person person = new Person("Sampa");
        changeName(person);
        System.out.println(person.name);
    }
    public static void changeValue(int n)
    {
        n=n+1;
    }
    public static void changeString(String s)
    {
        s="Hii";
    }

    public static void changeName(Person p)
    {
        p.name ="Mamon";
    }
}
