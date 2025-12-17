package kunci_soal2; // Sesuaikan package Anda

public class FilmPremiere extends Film {
    
    // Atribut Private (Soal 3.1)
    private final double BiayaLayananPremiere = 15000.0;

    // Constructor Subkelas (Memanggil Superclass Constructor)
    public FilmPremiere(String judul, String jenis, double harga) {
        super(judul, jenis, harga);
    }

    // Method Overriding: hitungBiaya (Soal 4.1 & 4.2)
    @Override
    public double hitungBiaya(int jumlahTiket) {
        // 1. Hitung Total Harga Tiket Dasar dari Superclass
        double totalHargaTiketDasar = super.hitungBiaya(jumlahTiket);
        
        // 2. Tambahkan Biaya Layanan Premiere
        double totalBiayaFinal = totalHargaTiketDasar + BiayaLayananPremiere;
        
        return totalBiayaFinal;
    }
    
    public double getBiayaLayanan() {
        return BiayaLayananPremiere;
    }
}
