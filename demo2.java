package pcm1;

class don
{
		int b = 100;
		public void DON()
		{
			System.out.println("Empty Don");
		}
		public void DON(int a)
		{
			System.out.println("Integer Don");
			System.out.println(10+a);
		}
		public void DON(int a,int b)
		{
			System.out.println("Integer Don and Friend Don");
			System.out.println(10+a+b);
		}
}

 public class demo2 
{	
	public static void main(String[] args) 
	{
	don d=new don();
	d.DON();
	d.DON(10);
	d.DON(10,20);
	}
}

/*class don implements calculator
{
	public void math()
	{
		System.out.println("This is math function");
	}

	@Override
	public void num1() {
		// TODO Auto-generated method stub
		System.out.println("a=10");
	}

	@Override
	public void num2() {
		// TODO Auto-generated method stub
		System.out.println("b=20");	
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("This is add function");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("This is sub function");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("This is mul function");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("This is div function");
	}
public class demo2
	public static void main(String[] args) 
	{
	demo2 d=new demo2();
	d.num1();
	d.num2();
	d.add();
	d.sub();
	d.mul();
	d.div();
	}
}*/







