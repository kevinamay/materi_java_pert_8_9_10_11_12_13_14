package kunci_soal3;

public class film {
    // [DIUBAH]: Mengubah nama variabel agar lebih sederhana (camelCase)
    protected String judul;
    protected String jenis;
    protected double hargaDasar;
    // [TETAP]: Constructor 3 Parameter
    public film(String judul, String jenis, double harga) {
        this.judul = judul;
        this.jenis = jenis;
        this.hargaDasar = harga;
    }
    // [TETAP]: Constructor 1 Parameter (Soal 1.1)
    public film(String judul) {
        this.judul = judul;
        this.jenis = "2D";
        this.hargaDasar = 40000;
    }
    // [TETAP]: Method Overload (Soal 2.1)
    public double hitungBiaya(int qty) {
        return hargaDasar * qty;
    }
    // [TETAP]: Method Overload dengan Jenis Hari (Soal 2.2)
    public double hitungBiaya(int qty, String hari) {
        double total = hargaDasar * qty;
        if (hari != null && hari.equalsIgnoreCase("Weekend")) {
            total += (qty * 5000); 
        }
        return total;
    }
    // [DITAMBAHKAN]: Getter untuk mengambil judul di struk
    public String getJudul() { return judul; }
}
