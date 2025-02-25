class pk
{
int a;
int b;
void get()
{
a=8;
b=6;
}
}
class kp extends pk
{
int c;
void add()
{
c=a+b;
System.out.println(c);
}
}
class c extends kp
{
int z;
void sub()
{
z=a-b;
System.out.println(z);
}
}
class multile
{
public static void main(String args[])
{
c x=new c();
x.get();
x.add();
x.sub();
}
}