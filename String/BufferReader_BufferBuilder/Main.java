package PdfNote.Array_String.String.BufferReader_BufferBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder(50);

        System.out.println(sb2.length());  //5
        System.out.println(sb3.length());  //0

        System.out.println(sb2.charAt(2)); //l
        System.out.println(sb2.append(12)); //Hello12
        System.out.println(sb2.reverse()); //21olleH
        System.out.println(sb2.indexOf("e"));  //5

        sb2.deleteCharAt(1);
        System.out.println(sb2);  //2olleH

        sb2.insert(4,"a");
        System.out.println(sb2); //2ollaeH

        System.out.println(sb2.toString());
    }
}
