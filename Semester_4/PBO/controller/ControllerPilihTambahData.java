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

/**
 *
 * @author Rohman
 */
public class ControllerPilihTambahData implements ActionListener {

    private Aplikasi model;
    private PilihTambahData view;

    public ControllerPilihTambahData() {
        model = new Aplikasi();
        view = new PilihTambahData();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getTambahAdmin())) {
            ControllerTambahAdmin cta = new ControllerTambahAdmin();
            view.dispose();
        } else if (source.equals(view.getTambahPelanggan())) {
            ControllerTambahPelanggan ctp = new ControllerTambahPelanggan();
            view.dispose();
        } else if (source.equals(view.getBack())) {
            JOptionPane.showMessageDialog(null, "back to menu");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }

}
