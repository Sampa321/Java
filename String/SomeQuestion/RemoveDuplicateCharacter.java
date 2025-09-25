package PdfNote.Array_String.String.Q1;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(sb.indexOf(String.valueOf(str.charAt(i)))==-1)
            {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
