package ClassPractice.Arrays_String.Array;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        /*int [] a={12,22,13,4};
        int [] b=new int[] {4,12,13,22}; //length is 4
        char [] ch=new char[3];
        System.out.println(ch[0]); //Empty char
        System.out.println(b.length);//4
//        b[2]=34;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.equals(a,b));*/


        int [] a={1,2,3,4};  //[1.2.3.4]  /1d array
        int [] b={5,6,7,8}; //[5,6,7,8]
        //traversal of 1-D Array
        /*for(int i:a)
        {
            System.out.println(i);
        }*/


        //Array of arrays.
        int [] [] c={a,b};
        int [] [] d={     //2-D Array
                {1,2,3,4},
                {5,6,7,8}
        };
        //access 2-d array
        System.out.println(Arrays.toString(d[1]));
        //access 2d array 1 element
        System.out.println(d[1][0]);

        //Traversal of 2-D Array
        System.out.println("Traversing the 2-Dimensional array:");
        System.out.println("Approach 1");
        for(int [] i : d)
        {
            System.out.println(Arrays.toString(i));
        }

        System.out.println();
        System.out.println("Approach 2");
        for (int i=0;i<d.length;i++)
        {
            for(int j=0;j<d[i].length;j++)
            {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("End of traversal of 2-D array");


        int [] [] []e={    //3-d array
                {{1,2,3},{4,5,6}},
                {{7,8,9},{10,11,12}},
                {{11,23,45},{90,70}}
        };
        System.out.println(Arrays.toString(e[1][0])); //[7,8,9] (we use Arrays.toString use for print an array)
        System.out.println(e[1][0][2]); //9 (we print an element so,can't use Arrays.toString )

        System.out.println("Traversing a 3d array:");
        for (int i=0;i<e.length;i++)
        {
            for(int j=0;j<e[i].length;j++)
            {
                System.out.print("[");
                for(int k=0;k<e[i][j].length;k++)
                {
                    System.out.print(e[i][j][k]+" ");
                }
                System.out.print("]");
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
