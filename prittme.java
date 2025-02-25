class A
{
	void swap(int a,int b)
	{
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("a="+a+"b="+b);
	}
}
class prittme
{
	public static void main(String args[])
	{
		int a=20;
		int b=30;
		A p = new A();
		System.out.println("a="+a+"b="+b); //print orignal value. 
		p.swap(a,b);
		//System.out.println("a="+a+"b="+b);
	}
}