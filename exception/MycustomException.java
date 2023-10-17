package exception;

public class MycustomException extends EmpSkill{
	public MycustomException(String str)
	{
		super(str);
	}

	public static void main(String[] args) throws EmpSkill {
		// TODO Auto-generated method stub
		try
		{
			skill("p5");
		}
		catch(MycustomException e)
		{
			System.out.println(e);
		}
		

	}

}
