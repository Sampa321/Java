package PdfNote.Array_String.String.Q1;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        String revStr = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            revStr+=str.charAt(i);
        }
        //String revStr=new StringBuilder(str).reverse().toString();
        if(str.equals(revStr))
        {
            System.out.println(str+" is palindrome");
        }
        else {
            System.out.println(str+" is not palindrome");
        }
    }
}
