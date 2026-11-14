import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

    public static void main(String args[])
    {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the number of rows");
        int rowSize=scanner.nextInt();
        int arr[][]= new int[rowSize][];

        for(int i=0;i<rowSize;i++)
        {
            System.out.println("Please column size in the row number"+i);
            int columnSize=scanner.nextInt();
            arr[i]=new int[columnSize];

            System.out.println("Please enter the column number"+i);
            for(int j=0;j<columnSize;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }

        System.out.println("INPUT: ");
        for(int i=0;i<rowSize;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }

        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                sum=sum+arr[i][j];
            }
        }

        System.out.println(sum);










        scanner.close();


    }
}
