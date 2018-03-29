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
public class Transaksi {

    private Bioskop transaksibioskop;
    private String kodetransaksi;
    private double harga;
    private String jam;

    public Transaksi(String kodetransaksi,double harga,Bioskop bioskop,String jam) {
        this.kodetransaksi = kodetransaksi;
        this.transaksibioskop = bioskop;
        this.harga = harga;
        this.jam = jam;
    }
    public Transaksi(String kodetransaksi,double harga,String jam){
        this.kodetransaksi = kodetransaksi;
        this.harga = harga;
        this.jam = jam;
    }

    public double getHarga() {
        return harga;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setKodetransaksi(String kodetransaksi) {
        this.kodetransaksi = kodetransaksi;
    }

    public String getKodetransaksi() {
        return kodetransaksi;
    }

    public void setTransaksibioskop(Bioskop x) {
        transaksibioskop = x;
    }

    public Bioskop getTransalsibioskop() {
        return transaksibioskop;
    }
}
