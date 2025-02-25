class parameter_c
{
int rno;
String name;
parameter_c(int  x, String n)
{
rno=x;
name=n;
System.out.println(rno);
System.out.println(name);
}
public static void main(String ars[])
{
parameter_c a=new parameter_c(10, "Ram");
parameter_c b=new parameter_c(20, "Pradhyumna");
parameter_c c=new parameter_c(30, "Raj");
}
}