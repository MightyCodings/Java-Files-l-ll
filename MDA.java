import java.util.*;
public class MDA 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,size,j,size1,k,size2,l,size3;
		System.out.println("Enter Array Size:");
		size=sc.nextInt();
		size1=sc.nextInt();
		size2=sc.nextInt();
                                     size3=sc.nextInt();

		int a[][][][]=new int[size][size1][size2][size3];
		System.out.println("Enter Array Element");
		for(i=0;i<size;i++)
		{
		   for(j=0;j<size1;j++)
                                          {
                                              for(k=0;k<size2;k++)
                                                {
                                                   for(l=0;l<size3;l++)
                                                     {
                                                        a[i][j][k][l]=sc.nextInt();
                                                     }
                                                 }
                                         }
                                   } 
                                    System.out.println("MATRIX");
                                          for(i=0;i<size;i++)
		         {
		            for(j=0;j<size1;j++)
                                                  {
                                                     for(k=0;k<size2;k++)
                                                       {
                                                          for(l=0;l<size3;l++)
                                                             {
                                                                System.out.print("\t"+a[i][j][k][l]);
                                                             }System.out.println();
                                                       }System.out.println();
                                                 }System.out.println();
                                            } 

                 
 	}
}