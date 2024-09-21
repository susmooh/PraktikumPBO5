/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
public class Hewan2 {
    String nama;
    String jenis;

    public void tampilkanInfoHewan() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

class HewanDarat extends Hewan2 {
    // ...
    public void suaraHewan() {
        System.out.println("");
    }
}

class Kucing extends HewanDarat {
    @Override
    public void suaraHewan() {
        System.out.println("Suara: Meong");
    }
}

class Anjing extends HewanDarat {
    @Override
    public void suaraHewan() {
        System.out.println("Suara: Guk guk");
    }
}
