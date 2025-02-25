class arrtome
{
void show(int x[])
{
System.out.print("Array Elements are:");
for(int i:x)
{
System.out.print("\t"+i);
}
}
public static void main(String args[])
{
int a[]={10,20,30};
arrtome p=new arrtome();
p.show(a);
}
} 