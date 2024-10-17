public class BangunanDemo {
    public static void main(String[] args) {
        // Membuat objek RumahTingkat
        RumahTingkat rumahTingkat = new RumahTingkat(200.0, 3, "Malang", "Tangga Spiral");
        System.out.println("====================================");
        System.out.println("Detail Rumah Tingkat");
        System.out.println("------------------------------------");
        rumahTingkat.tampilkanDetail();
        System.out.println();

        // Membuat objek Apartemen
        Apartemen apartemen = new Apartemen(300.0, 6, "Bandung", "Tangga Lurus", 20, "Gym dan Kolam Renang");
        System.out.println("====================================");
        System.out.println("Detail Apartemen");
        System.out.println("------------------------------------");
        apartemen.tampilkanDetail();
    }
}