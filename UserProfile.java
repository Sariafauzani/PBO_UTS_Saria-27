public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc; // Format doc yang diterima .jpg, .png, .pdf

    // Constructor
    public UserProfile(int user_id, String password, String name, int age, String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

    // Getters
    public int get_user_id() {
        return user_id;
    }

    public String get_password() {
        return password;
    }

    public String get_name() {
        return name;
    }

    public int get_age() {
        return age;
    }

    public String get_email() {
        return email_id;
    }

    // Edit profile method
    public void edit_profile(String newName, int newAge, String newEmail) {
        this.name = newName;
        this.age = newAge;
        this.email_id = newEmail;
        System.out.println("Profile updated.");
    }

    // Show documents method
    public void show_documents() {
        System.out.println("Document: " + doc);
    }
}