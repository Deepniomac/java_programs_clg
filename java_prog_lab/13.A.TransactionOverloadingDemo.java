// Ex5-a Method overloading for amount transfer
public class TransactionOverloadingDemo {
    public static void main(String[] args) {
        Transaction txn = new Transaction();
        txn.transferAmount(2500.00, 123456);
        txn.transferAmount(1800.50, 9876543210L);
        txn.transferAmount(999.99, "UPI-QR-ABC-123");
    }
}

class Transaction {
    void transferAmount(double amount, int accountNumber) {
        System.out.println("Transferred " + amount + " to Account No: " + accountNumber);
    }

    void transferAmount(double amount, long phoneNumber) {
        System.out.println("Transferred " + amount + " to Phone No: " + phoneNumber);
    }

    void transferAmount(double amount, String qrCode) {
        System.out.println("Transferred " + amount + " to QR Code: " + qrCode);
    }
}
