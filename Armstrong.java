import java.util.Scanner;
public class Armstrong
{
 public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       sc.close();
       System.out.println("Enter any Number:");
       int n,sum=0,r,t;
       n=sc.nextInt();
       t=n;
      while(n>0)
      {
          r=n%10;
          sum=sum+(r*r*r);
          n=n/10;
      }
      if(sum==t)
       System.out.println("Number is Armstrong");
       else
        System.out.println("Number is Not Armstrong");   
     }
}