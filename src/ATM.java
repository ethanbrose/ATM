import java.util.HashMap;


public class ATM {
	

		HashMap<String, Double> bankBalances = new HashMap<String,Double>();
		
		public void deposit (String theID, double amount)
		{
			if (!(bankBalances.containsKey(theID)))
			{
				bankBalances.put(theID, amount);
			}
			else
			{
				bankBalances.put(theID, bankBalances.get(theID)+amount);
			}
		}


}
