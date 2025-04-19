/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab_2;

/**
 *
 * @author Mhmd Aminuddin
 */
class RentalMotor {
    private String namaPelanggan; // Nama pelanggan yang menyewa motor
    private String merkMotor;     // Merk motor
    private String platNomor;     // Plat nomor motor
    private boolean status;       // true = tersedia, false = disewa

    // Constructor baru dengan parameter tambahan: namaPelanggan dan status
    public RentalMotor(String merkMotor, String platNomor, String namaPelanggan, boolean status) {
        this.merkMotor = merkMotor;
        this.platNomor = platNomor;
        this.namaPelanggan = status ? null : namaPelanggan; // Jika tersedia, tidak ada pelanggan
        this.status = status;
    }

    public String cekKetersediaan() {
        return status ? "Motor tersedia untuk disewa." : "Motor sedang disewa.";
    }

    public void sewaMotor(String namaPelanggan) {
        if (status) {
            this.namaPelanggan = namaPelanggan;
            this.status = false;
            System.out.println("Motor " + merkMotor + " berhasil disewa oleh " + namaPelanggan);
        } else {
            System.out.println("Motor tidak tersedia untuk disewa.");
        }
    }

    public void kembalikanMotor() {
        if (!status) {
            this.namaPelanggan = null;
            this.status = true;
            System.out.println("Motor " + merkMotor + " telah dikembalikan.");
        } else {
            System.out.println("Motor sudah dalam keadaan tersedia.");
        }
    }
}

