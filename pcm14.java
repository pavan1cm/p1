package pcm1;

import java.io.IOException;

public class pcm14 
{
	public static void main(String[] args) throws IOException 
	{
			HomePage h = new HomePage();
			h.welcome();
			h.open(); 
			
			System.out.println(h.verify());
			h.close();
	}
}