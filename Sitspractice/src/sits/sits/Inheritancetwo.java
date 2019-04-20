package sits;



class loan //loan class
{// loan class start
	public void student_loan()
	
	{//method start
		System.out.println("have student loan");
	}//methods ends


    public void student_credit_loan()
    {//methods start
    	System.out.println("student debt needed to pay off");
    }// methods ends
}//loan class ends

class car_loan extends loan
{
	public void my_car_payment()
	{
		System.out.println("neeed to pay car loan");
	}
}

class mortgage_loan extends car_loan
{
	public void pay_mortgage_loan()
	{
		System.out.println("pay mortgage on 1st day of the month");
	}
	
}

public class Inheritancetwo 
{

	public static void main(String[] args) {
		
		mortgage_loan m= new mortgage_loan();// creating instances (of loan mortgage)
		m.student_loan();
		m.student_credit_loan();
		m.my_car_payment();
		m.pay_mortgage_loan();
		{
			System.out.println("----------------------");
			
		}
		car_loan C= new car_loan();
		C.student_loan();
		C.student_credit_loan();
		C.my_car_payment();
		{
			System.out.println("homework done");
		}
	}

}
