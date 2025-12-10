package materi_pert10_tk;

public class KaryawanTetap extends Karyawan2 {
    String NIP;
    int JatahCuti;
    
    // Atribut private baru (Soal Praktikum No. 6)
    private double BonusAkhirTahun;

    public void SetNIP (String nip){
        NIP = nip;
    }
    
    // Method Overloading dari kelas Karyawan (diwariskan)
    public double HitTunjangan (int T){
        int MK = HitungMasaKerja(T); 
        double Tunjangan;
        
        // Memperbaiki logika: cek MK terbesar dulu
        if (MK >= 10)
            Tunjangan = 5000000;
        else if (MK >= 5)
            Tunjangan = 2500000;
        else
            Tunjangan = 1000000;
        return Tunjangan;
    }
    
    public int TampilJatahCuti (){
        return JatahCuti;
    }
    
    // Method baru untuk menghitung bonus (Soal Praktikum No. 7)
    public double HitungBonus (){
        double gaji = GajiPokok(Status); // Menggunakan method GajiPokok yang diwariskan
        
        // Logika Bonus Akhir Tahun (Soal 7)
        if (gaji > 4000000){
            BonusAkhirTahun = gaji * 0.20; // 20% dari Gaji Pokok
        } else {
            BonusAkhirTahun = gaji * 0.10; // 10% dari Gaji Pokok
        }
        return BonusAkhirTahun;
    }
}
