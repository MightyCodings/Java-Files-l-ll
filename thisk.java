class thisk
{
void show()
{
System.out.println(this);
}
public static void main(String args[])
{
thisk p= new thisk();
System.out.println(p);
p.show();
}
}