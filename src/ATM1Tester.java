
public class ATM1Tester {
	public static void main (String [] args) {
		ATM bank = new ATM ();
		System.out.println (bank.deposit("monke", 10));
		System.out.println(bank.withdraw("monk", 5));
		System.out.println(bank.checkBalance("monke"));
	}
}
