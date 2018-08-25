public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Michal", 50.05);
        bank.addCustomer("Adelaide", "Tim", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Michal", 44.22);
        bank.addCustomerTransaction("Adelaide", "Michal", 12.44);
        bank.addCustomerTransaction("Adelaide", "Tim", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

    }
}
