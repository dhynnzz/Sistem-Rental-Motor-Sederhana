/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab_3;

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
        return durasi * harga; // harga per hari
    }

    public String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMerk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPlat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


