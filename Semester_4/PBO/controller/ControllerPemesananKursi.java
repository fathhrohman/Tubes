/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import java.util.ArrayList;
//import java.util.ArrayList;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;

/**
 *
 * @author Rohman
 */
public class ControllerPemesananKursi implements ActionListener {

    private Aplikasi model;
    private PemesananKursi view;
    boolean cek;

    public ControllerPemesananKursi() {
        model = new Aplikasi();
        view = new PemesananKursi();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getVerify())){
            String kodetransaksi = view.getKodeTransaksi();
            String kodekursi = view.getKodeKursi();
        }
        if (source.equals(view.getBtnDone())) {
            String kodekursi = view.getKodeKursi();
            String kodetransaksi = view.getKodeTransaksi();
            model.setUpdateTransaksi(kodetransaksi, kodekursi);
            JOptionPane.showMessageDialog(null, "done");
            ControllerMenu m = new ControllerMenu();
            view.dispose();
        }
    }

}
