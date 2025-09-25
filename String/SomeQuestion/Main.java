package PdfNote.Array_String.String.Q1;

import PdfNote.JavaNote.SizeOfDataType;

public class Main {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println("a==b : "+(a==b)); //true
        System.out.println("a==c : "+(a==c));  //false

        a+=" world";
        System.out.println(a); //hello world

        a = a.concat("!");
        System.out.println(a);  //hello world!

        System.out.println(a.length());  //12

        System.out.println(a.charAt(4));  //o

        System.out.println(a.substring(0,4)); //hell

        System.out.println(a.equals(c));  //false

        System.out.println(a.contains("world"));  //true

        System.out.println(a.indexOf("world"));  //6

        System.out.println("hello".compareTo("hhllo"));

        System.out.println(" "+a);  //  hello world!
        System.out.println(a.trim()); //hello world! (extra space remove)

        System.out.println(a.toUpperCase()); //HELLO WORLD!
        System.out.println(a.toLowerCase());  // hello world!

        char [ ]charArray=a.toCharArray();
        for(char ch:charArray)
        {
            System.out.print(ch+" ");
        }

    }
}
