/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Rohman
 */
public class Aplikasi {

    Database db = new Database();
    ArrayList<Pelanggan> daftarPelanggan;
    ArrayList<Admin> daftarAdmin;
    ArrayList<Transaksi> daftarTransaksi;
    ArrayList<Bioskop> daftarBioskop;
    ArrayList<Theater> daftarTheater;
    ArrayList<Kursi> daftarKursi;

    public Aplikasi() {
        db = new Database();
        db.connect();
        daftarPelanggan = db.loadPelanggan();
        daftarAdmin = db.loadAdmin();
        daftarTransaksi = db.loadTransaksi();
        daftarBioskop = db.loadBioskop();
        daftarTheater = db.loadTheater();
        daftarKursi = db.loadKursi();
    }

    public ArrayList<Pelanggan> getdaftarPelanggan() {
        daftarPelanggan = db.loadPelanggan();
        return daftarPelanggan;
    }

    public ArrayList<Admin> getdaftarAdmin() {
        daftarAdmin = db.loadAdmin();
        return daftarAdmin;
    }

    public ArrayList<Transaksi> getdaftarTransaksi() {
        daftarTransaksi = db.loadTransaksi();
        return daftarTransaksi;
    }

    public ArrayList<Bioskop> getdaftarBiokop() {
        daftarBioskop = db.loadBioskop();
        return daftarBioskop;
    }

    public ArrayList<Theater> getdaftarTheater() {
        daftarTheater = db.loadTheater();
        return daftarTheater;
    }

    public ArrayList<Kursi> getdaftarKursi() {
        daftarKursi = db.loadKursi();
        return daftarKursi;
    }

    public Pelanggan getPelanggan(String id) {
        for (Pelanggan p : daftarPelanggan) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Bioskop getBioskop(String name) {
        for (Bioskop b : daftarBioskop) {
            if (b.getName().equals(name)) {
                return b;
            }
        }
        return null;
    }

    public Theater getTheater(String notheater) {
        for (Theater t : daftarTheater) {
            if (t.getNotheater().equals(notheater)) {
                return t;
            }
        }
        return null;
    }

    public void setUpdateFilm(String name, String notheater, String filmtayang) {

        db.updateFilm(filmtayang, notheater);

    }

    public void setUpdateNoTheater(String notheaterbaru, String notheaterlama) {
        db.updateNoTheater(notheaterbaru, notheaterlama);
    }

    public void Settransaksi(String kodetransaksi, double harga, String id, String namabioskop, String jam, String notheater, String kodekursi) {
        Bioskop b = new Bioskop(namabioskop);
        Transaksi t = new Transaksi(kodetransaksi, harga, b, jam);

        this.daftarTransaksi.add(t);
        db.saveTransaksi(kodetransaksi, harga, id, namabioskop, jam, notheater, kodekursi);

    }

    public void setUpdateTransaksi(String kodetransaksi, String kodekursi) {
        db.updateTransaksi(kodetransaksi, kodekursi);
    }

    public void setAdmin(String nameadmin, String idadmin) {
        Admin a = new Admin(nameadmin, idadmin);
        daftarAdmin.add(a);
        db.saveAdmin(a);
    }

    public void setPelanggan(String namepelanggan, String idpelanggan) {
        Pelanggan p = new Pelanggan(namepelanggan, idpelanggan);
        daftarPelanggan.add(p);
        this.daftarPelanggan.add(p);
        db.savePelanggan(p);
    }

    public String searchNameAdmin(String idadmin) {
        for (int i = 0; i < daftarAdmin.size(); i++) {
            Admin a = daftarAdmin.get(i);
            String x = a.getId();
            if (x.equals(idadmin)) {
                return a.getName();
            }
        }
        return "tidak ada";
    }
    public String searchNamePelanggan(String idpelanggan){
        for(int i =0;i<daftarPelanggan.size();i++){
            Pelanggan a = daftarPelanggan.get(i);
            String x = a.getId();
            if(x.equals(idpelanggan)){
                return a.getName();
            }
        }
        return "tidak ada";
    }
    public String searchFilmTayang(String notheater){
        for (int i = 0 ; i <daftarTheater.size();i++){
            Theater t = daftarTheater.get(i);
            String x  = t.getNotheater();
            if (x.equals(notheater)){
                return t.getFilmtayang();
            }
        }
        return "tidak ada";
    }
    public String verifyNamaBioskop(String namabioskop){
        for (int i = 0 ; i <daftarBioskop.size(); i++){
            Bioskop b = daftarBioskop.get(i);
            String  x = b.getName();
            if (x.equals(namabioskop)){
                return "valid";
            }
        }
        return "tidak valid";
    }
    public String verifyKodeTransaksi(String kodetransaksi){
        for (int i = 0 ; i < daftarTransaksi.size();i++){
            Transaksi t = daftarTransaksi.get(i);
            String x = t.getKodetransaksi();
            if (x.equals(kodetransaksi)){
                return "tidak valid";
            }
        }
        return "valid";
    }
    public String verifyKodeKursi(String notheater,String kodekursi){
        String cek = db.verifyKodeKursi(notheater,kodekursi);
        if (cek.equals("valid")){
            return "valid";
        } else {
            return "tidak valid";
        }
    }
}
