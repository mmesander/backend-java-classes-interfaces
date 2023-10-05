public class SmsContact implements ContactInfo {
    // Variables
    private String phoneNumber;


    // Constructor
    public SmsContact(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    // Methods
    @Override
    public void sendMessage() {
        System.out.println("Sms send to " + phoneNumber);
    }


    // Getters and Setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
