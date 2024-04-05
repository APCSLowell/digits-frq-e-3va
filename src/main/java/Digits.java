import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
		String digitListS = Integer.toString(num);
		for(int i = 0; i < digitListS.length()-1; i++) {
			digitList.add(Integer.parseInt(digitListS.substring(i, i+1)));
		}
		return digitList;
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		boolean val = true;
		for(int i = 0; i < digitList.size()-1; i++) {
			if(digitList.get(i) >= digitList.get(i+1))
				val = false;
			else val = true;
		}
		return val;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
