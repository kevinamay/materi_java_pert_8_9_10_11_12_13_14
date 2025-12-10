package materi_pert10_tk;

public class Karyawan2 {
    String NamaLengkap;
    String Pendidikan;
    String Status;
    int ThnMasuk;
    
    // Constructor 1: tanpa parameter (overload constructor)
    public Karyawan2(){
        // kosong
    }

    // Constructor 2: dengan 4 parameter
    public Karyawan2(String N, String P, String S, int T) {
        NamaLengkap = N;
        Pendidikan = P;
        Status = S;
        ThnMasuk = T;
    }

    // Constructor 3 (OVERLOAD BARU): dengan 2 parameter (Soal Praktikum No. 1)
    public Karyawan2(String N, int T) {
        NamaLengkap = N;
        ThnMasuk = T;
        Pendidikan = "SMA"; // Nilai default (Soal 1)
        Status = "Non-Staf"; // Nilai default (Soal 1)
    }

    // Method Overload 1
    public void ubah(String N){
        NamaLengkap = N;
    }
    
    // Method Overload 2
    public void ubah(String N, String P){
        NamaLengkap = N;
        Pendidikan = P;
    }

    // Method Overload 3 (OVERLOAD BARU): 3 parameter (Soal Praktikum No. 3)
    public void ubah(String N, String P, String S){
        NamaLengkap = N;
        Pendidikan = P;
        Status = S;
    }

    // Metode diubah dari protected menjadi public (Soal Praktikum No. 5)
    public int HitungMasaKerja(int T) {
        // Mengubah tahun asumsi dari 2024 menjadi 2025 untuk perhitungan yang lebih futuristik
        return (2025 - T); 
    }
    
    public double GajiPokok(String S) {
        double GaPok = 0;
        // GajiPokok dibedakan berdasarkan status karyawan
        if (S != null && S.equals("Tetap"))
            GaPok = 3500000;
        else if (S != null && S.equals("Kontrak"))
            GaPok = 2500000; // Nilai diubah dari 500k menjadi 2.5jt
        else 
            GaPok = 1500000; // Untuk Non-Staf/default
        return GaPok;
    }

    public double HitTunjangan(String P, int T) {
        int MK = HitungMasaKerja(T);
        double Tunjangan;
        
        // Memperbaiki logika: cek masa kerja (MK) terbesar terlebih dahulu
        if (P != null && P.equals("S2") && MK >= 10)
            Tunjangan = 10000000;
        else if (P != null && P.equals("S2") && MK >= 5)
            Tunjangan = 5000000;
        else if (P != null && P.equals("S1") && MK >= 10)
            Tunjangan = 5000000;
        else if (P != null && P.equals("S1") && MK >= 5)
            Tunjangan = 2500000;
        else
            Tunjangan = 1000000;
        return Tunjangan;
    }
}