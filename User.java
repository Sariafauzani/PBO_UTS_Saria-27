public class User {
    private UserProfile profile;

    // Constructor
    public User(UserProfile profile) {
        this.profile = profile;
    }

    // Log in method
    public boolean log_in(int user_id, String password) {
        if (profile.get_user_id() == user_id && profile.get_password().equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Login failed!");
            return false;
        }
    }

    // Recover password method
    public void recover_password() {
        System.out.println("Password recovery link sent to: " + profile.get_email());
    }

    // Log out method
    public void log_out() {
        System.out.println("User logged out.");
    }
}