import java.util.*;
public class ODA 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        sc.close();
		int i,size;
		System.out.println("Enter Array Size:");
		size=sc.nextInt();
        int a[]=new int[size];
		System.out.println("Enter Array Element");
		for(i=0;i<size;i++)
        {
         a[i]=sc.nextInt();
        } System.out.println("Matrix is:");
        for(i=0;i<size;i++)
        {
        System.out.print("\t"+a[i]);
        }
    }
}