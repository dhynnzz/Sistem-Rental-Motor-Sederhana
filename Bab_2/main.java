/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab_2;

/**
 *
 * @author Mhmd Aminuddin
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek motor yang tersedia
        RentalMotor motor1 = new RentalMotor("Yamaha", "AB1234CD", null, true);
        
        // Membuat objek motor yang sedang disewa
        RentalMotor motor2 = new RentalMotor("Honda", "B5678EF", "Andi", false);

        // Cek ketersediaan motor1
        System.out.println("Status motor1: " + motor1.cekKetersediaan());

        // Coba sewa motor1
        motor1.sewaMotor("Budi");

        // Cek ulang status motor1 setelah disewa
        System.out.println("Status motor1 setelah disewa: " + motor1.cekKetersediaan());

        // Kembalikan motor1
        motor1.kembalikanMotor();

        // Cek status motor1 setelah dikembalikan
        System.out.println("Status motor1 setelah dikembalikan: " + motor1.cekKetersediaan());

        // Coba sewa motor2 yang sedang disewa
        System.out.println("Status motor2: " + motor2.cekKetersediaan());
        motor2.sewaMotor("Cici"); // Harusnya gagal karena masih disewa Andi

        // Kembalikan motor2
        motor2.kembalikanMotor();

        // Coba sewa motor2 lagi
        motor2.sewaMotor("Cici");
    }
}

