package PdfNote.Array_String.String.Q1;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";
        char []charArray1 =str1.toCharArray();
        char []charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean flag =true;
        for(int i=0;i<str1.length();i++)
        {
            if(charArray1[i]!=charArray2[i])
            {
                flag =false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
