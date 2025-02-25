import java.util.*;
public class TDA
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,size1,size2;
       System.out.println("Enter Array Size:");
       size1= sc.nextInt();
       size2= sc.nextInt();
       int a[][]=new int[size1][size2];
       System.out.println("Enter Array Element:");
       for(i=0;i<size1;i++)
       {
           for( j=0;j<size2;j++)
           {
               a[i][j]=sc.nextInt();
           }
        }System.out.println("\n");
        System.out.println("Matrix is:");
         for(i=0;i<size1;i++)
         {
             for(j=0;j<size2;j++)
             {
                 System.out.print("\t"+a[i][j]);
             }System.out.println();
         }
    }
}