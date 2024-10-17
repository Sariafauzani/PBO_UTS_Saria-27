public class Customer extends User {
    private boolean verification_status = false;

    // Constructor
    public Customer(UserProfile profile) {
        super(profile);
    }

    // Get verification status method
    public boolean get_verification_status() {
        return verification_status;
    }

    // Apply verification method
    public void apply_verification(String doc) {
        if (doc.endsWith(".jpg") || doc.endsWith(".png") || doc.endsWith(".pdf")) {
            System.out.println("Verification applied with document: " + doc);
            verification_status = true;
        } else {
            System.out.println("Invalid document format. Please upload .jpg, .png, or .pdf file.");
        }
    }
}