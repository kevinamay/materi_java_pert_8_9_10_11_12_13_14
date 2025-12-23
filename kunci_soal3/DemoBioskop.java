package kunci_soal3;
import java.util.Scanner; // [DITAMBAHKAN]: Library untuk input

public class DemoBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // [DITAMBAHKAN]: Variabel akumulasi pendapatan (Soal Bagian 2-A)
        double totalPendapatanHarian = 0;
        String pilihanUlang;

        // [DITAMBAHKAN]: Perulangan Do-While (Soal Bagian 2-A)
        do {
            System.out.println("=== KASIR BIOSKOP UTY ===");
            // [DITAMBAHKAN]: Menu Switch-Case (Soal Bagian 2-B)
            System.out.println("1. Reguler");
            System.out.println("2. Premiere");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = sc.nextInt();
            sc.nextLine(); // Clear buffer

            if (menu == 3) break;

            // [DIGANTI]: Input dinamis menggantikan data statis (Soal Bagian 2-C)
            System.out.print("Masukkan Judul Film: ");
            String judul = sc.nextLine();
            System.out.print("Jumlah Tiket: ");
            int qty = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari (Weekday/Weekend): ");
            String hari = sc.nextLine();

            // [DITAMBAHKAN]: Logika Opsi Harga Manual (Soal Bagian 2-C)
            double hargaTiket;
            System.out.print("Input harga manual? (y/n): ");
            if (sc.nextLine().equalsIgnoreCase("y")) {
                System.out.print("Harga per Tiket: ");
                hargaTiket = sc.nextDouble(); sc.nextLine();
            } else {
                hargaTiket = (menu == 1) ? 40000 : 60000;
            }

            // [DITAMBAHKAN]: Instansiasi Objek & Hitung Biaya Tiket
            double biayaTiket;
            if (menu == 1) {
                film f = new film(judul, "2D", hargaTiket);
                biayaTiket = f.hitungBiaya(qty, hari);
            } else {
                FilmPremiere fp = new FilmPremiere(judul, "Premiere", hargaTiket);
                // Menghitung biaya premiere + biaya tambahan weekend manual (jika ada)
                biayaTiket = fp.hitungBiaya(qty);
                if (hari.equalsIgnoreCase("Weekend")) biayaTiket += (qty * 5000);
            }

            // [MODIFIKASI]: Sub-Menu Camilan dengan Perulangan (Bisa beli lebih dari 1)
            double totalBiayaSnack = 0; 
            System.out.print("Beli camilan? (y/n): ");
            String pilihJajan = sc.nextLine();

            if (pilihJajan.equalsIgnoreCase("y")) {
                String tambahLagi;
                do {
                    System.out.println("--- DAFTAR MENU CAMILAN ---");
                    System.out.println("1. Popcorn (35rb)");
                    System.out.println("2. Nachos (45rb)");
                    System.out.println("3. Soda (25rb)");
                    System.out.print("Pilih Menu (1-3): ");
                    int snackPil = sc.nextInt(); sc.nextLine();
                    
                    Camilan c;
                    switch(snackPil) {
                        case 1 :
                             c = new Camilan("Popcorn", 35000);
                             break;
                        case 2 :
                             c = new Camilan("Nachos", 45000);
                             break;
                        case 3 :
                             c = new Camilan("Soda", 25000);
                             break;
                        default :
                             c = new Camilan("None", 0);
                    }
                    
                    // Menambahkan harga snack yang baru dipilih ke total snack transaksi ini
                    totalBiayaSnack += c.getHargaSnack();
                    System.out.println("Berhasil menambahkan: " + c.getNamaSnack());

                    System.out.print("Tambah jajan lainnya? (y/n): ");
                    tambahLagi = sc.nextLine();
                } while (tambahLagi.equalsIgnoreCase("y")); // Mengulang jika user pilih 'y'
            }

            // [DITAMBAHKAN]: Kalkulasi Akhir & Akumulasi
            // Biaya tiket ditambah dengan TOTAL seluruh snack yang dibeli
            double totalBayar = biayaTiket + totalBiayaSnack;
            totalPendapatanHarian += totalBayar;
            System.out.println("--- STRUK PEMBAYARAN ---");
            System.out.println("Judul: " + judul + " | Total: Rp " + totalBayar);

            System.out.print("Ada transaksi lagi? (y/n): ");
            pilihanUlang = sc.nextLine();

        } while (pilihanUlang.equalsIgnoreCase("y"));

        // [DITAMBAHKAN]: Laporan Akhir (Soal Bagian 3)
        System.out.println("PROGRAM SELESAI.");
        System.out.println("TOTAL PENDAPATAN BIOSKOP HARI INI: Rp " + totalPendapatanHarian);
    }
}