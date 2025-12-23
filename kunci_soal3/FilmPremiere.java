package kunci_soal3;

public class FilmPremiere extends film {
    
    // [DIUBAH]: Nama variabel menjadi biayaLayanan (Soal 3.1)
    private final double biayaLayanan = 15000.0;

    public FilmPremiere(String judul, String jenis, double harga) {
        super(judul, jenis, harga);
    }
    // [DIUBAH]: Logika Overriding (Soal 4.1 & 4.2)
    @Override
    public double hitungBiaya(int qty) {
        // Rumus: Total Tiket Dasar + Biaya Layanan
        return super.hitungBiaya(qty) + biayaLayanan;
    }
}