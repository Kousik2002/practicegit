package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int x=100;
				System.out.println(x/0);
			}
			catch(Exception e)
			{
				System.out.println("Exception occured in inner try block1"+e);
			}
			try {
				String s="Accenture";
				int num=Integer.parseInt(s);
			}
			catch(Exception e)
			{
				System.out.println("Exception occured in inner try block2"+e);
			}
		
		
		
		
		/*try {
		int a=5;
		int b=0;
		int c;
		//System.out.println(a/b);
		
		String s="Accenture";
		int num=Integer.parseInt(s);*/
		int[] arr= {1,2,3,4,5};
		System.out.println(arr[7]);
		
		}
		catch(Exception e)
		{
			System.out.println("Exception in outer try block"+e);
		}
		finally {
			System.out.println("This is the finally block");
		}
		
		
		
	    

	}

}
