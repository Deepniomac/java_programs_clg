// Ex5-b Parent account class for inheritance
package super_sub_classes;

public class Account {
    protected String holderName;
    protected long accountNumber;
    protected double balance;

    public Account(String holderName, long accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showDetails() {
        System.out.println("Holder: " + holderName + ", Account No: " + accountNumber + ", Balance: " + balance);
    }
}
