// Ex5-b Current account child class
package super_sub_classes;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String holderName, long accountNumber, double balance, double overdraftLimit) {
        super(holderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void showType() {
        System.out.println("Current Account with Overdraft Limit: " + overdraftLimit);
    }
}
