public class Main {

    public static void main(String[] args) {

        BankAccount michalAccount = new BankAccount(23_112_313, 22, "Michal", "michal@email.com", 1_222);
        BankAccount ryszardAccount = new BankAccount("Ryszard", "rysiek@email.com", 22_112_512);

        System.out.println("Sir, here are some details of your client's profile:");
        System.out.println("Customer's name: " + michalAccount.getCustomerName());
        System.out.println("Customer's email: " + michalAccount.getEmail());
        System.out.println("Customer's phone number: " + michalAccount.getPhoneNumber());
        System.out.println("Customer's bank account number: " + michalAccount.getAccountNumber());
        System.out.println("Customer's bank account balance: " + michalAccount.getBalance());

        System.out.println("\n\n");

        michalAccount.deposeFunds(15_000);
        michalAccount.deposeFunds(3_444);
        michalAccount.withdrawMoney(1_231_232);
        michalAccount.withdrawMoney(51_444);
        michalAccount.withdrawMoney(18_400);
        michalAccount.withdrawMoney(66);

        System.out.println("\n\n");

        System.out.println("Sir, here are some details of your client's profile:");
        System.out.println("Customer's name: " + ryszardAccount.getCustomerName());
        System.out.println("Customer's email: " + ryszardAccount.getEmail());
        System.out.println("Customer's phone number: " + ryszardAccount.getPhoneNumber());
        System.out.println("Customer's bank account number: " + ryszardAccount.getAccountNumber());
        System.out.println("Customer's bank account balance: " + ryszardAccount.getBalance());

        System.out.println("\n\n");

        ryszardAccount.withdrawMoney(30);
        ryszardAccount.withdrawMoney(20);

        System.out.println("\n\n");

        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("Anna", "anna@email.com");
        VipCustomer vip3 = new VipCustomer("Jagna", 40_000, "jagna@email.com");

        System.out.println(vip1.getName() + ", " + vip1.getEmailAddress() + ", " + vip1.getCreditLimit());
        System.out.println(vip2.getName() + ", " + vip2.getEmailAddress() + ", " + vip2.getCreditLimit());
        System.out.println(vip3.getName() + ", " + vip3.getEmailAddress() + ", " + vip3.getCreditLimit());

    }
}
