//Accses value (argument) by super keyword
class A
{
 A(int a)
{
System.out.println(a);
}
}
class B extends A
{
B()
{
super(45);
System.out.println("Hello Students");
}
}
class sup2
{
public static void main(String args[])
{
B s=new B();
}
}