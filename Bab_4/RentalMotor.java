/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab_4;

/**
 *
 * @author Mhmd Aminuddin
 */
// Kelas RentalMotor merepresentasikan data dan logika untuk menyewa motor
public class RentalMotor {
    private String nama;
    private String merk;
    private String plat;
    private int durasi;
    private int harga;

    public RentalMotor(String nama, String merk, String plat, int durasi, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.plat = plat;
        this.durasi = durasi;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int hitungTotal() {
        return durasi * harga;
    }
}
