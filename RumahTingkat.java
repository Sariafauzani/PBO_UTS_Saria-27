class RumahTingkat extends BangunanRumah {
    protected String jenisTangga;

    // construktor
    public RumahTingkat(double luasTanah, int jmlLantai, String lokasi, String jenisTangga){
        super(luasTanah, jmlLantai, lokasi);
        this.jenisTangga = jenisTangga;
    }

    // Method untuk memghitung luas lantai total rumah tingkat
    public int hitungLuasTingkat() {
        return jmlLantai * 100; // Misal setiap lantai 100 m2
    }

    // Method untuk menam[ilkan detail rumah tingkat
    public void tampilkanDetail() {
        super.tampilkanInfo();
        System.out.println("Jenis Tangga : "+jenisTangga); // cont. tangga spiral
        System.out.println("Luas Total : "+hitungLuasTingkat()+" m2");
    }
}