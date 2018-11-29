
public class Get_Average {

	// Abanoub Maged
	// 20160002
	
	public int Get_Average(int input[])
	{
		int sum = 0;
		int avg = 0;

		for(int i=0; i<input.length; i++)
		{
			sum = sum + input[i];
		}
		
		avg = sum/input.length;

		return avg;
	}
}
