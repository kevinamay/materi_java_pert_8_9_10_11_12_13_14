public class Karyawan {
    String NamaLengkap;
    String Pendidikan;
    String Status;
    int ThnMasuk;
    // Constructor tanpa parameter (overload constructor)
    public Karyawan(){
        // kosong
    }

    public Karyawan(String N, String P, String S, int T) {
        NamaLengkap = N;
        Pendidikan = P;
        Status = S;
        ThnMasuk = T;
    }

    //  overload method
    public void ubah(String N){
        NamaLengkap = N;
    }
    public void ubah(String N, String P){
        NamaLengkap = N;
        Pendidikan = P;
    }

    // pewarisan kelas karyawan
    protected int HitungMasaKerja(int T) {
        return (2024 - T);
    }
    
    // private int HitungMasaKerja(int T) {
    //     return (2025 - T);
    // }
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