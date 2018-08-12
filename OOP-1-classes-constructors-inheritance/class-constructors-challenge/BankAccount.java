public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, int phone) {
        this.accountNumber = accountNumber;
        this.balance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phone;
    }

    public BankAccount() {
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(452312312, 25, customerName, email, phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double deposeFunds(double deposit) {
        this.balance = this.balance + deposit;
        System.out.println("You have succesfully made a deposit of " + deposit + ". The current balance at your bank account is " + balance + ".");
        return balance;
    }

    public double withdrawMoney(double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds for such an operation, " + customerName + ". You tried to withdraw " + withdrawalAmount + " but your balance is " + balance + ".");
            return balance;
        } else {
            this.balance = this.balance - withdrawalAmount;
            System.out.println("You have withdrawn " + withdrawalAmount + ". Your current balance is " + balance + ".");
            return balance;
        }
    }

}
