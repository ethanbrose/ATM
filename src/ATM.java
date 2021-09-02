import java.util.HashMap;


public class ATM {
	

		HashMap<String, Double> bankBalances = new HashMap<String,Double>();
		/**
		 * deposits money into an account unless the account doesn't exist or the value is negative
		 * 
		 * @param theID is the id of the account that money will be deposited to
		 * @param amount is the amount to be deposited
		 * 
		 * @return true if the money is successfully deposited, false otherwise
		 */
		public boolean deposit (String theID, double amount)
		{
			if (amount < 0) {
				return false;
			}	
			else if (!(bankBalances.containsKey(theID)))
			{
				 
				bankBalances.put(theID, amount);
			}
			else
			{
				bankBalances.put(theID, bankBalances.get(theID)+amount);
			}
			return true;
		}
		/**
		 * will withdraw the inputed amount of money unless the id doesn't exist or there's an insufficient balance
		 * 
		 * @param theID is the id of the account that money will be withdrawed from
		 * @param withdrawAmount is the amount of money to be withdrawed
		 * @return true if money is successfully withdrawed, false otherwise
		 */
		public boolean withdraw (String theID, double withdrawAmount) {
			if (bankBalances.get(theID) < withdrawAmount) {
				return false;
			}
			double currentAmount = bankBalances.get(theID);
			if (withdrawAmount > currentAmount)return false;
			bankBalances.replace(theID, currentAmount-withdrawAmount);
			return true;
		}
		/**
		 * finds the balance of the corresponding account
		 * @param theID is the ID of the account to be checked
		 * @return if the account exists, returns the amount of money in account. otherwise, returns -1
		 */
		public double checkBalance (String theID) {
			if (bankBalances.containsKey(theID)) return bankBalances.get(theID);
			return -1;
		}


}
