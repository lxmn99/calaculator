public class Calaculator {
	public void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
		
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
		
	}
	public void div(int a,int b)
	{
		System.out.println(a/b);
		
	}

public static void main(String[] args)
{
	Calaculator obj=new Calaculator();
	obj.add(5,10);
	obj.sub(5,10);
	obj.mul(5,10);
	obj.div(5,10);
}

}
