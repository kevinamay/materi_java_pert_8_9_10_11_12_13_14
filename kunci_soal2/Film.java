package kunci_soal2; // Sesuaikan package Anda
public class Film {
    // Atribut (Data Member)
    String JudulFilm;
    String JenisTayangan; // Contoh: "2D", "3D"
    double HargaTiketDasar;
    // Constructor 1: Tiga Parameter (untuk inisialisasi semua)
    public Film(String J, String Jns, double Hrg) {
        JudulFilm = J;
        JenisTayangan = Jns;
        HargaTiketDasar = Hrg;
    }
    // Constructor 2: Satu Parameter (Soal 1.1)
    public Film(String J) {
        JudulFilm = J;
        // Pengaturan Default
        JenisTayangan = "2D";
        HargaTiketDasar = 40000;
    }
    // Getter untuk HargaTiketDasar (Diubah menjadi protected untuk Subkelas)
    protected double getHargaDasar() {
        return HargaTiketDasar;
    }
    // Method Overload 1: Menghitung Biaya Dasar
    public double hitungBiaya(int jumlahTiket) {
        return HargaTiketDasar * jumlahTiket;
    }
    // Method Overload 2: Menghitung Biaya dengan Jenis Hari
    public double hitungBiaya(int jumlahTiket, String jenisHari) {
        double biayaDasar = HargaTiketDasar * jumlahTiket;
        double tambahan = 0;
        // Aturan Biaya Weekend
        if (jenisHari != null && jenisHari.equalsIgnoreCase("Weekend")) {
            tambahan = jumlahTiket * 5000;
        }
        return biayaDasar + tambahan;
    }
}
