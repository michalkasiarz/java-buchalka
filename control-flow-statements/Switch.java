public class Switch {

    public static void main(String[] args) {

        int switchValue = 7;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Value was 3, 4, 5 or 6");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4, 5 or 6");
                break;
        }


        char riterka = 'D';
        switch (riterka) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(riterka + " was found!");
                break;
            default:
                System.out.println("Nothing was found.");
                break;
        }

        String day = "tuESdAy";
        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            case "saturday":
            case "sunday":
                System.out.println("Today is " + day.toLowerCase());
                break;
            default:
                System.out.println("Invalid data.");
                break;
        }
    }
}
