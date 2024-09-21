/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Kucing: ");
        // Membuat objek dari kelas Kucing
        Kucing kucing = new Kucing();
        
        // Mengatur nilai atribut
        kucing.nama = "Kitty";
        kucing.jenis = "Persia";
        //kucing.jumlahkaki = 4;
        
        // Menampilkan informasi tentang kucing
        kucing.tampilkanInfoHewan();
        
        // Menampilkan suara kucing
        kucing.suaraHewan();
        
        //Membuat objek dari kelas hewan
        System.out.println("\nAnjing: ");
        Anjing anjing = new Anjing();
        //Mengatur nilai atribut anjing
        anjing.nama = "Joni";
        anjing.jenis = "Labrador";
        //anjing.jumlahkaki = 4;
        //Tampilkan info anjing
        anjing.tampilkanInfoHewan();
        anjing.suaraHewan();
        
        
        System.out.println("");
        Mobil mobil = new Mobil();
        mobil.nama = "Ferrari";
        mobil.kecepatan = 120;
        mobil.jumlahPintu = 8;
        mobil.tampilkanInfo();
                
        System.out.println("");
        SepedaMotor megapro = new SepedaMotor();
        megapro.nama = "MegaPro";
        megapro.kecepatan = 120;
        megapro.jenisMesin = "2-tak";
        megapro.tampilkanInfo();        
    }
}

