package exception;

public class EmpSkill extends Exception {
	public EmpSkill(String str) {
		super(str);
	}
	static void skill(String proficiency)throws EmpSkill{
		if(proficiency=="p5")
		{
			throw new EmpSkill("Expert in java");
		}
		else
		{
			throw new EmpSkill("Beginer in java");
		}
	}
	

}
