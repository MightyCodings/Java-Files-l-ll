import java.util.*;
class A
{
Scanner sc=new Scanner(System.in);
int a,b;
void get()
{
System.out.println("Enter any two no:");
a=sc.nextInt();
b=sc.nextInt();
//a=12;
//b=11;
}
}
class B extends A
{
int c;
void add()
{
c=a+b;
System.out.println(c);
}
}
class C extends A
{
int z;
void mult()
{
z=a*b;
System.out.println(z);
}
}
class heir
{
public static void main(String args[])
{
B p=new B();
C q=new C();
p.get();
p.add();
q.get();
q.mult();
}
}