/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab_4;

/**
 *
 * @author Mhmd Aminuddin
 */
// Kelas RentalMotorBulanan merupakan turunan dari RentalMotor
// Menghitung biaya sewa berdasarkan durasi dalam satuan bulan
public class RentalMotorBulanan {
    private String nama;
    private String merk;
    private String plat;
    private int durasi; // dalam bulan
    private int harga;  // harga per bulan

    public RentalMotorBulanan(String nama, String merk, String plat, int durasi, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.plat = plat;
        this.durasi = durasi;
        this.harga = harga;
    }

    public int hitungTotal() {
        return durasi * harga;
    }

    public String getDetailSewa() {
        return "=== Detail Sewa Motor Bulanan ===\n" +
               "Nama Penyewa  : " + nama + "\n" +
               "Merk Motor    : " + merk + "\n" +
               "Plat Nomor    : " + plat + "\n" +
               "Durasi Sewa   : " + durasi + " bulan\n" +
               "Harga/Bulan   : Rp" + harga + "\n" +
               "Total Sewa    : Rp" + hitungTotal();
    }

    // Optional: getter/setter kalau dibutuhkan
}





