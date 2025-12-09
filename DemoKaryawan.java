import java.util.Scanner;
public class DemoKaryawan {
    public static void main(String[] args) {
        // CONTOH 1
        // Membuat objek baru yang mengacu pada kelas Karyawan
        // Karyawan k1 = new Karyawan("Adi", "S1", "Tetap", 2002);
        // Membuat objek baru yang mengacu pada kelas Karyawan (overload constructor)
        Karyawan k1 = new Karyawan();
        Karyawan k2 = new Karyawan("Aditya", "S2", "Kontrak", 2015);

        // Membuat object baru yang mengacu pada kelas karyawan
        KaryawanTetap k = new KaryawanTetap();
        k.SetNIP("12345");
        System.out.println(k1.GajiPokok(k1.Status));
        System.out.println(k1.HitungMasaKerja(k1.ThnMasuk));
        // Menampilkan data milik objek k1
        System.out.println("Nama Lengkap : " + k1.NamaLengkap);
        System.out.println("Pendidikan : " + k1.Pendidikan);
        System.out.println("Status Karyawan : " + k1.Status);
        System.out.println("Tahun Masuk Kerja: " + k1.ThnMasuk);
        System.out.println("Gaji Pokok : " + k1.GajiPokok(k1.Status));
        System.out.print("Tunjangan : ");
        System.out.println(k1.HitTunjangan(k1.Pendidikan, k1.ThnMasuk));

        // System.out.println("--------------------");

        // Menampilkan data milik objek k2
        System.out.println("Nama Lengkap : " + k2.NamaLengkap);
        System.out.println("Pendidikan : " + k2.Pendidikan);
        System.out.println("Status Karyawan : " + k2.Status);
        System.out.println("Tahun Masuk Kerja: " + k2.ThnMasuk);
        System.out.println("Gaji Pokok : " + k2.GajiPokok(k2.Status));
        System.out.print("Tunjangan : ");
        System.out.println(k2.HitTunjangan(k2.Pendidikan, k2.ThnMasuk));

        //  CONTOH ARRAY OBJEK
        // Karyawan[] k = new Karyawan[3];
        // Scanner sc = new Scanner(System.in);
        // String N, P, S;
        // int T;

        // for (int i = 0; i < 3; i++) {
        // System.out.println("Masukkan data karyawan ke - " + (i + 1));
        // System.out.println("Nama Lengkap : ");
        // N = sc.nextLine();
        // System.out.println("Pendidikan : ");
        // P = sc.nextLine(); 
        // System.out.println("Status Karyawan : ");
        // S = sc.nextLine();
        // System.out.println("Tahun Masuk Kerja : ");
        // T = sc.nextInt();
        // sc.nextLine(); 
        // k[i] = new Karyawan(N, P, S, T);
        // }

        // System.out.println("--------------------");

        // for(int i=0;i<3;i++){
        // System.out.println("Nama Lengkap : " + k[i].NamaLengkap);
        // System.out.println("Pendidikan : " + k[i].Pendidikan);
        // System.out.println("Status Karyawan : " + k[i].Status);
        // System.out.println("Tahun Masuk Kerja: " + k[i].ThnMasuk);
        // System.out.println("Gaji Pokok : " + k[i].GajiPokok(k[i].Status));
        // System.out.print("Tunjangan : ");
        // System.out.println(k[i].HitTunjangan(k[i].Pendidikan, k[i].ThnMasuk));
        // System.out.println("--------------------");
        // }
    }
    }

