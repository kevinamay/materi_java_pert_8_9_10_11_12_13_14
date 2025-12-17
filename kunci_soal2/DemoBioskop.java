package kunci_soal2; // Sesuaikan package Anda

public class DemoBioskop {
    public static void main(String[] args) {
        
        System.out.println("=== PENGUJIAN CONSTRUCTOR OVERLOADING (Soal 1) ===");
        
        // Soal 1.2: Uji Constructor Satu Parameter
        Film filmA = new Film("Misi Luar Angkasa");
        
        // Soal 1.3: Tampilkan Data filmA
        System.out.println("\n--- Film A (Constructor 1 Parameter) ---");
        System.out.println("Judul Film        : " + filmA.JudulFilm);
        System.out.println("Jenis Tayangan    : " + filmA.JenisTayangan); // Default: 2D
        System.out.println("Harga Tiket Dasar : " + filmA.getHargaDasar()); // Default: 40000.0
        
        // --- PENGUJIAN METHOD OVERLOADING (Soal 2) ---
        System.out.println("\n=== PENGUJIAN METHOD OVERLOADING (Soal 2) ===");
        
        // Soal 2.3: Uji Method Overload dengan Jenis Hari
        int jumlahTiket = 3;
        
        // Hitung Weekday
        double biayaWeekday = filmA.hitungBiaya(jumlahTiket, "Weekday");
        System.out.println("Biaya " + jumlahTiket + " Tiket (Weekday) : " + biayaWeekday); 
        // Hasil: 3 * 40000 = 120000.0
        
        // Hitung Weekend
        double biayaWeekend = filmA.hitungBiaya(jumlahTiket, "Weekend");
        System.out.println("Biaya " + jumlahTiket + " Tiket (Weekend) : " + biayaWeekend); 
        // Hasil: (3 * 40000) + (3 * 5000) = 135000.0

        // --- PENGUJIAN PEWARISAN & METHOD OVERRIDING (Soal 4) ---
        System.out.println("\n=== PENGUJIAN PEWARISAN & OVERRIDING (Soal 4) ===");
        
        // Soal 4.3: Buat objek Subkelas FilmPremiere
        FilmPremiere filmP = new FilmPremiere("Avengers: The Beginning", "3D", 60000.0);
        int tiketPremiere = 2;
        
        System.out.println("\n--- Film P (Premiere) ---");
        System.out.println("Judul Film        : " + filmP.JudulFilm); // Diwariskan
        System.out.println("Harga Tiket Dasar : " + filmP.getHargaDasar()); // Diwariskan
        System.out.println("Biaya Layanan     : " + filmP.getBiayaLayanan()); // Khusus Subkelas
        
        // Panggil method hitungBiaya yang sudah di-override
        double totalBiayaPremiere = filmP.hitungBiaya(tiketPremiere);
        
        System.out.println("----------------------------------------");
        System.out.println("Total Biaya " + tiketPremiere + " Tiket Premiere:");
        System.out.println("((2 * 60000) + 15000) = " + totalBiayaPremiere); 
        // Hasil: 120000.0 + 15000.0 = 135000.0
    }
}
