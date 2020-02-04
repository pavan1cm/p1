package pcm1;

class abc
{
	public static void add()
	{
		int a = 10;
		int b = 15;
		int sum = a  + b;
		System.out.println("Sum is "+ sum);
	}
	public static void div()
	{
		int a = 0;
		int b = 0;
		int div = a  / b;
		System.out.println("Quot is "+ div);
	}
}
public class demo3 {

	public static void main(String[] args) 
{
      abc b=new abc();
      try {
      b.div();}
      catch(Exception euytg)
      {
    	 System.out.println("MAth Error");
      }
      b.add();
}

}

