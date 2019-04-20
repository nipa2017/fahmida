package sits;



class ford
{
	public void start()
	
	{
		System.out.println("Start the car");
	}
	
		public void stop()
		{
			System.out.println("Stop the car");
		}
		
}

class bmw extends ford

{
	public void bmw_spc()
	{
		System.out.println("special future of bmw");
	}
	
}

class porche extends bmw
{
	public void porche_spc()
	{
		System.out.println("special future of porche");
	}
}



public class Inheritance {

	public static void main(String[] args) {
		porche p=new porche();
		p.start();
		p.stop();
		p.bmw_spc();
		p.porche_spc();
			System.out.println("**********");
			bmw b=new bmw();
			b.start();
			b.stop();
			b.bmw_spc();

	}

}
