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
public class RentalMotorBulanan extends RentalMotor {

    public RentalMotorBulanan(String nama, String merk, String plat, int durasi, int harga) {
        super(nama, merk, plat, durasi, harga);
    }

    // 🔁 Overriding: hitung total sewa bulanan
    @Override
    public int hitungTotal() {
        return durasi * harga;
    }

    // ➕ Overloading: hitung total dengan diskon
    public int hitungTotal(double diskonPersen) {
        double total = durasi * harga;
        double diskon = total * diskonPersen / 100;
        return (int)(total - diskon);
    }

    @Override
    public String getDetailSewa() {
        return "=== Detail Sewa Motor Bulanan ===\n" +
               "Nama Penyewa  : " + nama + "\n" +
               "Merk Motor    : " + merk + "\n" +
               "Plat Nomor    : " + plat + "\n" +
               "Durasi Sewa   : " + durasi + " bulan\n" +
               "Harga/Bulan   : Rp" + harga + "\n" +
               "Total Sewa    : Rp" + hitungTotal();
    }
}







