/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan49.biayaemaskawin;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program :Berisi program yang menghitung total harga dari emas yang ingin dibeli
 */
public class Emas {
    private double berat;
    private int harga;

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public double hitungHarga(double berat){
        return harga * berat;
    }
}

