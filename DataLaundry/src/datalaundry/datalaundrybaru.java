package datalaundry;


public class datalaundrybaru {
    
    private final String nama;
    private final String namabarang;
    private final String jenislayanan;
    private final String jumlahbarang;
    final int harga;
    
        public datalaundrybaru(String nama,String namabarang, String jenislayanan, String jumlahbarang, int harga) {
        this.nama = nama;
        this.namabarang = namabarang;
        this.jenislayanan = jenislayanan;
        this.jumlahbarang = jumlahbarang;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNamaBarang() {
        return namabarang;
    }
    
    public String getJenisLayanan() {
       return jenislayanan;
    }
    
    public String getJumlahBarang() {
       return jumlahbarang;
    }
    
    public int getHarga() {
        return harga;
    }
    
    @Override
    public String toString() {
        return "Data anda: " + "Nama: "+ nama + ", Nama Barang: " + namabarang + ", Jenis Layanan: " + jenislayanan +", Jumlah Barang: " + jumlahbarang +", Harga: " + harga;
}
}
