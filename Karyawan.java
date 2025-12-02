public class Karyawan {
    String NamaLengkap;
    String Pendidikan;
    String Status;
    int ThnMasuk;

    
    public Karyawan(String N, String P, String S, int T) {
        NamaLengkap = N;
        Pendidikan = P;
        Status = S;
        ThnMasuk = T;
    }


    private int HitungMasaKerja(int T) {
        // tahun sekarang dikurangi tahun masuk kerja
        // Catatan: Buku menggunakan tahun tetap 2017
        return (2017 - T);
    }

    public double GajiPokok(String S) {
        double GaPok = 0;

        // GajiPokok dibedakan berdasarkan status karyawan
        if (S.equals("Tetap"))
            GaPok = 3500000;
        else if (S.equals("Kontrak"))
            GaPok = 500000;
        
        return GaPok;
    }

    public double HitTunjangan(String P, int T) {
        int MK = HitungMasaKerja(T);
        double Tunjangan;

        // Tunjangan ditentukan berdasarkan pendidikan dan masa kerja
        if (P.equals("S1") && MK >= 5)
            Tunjangan = 2500000;
        else if (P.equals("S1") && MK >= 10)
            Tunjangan = 5000000;
        else if (P.equals("S2") && MK >= 5)
            Tunjangan = 5000000;
        else if (P.equals("S2") && MK >= 10)
            Tunjangan = 10000000;
        else
            Tunjangan = 1000000;
        
        return Tunjangan;
    }
}