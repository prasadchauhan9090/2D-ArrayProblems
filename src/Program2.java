import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

    public int Demo(int a) {

        System.out.println("PROGRAM2 FOR PRACTICE 2D ARRAY");

        return a;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Program2 program = new Program2();

        program.Demo(5);

        System.out.println("Please  enter the number of rows in row 1");
        int rowSize_arr1 = scanner.nextInt();

        int arr1[][] = new int[rowSize_arr1][];

        for (int i = 0; i < rowSize_arr1; i++) {
            System.out.println("Please column size in the row number" + i);
            int columnSize = scanner.nextInt();
            arr1[i] = new int[columnSize];



            System.out.println("Please enter the column number" + i);
            for (int j = 0; j < columnSize; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Please enter the number of rows in row 2");
        int rowSize_arr2 = scanner.nextInt();

        int arr2[][] = new int[rowSize_arr2][];

        for (int i = 0; i < rowSize_arr2; i++) {
            System.out.println("Please column size in the row number" + i);
            int columnSize = scanner.nextInt();
            arr2[i] = new int[columnSize];

            System.out.println("Please enter the column number" + i);
            for (int j = 0; j < columnSize; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("INPUT1: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println("INPUT2: ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(Arrays.toString(arr2[i]));
        }


        int arr3[][]= new int[arr1.length][];
        for(int i=0;i< arr1.length;i++)
        {
            arr3[i] = new int[arr1[i].length];
            for(int j=0;j<arr1[i].length;j++)
            {
              arr3[i][j]= arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("INPUT3: ");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(Arrays.toString(arr3[i]));
        }







    }
}
