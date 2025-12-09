public class KaryawanTetap extends Karyawan {
    String NIP;
    int JatahCuti;
    public void SetNIP (String nip){
        NIP = nip;
    }
    public double HitTunjangan (int T){
        int MK = HitungMasaKerja(T);
        double Tunjangan;
        if (MK >= 5)
            Tunjangan = 2500000;
        else if (MK >= 10)
            Tunjangan = 5000000;
        else
            Tunjangan = 1000000;
        return Tunjangan;
    }
    public int TampilJatahCuti (){
        return JatahCuti;
    }
    
}