public class DemoKaryawan {
    public static void main(String[] args) {
        // Membuat objek baru yang mengacu pada kelas Karyawan
        Karyawan k1 = new Karyawan("Adi", "S1", "Tetap", 2002);
        Karyawan k2 = new Karyawan("Aditya", "S2", "Kontrak", 2015);

        // Menampilkan data milik objek k1
        System.out.println("Nama Lengkap : " + k1.NamaLengkap);
        System.out.println("Pendidikan : " + k1.Pendidikan);
        System.out.println("Status Karyawan : " + k1.Status);
        System.out.println("Tahun Masuk Kerja: " + k1.ThnMasuk);
        System.out.println("Gaji Pokok : " + k1.GajiPokok(k1.Status));
        System.out.print("Tunjangan : ");
        System.out.println(k1.HitTunjangan(k1.Pendidikan, k1.ThnMasuk));

        System.out.println("--------------------");

        // Menampilkan data milik objek k2
        System.out.println("Nama Lengkap : " + k2.NamaLengkap);
        System.out.println("Pendidikan : " + k2.Pendidikan);
        System.out.println("Status Karyawan : " + k2.Status);
        System.out.println("Tahun Masuk Kerja: " + k2.ThnMasuk);
        System.out.println("Gaji Pokok : " + k2.GajiPokok(k2.Status));
        System.out.print("Tunjangan : ");
        System.out.println(k2.HitTunjangan(k2.Pendidikan, k2.ThnMasuk));
    }
}
