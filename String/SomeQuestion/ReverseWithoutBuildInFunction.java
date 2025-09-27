package PdfNote.Array_String.String.Q1;

public class ReverseWithoutBuildInFunction {
    public static void main(String[] args) {
        String str = "Hello";
        String revStr = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            revStr+=str.charAt(i);
        }
        System.out.println(revStr);
    }
}
