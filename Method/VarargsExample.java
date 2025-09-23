package PdfNote.Method.Q2;

public class VarargsExample {
    public static void main(String[] args) {
        printNumbers(1,2,3,4,5);
        printNumbers(10,20);
        printNumbers();   //No arguments
    }
    public static void printNumbers(int...numbers)
    {
        for(int num : numbers)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
