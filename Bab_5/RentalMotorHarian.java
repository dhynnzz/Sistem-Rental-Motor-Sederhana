/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab_5;

/**
 *
 * @author Mhmd Aminuddin
 */
public class RentalMotorHarian extends RentalMotor {

    public RentalMotorHarian(String nama, String merk, String plat, int durasi, int harga) {
        super(nama, merk, plat, durasi, harga);
    }

    @Override
    public int hitungTotal() {
        return durasi * harga;
    }

    @Override
    public String getDetailSewa() {
        return "=== Detail Sewa Motor Harian ===\n" +
               "Nama Penyewa  : " + nama + "\n" +
               "Merk Motor    : " + merk + "\n" +
               "Plat Nomor    : " + plat + "\n" +
               "Durasi Sewa   : " + durasi + " hari\n" +
               "Harga/Hari    : Rp" + harga + "\n" +
               "Total Sewa    : Rp" + hitungTotal();
    }
}
