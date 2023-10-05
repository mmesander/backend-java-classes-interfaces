public class EmailContact implements ContactInfo {
    // Variables
    private String email;


    // Constructor
    public EmailContact(String email) {
        this.email = email;
    }


    // Methods
    @Override
    public void sendMessage() {
        System.out.println("Email send to " + email);
    }


    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
