/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Aplikasi;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import Model.Pelanggan;
import java.util.ArrayList;

/**
 *
 * @author Rohman
 */
public class ControllerPemesananTiket implements ActionListener {

    private Aplikasi model;
    private PemesananTiket view;
    private PemesananKursi view2;
    boolean cek = false;
    boolean cek2 = false;

    public ControllerPemesananTiket() {
        model = new Aplikasi();
        view = new PemesananTiket();
        view.setVisible(true);
        view.addActionListener(this);
        view2 = new PemesananKursi();
        view2.setVisible(false);
        view2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(view.getbtnVerify())) {
            String idpelanggan = view.getIdPelanggan();
            String kodetransaksi = view.getKodeTransaksi();
            String notheater = view.getTheater();
            String namabioskop = view.getNameBioskop();
            String namapelanggan = model.searchNamePelanggan(idpelanggan);
            String judulfilm = model.searchFilmTayang(notheater);
            String cekbioskop = model.verifyNamaBioskop(namabioskop);
            String cekkodetransaksi = model.verifyKodeTransaksi(kodetransaksi);
            view.setNamaPelanggan(namapelanggan);
            view.setJudulFilm(judulfilm);
            if (view.getJudulFilm().equals("tidak ada") || view.getNamaPelanggan().equals("tidak ada") || cekbioskop.equals("tidak valid") || cekkodetransaksi.equals("tidak valid")) {
                cek = false;
            } else {
                cek = true;
            }
            
        } else if (source.equals(view.getbtnAddPesanTiket()) && !cek) {
            JOptionPane.showMessageDialog(null, "data tidak valid");

        } else if (source.equals(view.getbtnAddPesanTiket()) && cek) {
            String idpelanggan = view.getIdPelanggan();
            String kodetransaksi = view.getKodeTransaksi();
            String namebioskop = view.getNameBioskop();
            String judulfilm = view.getJudulFilm();
            String theater = view.getTheater();
            String jam = view.getJamTayang();
            double harga = 30000;
            String namapelanggan = view.getNamaPelanggan();
            String kodekursi = "-";
            model.Settransaksi(kodetransaksi, harga, idpelanggan, namebioskop, jam, theater, kodekursi);
            view.setVisible(false);
            view2.setVisible(true);
            view2.setKodeTransaksi(kodetransaksi);
            
        } else if (source.equals(view.getBack())) {
            JOptionPane.showMessageDialog(null, "back to menu");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
            
        } else if (source.equals(view2.getVerify())) {
            String kodekursi = view2.getKodeKursi();
            String notheater = view.getTheater();
            String cekkodekursi = model.verifyKodeKursi(notheater,kodekursi);
            if (cekkodekursi.equals("valid")){
                cek2 = true;
            } else {
                cek2 = false;
            }
            if (cek2){
                JOptionPane.showMessageDialog(null, "kursi bisa dipesan");
            } else {
                JOptionPane.showMessageDialog(null, "kursi sudah dipesan");
            }
            
        } else if (source.equals(view2.getBtnDone()) && cek2) {
            
            String kodekursi = view2.getKodeKursi();
            String kodetransaksi = view2.getKodeTransaksi();
            model.setUpdateTransaksi(kodetransaksi, kodekursi);
            JOptionPane.showMessageDialog(null, "done");
            ControllerMenu m = new ControllerMenu();
            view.dispose();
            view2.dispose();
            
        }else if (source.equals(view2.getBtnDone()) && !cek2){
            JOptionPane.showMessageDialog(null, "kursi sudah dipesan");
        }
    }

}
