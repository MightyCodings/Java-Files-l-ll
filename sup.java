//Accses Variable by super keyword
class A
{
int x=40;
}
class B extends A
{
int x=50;
void print()
{
System.out.println(super.x);
System.out.println(x);
}
}
class sup
{
public static void main(String args[])
{
B s=new B();
s.print();
}
}