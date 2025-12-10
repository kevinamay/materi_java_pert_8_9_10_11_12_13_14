package materi_pert10_tk;

// import java.util.Scanner;

public class DemoKaryawan {
    public static void main(String[] args) {
        
        // CONTOH 1 - Karyawan 1 (Default)
        Karyawan2 k1 = new Karyawan2();
        System.out.println("--- DATA KARYAWAN 1 (Default) ---");
        System.out.println("Nama Lengkap : " + k1.NamaLengkap);
        System.out.println("Gaji Pokok : " + k1.GajiPokok(k1.Status));
        System.out.println("--------------------");

        // CONTOH 1 - Karyawan 2 (4 Parameter)
        Karyawan2 k2 = new Karyawan2("Aditya", "S2", "Kontrak", 2015);
        System.out.println("--- DATA KARYAWAN 2 (Awal: Kontrak) ---");
        System.out.println("Nama Lengkap : " + k2.NamaLengkap);
        System.out.println("Status Karyawan : " + k2.Status);
        System.out.println("Gaji Pokok : " + k2.GajiPokok(k2.Status)); // Rp2.500.000

        // Uji Method Overload Ketiga (Soal Praktikum No. 4)
        k2.ubah("Aditya", "S2", "Tetap"); // Menggunakan method ubah 3 parameter
        System.out.println("\n--- DATA KARYAWAN 2 (Setelah Method Overload) ---");
        System.out.println("Status Karyawan : " + k2.Status); // Menjadi "Tetap"
        System.out.println("Gaji Pokok Baru : " + k2.GajiPokok(k2.Status)); // Rp3.500.000

        // KARYAWAN 3 (Menggunakan Constructor Overload BARU 2 parameter) (Soal Praktikum No. 2)
        Karyawan2 k3 = new Karyawan2("Budi Santoso", 2020);
        System.out.println("\n--- DATA KARYAWAN 3 (Constructor Overload Baru) ---");
        System.out.println("Nama Lengkap : " + k3.NamaLengkap);
        System.out.println("Pendidikan : " + k3.Pendidikan); // SMA
        System.out.println("Status Karyawan : " + k3.Status); // Non-Staf
        System.out.println("Tahun Masuk Kerja: " + k3.ThnMasuk);
        System.out.println("Gaji Pokok : " + k3.GajiPokok(k3.Status)); // Rp1.500.000
        System.out.println("Tunjangan : " + k3.HitTunjangan(k3.Pendidikan, k3.ThnMasuk));
        
        // UJI PEWARISAN DAN METHOD SUBKELAS (KaryawanTetap) (Soal Praktikum No. 8)
        KaryawanTetap kt1 = new KaryawanTetap();
        kt1.ubah("Dian Purnama", "S1", "Tetap"); // Menggunakan method ubah dari Karyawan
        kt1.ThnMasuk = 2022; // Mengatur properti yang diwariskan
        kt1.JatahCuti = 12; 
        
        System.out.println("\n--- DATA KARYAWAN TETAP (Subkelas) ---");
        System.out.println("Nama Lengkap : " + kt1.NamaLengkap);
        System.out.println("Status Karyawan : " + kt1.Status);
        System.out.println("Gaji Pokok : " + kt1.GajiPokok(kt1.Status)); // Diwariskan: Rp3.500.000
        System.out.println("Jatah Cuti : " + kt1.TampilJatahCuti());
        // Gaji Pokok (3.500.000) <= 4.000.000, maka bonus 10%
        System.out.println("Bonus Akhir Tahun : " + kt1.HitungBonus()); // Method khusus subkelas: 10% * 3.500.000 = 350.000
    }
}
