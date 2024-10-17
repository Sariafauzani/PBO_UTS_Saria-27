public class Apartemen extends RumahTingkat {
    private int jmlUnit;
    private String fasilitasUmum;

    //Construktor
    public Apartemen(double luasTanah, int jmlLantai, String lokasi, String jenisTangga, int jmlUnit, String fasilitasUmum) {
        super(luasTanah, jmlLantai, lokasi, jenisTangga);
        this.jmlUnit = jmlUnit;
        this.fasilitasUmum = fasilitasUmum;
    }

    // Method untuk menampilkan fasilitas umum
    public void tampilkanFasilitas(){
        System.out.println("Fasilitas Umum : "+fasilitasUmum);
    }

    // Method untuk menghitung total unit apartemen
    public int hitungTotalUnit(){
        return jmlUnit;
    }

    // Method untuk menampilkan detail apartemen
    @Override
    public void tampilkanDetail(){
        super.tampilkanDetail();
        System.out.println("Jumlah Unit : "+jmlUnit);
        tampilkanFasilitas();
    }
}