import java.util.HashMap;


public class ATM {
	

		HashMap<String, Double> bankBalances = new HashMap<String,Double>();
		
		public void deposit (String theID, double amount)
		{
			if (amount < 0) {
			}	
			else if (!(bankBalances.containsKey(theID)))
			{
				bankBalances.put(theID, amount);
			}
			else
			{
				bankBalances.put(theID, bankBalances.get(theID)+amount);
			}
		}
		
		public boolean withDraw (String theID, double withdrawAmount) {
			if (bankBalances.get(theID) < withdrawAmount) {
				return false;
			}
			bankBalances.
			return true;
		}
		//returns -1 if account doesn't exist
		public double checkBalance (String theID) {
			if (bankBalances.containsKey(theID)) return bankBalances.get(theID);
			return -1;
		}


}
