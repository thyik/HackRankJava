package banking;

public class ConsumerAccount extends Account {
	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		super(new AccountHolder(accountNumber), accountNumber, pin, currentBalance);
		// complete the function
	}
}
