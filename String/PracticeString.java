package ClassPractice.Arrays_String.String;

public class PracticeString {
    public static void main(String[] args) {
        /*String str1="hello";
        String str2=new String("hello");
        System.out.println(str1.equals(str2));*/

        String a="hello";
        String b="world";
        String c=a;
        System.out.println(a==c);
        a+=b;
        System.out.println(a);

        System.out.println(c);
    }
}
