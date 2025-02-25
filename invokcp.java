class invokcp
{
invokcp()
{
this(50);//default invoke coinstructor
System.out.println("Hello");
}
invokcp(int x)
{
System.out.println(x);
}
public static void main(String args[])
{
invokcp p= new invokcp();
}
}