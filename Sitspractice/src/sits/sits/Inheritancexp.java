package sits;



class Gradpa
{
	public void house()
	{
		System.out.println("castle");
	}
	public void gold()
	{
		System.out.println("lots of gold");
	}
}
class Father extends Gradpa
{
	public void father_house()
	{
		System.out.println("big house");
		
	}

}
class Me extends Father
{
	public void money()
	{
		System.out.println("lots of money");
	}
}


public class Inheritancexp {

	public static void main(String[] args) {
		
		Father f= new Father();
		f.house();
		f.gold();
		f.father_house();

		System.out.println("*****************");

		Me m= new Me();
		m.father_house();
		m.gold();
		m.money();
		m.house();
	}

}
