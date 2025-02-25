class student
{
int sid;
String sname;
student(int x, String y )
{
sid=x;
sname=y;
System.out.println(sid);
System.out.println(sname);
}
public static void main(String ars[])
{
student a=new student(1,"Ramesh");
System.out.println("  ");
student b= new student(2, "Navin");
System.out.println("  ");
student c= new student(3, "Santosh");
System.out.println("  ");
student d= new student(4, "Dhiraj");
System.out.println("  ");
student e= new student(5, "Pankaj");
}
}