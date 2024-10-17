public class Admin extends User {

    // Constructor
    public Admin(UserProfile profile) {
        super(profile);
    }

    // Update vehicle details method
    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Updating vehicle details for vehicle ID: " + vehicle_id);
    }

    // Add vehicle method
    public String add_vehicle() {
        System.out.println("Adding new vehicle...");
        return "New vehicle added";
    }

    // Retrieve complaint method
    public void retrieve_complain() {
        System.out.println("Retrieving complaints...");
    }

    // Verify user method
    public void verify_user() {
        System.out.println("Verifying user...");
    }
}