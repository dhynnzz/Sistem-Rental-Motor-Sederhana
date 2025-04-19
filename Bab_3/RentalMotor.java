/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab_3;

/**
 *
 * @author Mhmd Aminuddin
 */
public class RentalMotor {
    protected String nama, merk, plat;
    protected int durasi, harga;

    public RentalMotor(String nama, String merk, String plat, int durasi, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.plat = plat;
        this.durasi = durasi;
        this.harga = harga;
    }

    public int hitungTotal() {
        return durasi * harga;
    }
}
