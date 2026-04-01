// Ex5-b Inheritance demo with account package
package super_sub_classes;

public class BankingDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Riya", 10001L, 25000, 4.5);
        CurrentAccount current = new CurrentAccount("Kiran", 10002L, 50000, 20000);
        LoanAccount loan = new LoanAccount("Aman", 10003L, -150000, 150000);

        savings.showDetails();
        savings.showType();

        current.showDetails();
        current.showType();

        loan.showDetails();
        loan.showType();
    }
}
