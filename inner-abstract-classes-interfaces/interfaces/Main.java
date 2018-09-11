public class Main {

    public static void main(String[] args) {
	ITelephone myPhone;
	myPhone = new DeskPhone(332211);
	myPhone.powerOn();
	myPhone.callPhone(332211);
	myPhone.answer();

	myPhone = new MobilePhone(12345);
	myPhone.powerOn();
	myPhone.callPhone(12345);
	myPhone.answer();
    }
}
