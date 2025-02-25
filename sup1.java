//Accses Method by super keyword
class A
{
void print()
{
System.out.println("Hello");
}
}
class B extends A
{
int x=50;
void print()
{
System.out.println();
System.out.println(x);
}
}
class sup1
{
public static void main(String args[])
{
B s=new B();
s.print();
}
}