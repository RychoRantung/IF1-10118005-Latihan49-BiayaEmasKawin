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
 * Deskripsi Program : Berisi program yang menghitung total harga dari emas yang ingin dibeli
 */
public class IF110118005Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas emas = new Emas();
        emas.setBerat(15.7);
        emas.setHarga(570000);
        
        System.out.println("Berat Emas Kawin adalah " +emas.getBerat() + " gram" );
        System.out.println("Harga Emas adalah Rp " + emas.getHarga());
        System.out.println("Total Bayar : " + emas.hitungHarga(emas.getBerat()));
    }
    
}
