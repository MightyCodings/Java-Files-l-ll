import java.util.*;
class A
{
int a,b,c;
Scanner sc=new Scanner (System.in);
void get()
{
System.out.println("Enter value of  a & b: ");
a=sc.nextInt();
b=sc.nextInt();
}
void add()
{
c=a+b;
}
}
class B extends A
{
//int c;
void show()
{
System.out.println("Answer is:"+c);
}
}
class Single
{
public static void main(String args[])
{
B p=new B();
p.get();
p.add();
p.show();
}
}