class invokc
{
invokc()
{
System.out.println("Hello");
}
invokc(int x)
{
this(); //default invoke coinstructor
System.out.println(x);
}
public static void main(String args[])
{
invokc p= new invokc(30);
System.out.println(p);
}
}