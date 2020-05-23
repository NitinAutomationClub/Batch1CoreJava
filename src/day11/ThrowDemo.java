package day11;
//User Define Exception

class YoungAgeException extends RuntimeException
{
	YoungAgeException(String msg)
	{
		super(msg);
	}
}

public class ThrowDemo {

	public static void main(String[] args) {
		
		int age=15;
		try
		{
		if(age<18)
		{
			
			throw new YoungAgeException("You are Not Eligible for Voting");
		}
		else
		{
			System.out.println("You are Eligible for voting");
		}
		}
		catch(YoungAgeException e)
		{
			e.printStackTrace();
			//System.out.println("User Defined Exception made by me::"+e);
		}
	}

}
