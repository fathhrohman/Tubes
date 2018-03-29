/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author BramTheBoom
 */
public class Pelanggan extends Person {

    private Transaksi[] daftartransaksi;
    private int jumlahtransaksi;

    public Pelanggan(String name, String id) {
        super(name, id);
        daftartransaksi = new Transaksi[100];
    }

    public Transaksi getDaftartransaksi(int index) {
        return daftartransaksi[index];
    }

    public void createTransaksi(String kodetransaksi,Bioskop bioskop,double harga,String jam) {
        if (jumlahtransaksi < daftartransaksi.length) {
            daftartransaksi[jumlahtransaksi] = new Transaksi(kodetransaksi,harga,bioskop,jam);
            jumlahtransaksi++;
        }
    }
}
