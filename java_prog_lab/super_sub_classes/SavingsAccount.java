// Ex5-b Savings account child class
package super_sub_classes;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String holderName, long accountNumber, double balance, double interestRate) {
        super(holderName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void showType() {
        System.out.println("Savings Account with Interest Rate: " + interestRate + "%");
    }
}
