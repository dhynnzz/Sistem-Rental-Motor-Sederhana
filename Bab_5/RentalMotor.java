/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab_5;

import Bab_4.*;

/**
 *
 * @author Mhmd Aminuddin
 */
// Kelas induk
public class RentalMotor {
    protected String nama;
    protected String merk;
    protected String plat;
    protected int durasi;
    protected int harga;

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

    public String getDetailSewa() {
        return "Nama Penyewa  : " + nama + "\n" +
               "Merk Motor    : " + merk + "\n" +
               "Plat Nomor    : " + plat + "\n" +
               "Durasi Sewa   : " + durasi + "\n" +
               "Harga         : Rp" + harga + "\n" +
               "Total Sewa    : Rp" + hitungTotal();
    }
}
