package sits;

public class Conditionalstatement {

	public static void main(String[] args) {
		
		int score =105;
		String grade;
		if (score>=90&& score<100)
		{
			grade="A";
		}
		
		else if(score>=80&& score<90)
		{
			grade="B";
		}
		
		else if(score>=70&& score<80)
		{
			grade="C";
		}
		else 
		{
			grade="D = fail";
		}
		System.out.println(grade);
	}

}
