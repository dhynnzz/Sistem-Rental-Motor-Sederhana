/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab_4;

/**
 *
 * @author Mhmd Aminuddin
 */
// Kelas RentalMotorHarian merupakan turunan dari RentalMotor
// Digunakan untuk menyewa motor berdasarkan harga harian
public class RentalMotorHarian {
    private String nama;
    private String merk;
    private String plat;
    private int durasi;
    private int harga;

    public RentalMotorHarian(String nama, String merk, String plat, int durasi, int harga) {
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
        return "=== Detail Sewa Motor Harian ===\n" +
               "Nama Penyewa  : " + nama + "\n" +
               "Merk Motor    : " + merk + "\n" +
               "Plat Nomor    : " + plat + "\n" +
               "Durasi Sewa   : " + durasi + " hari\n" +
               "Harga/Hari    : Rp" + harga + "\n" +
               "Total Sewa    : Rp" + hitungTotal();
    }

    // Optional: Getter/setter jika dibutuhkan
}

