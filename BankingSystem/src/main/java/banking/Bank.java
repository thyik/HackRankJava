package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;
	Long uniqueNUmber = 0L;
	
	public Bank() {
		// complete the function
		accounts = new LinkedHashMap<Long, Account>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		uniqueNUmber++;
		accounts.put(uniqueNUmber, new CommercialAccount(company, uniqueNUmber, pin,startingDeposit));
		return uniqueNUmber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		uniqueNUmber++;
		accounts.put(uniqueNUmber, new ConsumerAccount(person, uniqueNUmber, pin,startingDeposit));
		return uniqueNUmber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
        return getAccount(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		// complete the function
        return getAccount(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		getAccount(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
        return getAccount(accountNumber).debitAccount(amount);
	}
}
