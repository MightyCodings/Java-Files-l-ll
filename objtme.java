class emp
{
		int id;
		emp(int id)
		{
		this.id=id;	
		}
}
class a
	{
	emp t;
	void swap(emp x,emp y)
	{
	t=x;
	x=y;
	y=t;
	System.out.println("a="+x.id+"b="+y.id);
	}
	}
class objtme
{
	public static void main(String args[])
	{
		emp a = new emp(40);
		emp b = new emp(60);
		a p = new a();
		System.out.println("a="+a.id+"b="+b.id); //print orignal value. 
		p.swap(a,b);
		//System.out.println("a="+a.id+"b="+b.id);
	}
}