public class BangunanRumah {
    protected double luasTanah;
    protected int jmlLantai;
    protected String lokasi;

    // Construktor
    public BangunanRumah(double luasTanah, int jmlLantai, String lokasi) {
        this.luasTanah = luasTanah;
        this.jmlLantai = jmlLantai;
        this.lokasi = lokasi;
    }

    // Method untuk menghitung luas tanah
    public double hitungLuas() {
        return luasTanah;
    }

    // Method untuk menampilkan informasi bangunan
    public void tampilkanInfo(){
        System.out.println("Lokasi : "+lokasi);
        System.out.println("Jumlah Lantai : "+jmlLantai);
        System.out.println("Luas Tanah : "+luasTanah+" m2");
    }
}