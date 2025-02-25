//Method Overloding
class A
{
 int a=10;
 int b=30;
	void add()	
	{
		System.out.println("Addition="+(a+b));
	}
	void add(int x)
	{
		System.out.println("Addition="+(x+b));
	}
	void add(int p,int q)
	{
 		System.out.println("Addition="+(p+q));
	}
}
class overload
{
	public static void main(String args[])
	{
		A z=new A();
		z.add();
		z.add(20);
		z.add(2,4);
	}
}