public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer() {
        this("Default name", 10_000, "default@email.com");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 50_000, emailAddress);
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
