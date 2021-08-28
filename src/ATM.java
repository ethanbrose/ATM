import java.util.*;


public class ATM {
	public static void main (String[]args)
	{
		
		HashMap<String, Integer> bankBalances = new HashMap<String,Integer>();
		
		
		public void deposit (String theID, int amount)
		{
			if (!(bankBalances.containsKey(theID)))
			{
				bankBalances.put(theID, amount);
			}
			else
			{
				bankBalances.put(theID, bankBalances.get(theID)+amount)
			}
		}
	}


}
