package kunci_soal3;

public class Camilan {
    private String namaSnack;
    private double hargaSnack;

    public Camilan(String namaSnack, double hargaSnack) {
        this.namaSnack = namaSnack;
        this.hargaSnack = hargaSnack;
    }

    public double getHargaSnack() { return hargaSnack; }
    public String getNamaSnack() { return namaSnack; }
}