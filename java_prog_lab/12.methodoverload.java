// Program to transfer amount using method overloading
class Transaction {

    void transferAmount(int accNo, double amt) {
        System.out.println("Transfer " + amt + " using Account No " + accNo);
    }

    void transferAmount(long phone, double amt) {
        System.out.println("Transfer " + amt + " using Phone " + phone);
    }

    void transferAmount(String qr, double amt) {
        System.out.println("Transfer " + amt + " using QR " + qr);
    }

    public static void main(String[] args) {
        Transaction t = new Transaction();
        t.transferAmount(12345, 5000);
        t.transferAmount(9876543210L, 2000);
        t.transferAmount("QR123", 1000);
    }
}