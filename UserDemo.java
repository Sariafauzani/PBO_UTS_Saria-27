import java.util.Scanner;
public class UserDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menginputkan data customer
        System.out.println("=================================");
        System.out.println("------ Input Data Customer ------");
        System.out.println("=================================");
        System.out.print("Masukkan User ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan Password : ");
        String customerPassword = scanner.nextLine();
        System.out.print("Masukkan Nama     : ");
        String customerName = scanner.nextLine();
        System.out.print("Masukkan Umur     : ");
        int customerAge = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan Email    : ");
        String customerEmail = scanner.nextLine();
        System.out.print("Masukkan dokumen verifikasi (.jpg, .png, .pdf): ");
        String customerDoc = scanner.nextLine();

        // Membuat profil customer
        UserProfile customerProfile = new UserProfile(customerId, customerPassword, customerName, customerAge, customerEmail, customerDoc);
        Customer customer = new Customer(customerProfile);
        
        // Customer login
        System.out.println("\n=================================");
        System.out.println("--------- Customer Login --------");
        System.out.println("=================================");
        System.out.print("Masukkan user ID untuk login: ");
        int loginId = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan password untuk login: ");
        String loginPassword = scanner.nextLine();

        if (customer.log_in(loginId, loginPassword)) {
            // Konfirmasi login berhasil
            System.out.println("Login berhasil! Selamat datang " + customerProfile.get_name() + ".");
            System.out.println("Masukkan dokumen verifikasi untuk customer (.jpg, .png, .pdf): ");
            String verificationDoc = scanner.nextLine();
            customer.apply_verification(verificationDoc);
            System.out.println("Customer verification status: " + customer.get_verification_status());
        } else {
            System.out.println("Login gagal. Silakan periksa User ID atau Password Anda.");
        }
        customer.log_out();
        
        // Menginputkan data admin
        System.out.println("\n=================================");
        System.out.println("-------- Input Data Admin -------");
        System.out.println("=================================");
        System.out.print("Masukkan user ID: ");
        int adminId = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan password: ");
        String adminPassword = scanner.nextLine();
        System.out.print("Masukkan nama: ");
        String adminName = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        int adminAge = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan email: ");
        String adminEmail = scanner.nextLine();
        System.out.print("Masukkan dokumen verifikasi (.jpg, .png, .pdf): ");
        String adminDoc = scanner.nextLine();

        // Membuat profil admin
        UserProfile adminProfile = new UserProfile(adminId, adminPassword, adminName, adminAge, adminEmail, adminDoc);
        Admin admin = new Admin(adminProfile);
        
        // Admin login
        System.out.println("\n=================================");
        System.out.println("----------- Admin Login ---------");
        System.out.println("=================================");
        System.out.print("Masukkan user ID untuk login: ");
        loginId = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan password untuk login: ");
        loginPassword = scanner.nextLine();

        if (admin.log_in(loginId, loginPassword)) {
            System.out.println("Login berhasil! Selamat datang " + adminProfile.get_name() + ".");
            System.out.print("Masukkan ID kendaraan untuk diperbarui: ");
            int vehicleId = scanner.nextInt();
            admin.update_vehicle_details(vehicleId);
            admin.add_vehicle();
            admin.retrieve_complain();
            admin.verify_user();
        } else {
            System.out.println("Login gagal. Silakan periksa User ID atau Password Anda.");
        }
        admin.log_out();

        scanner.close();
    }
}