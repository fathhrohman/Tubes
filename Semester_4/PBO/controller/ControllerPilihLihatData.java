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

/**
 *
 * @author Rohman
 */
public class ControllerPilihLihatData implements ActionListener {

    private Aplikasi model;
    private PilihLihatData view;

    public ControllerPilihLihatData() {
        model = new Aplikasi();
        view = new PilihLihatData();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnAdmin())) {
            ControllerLihatDataAdmin clda = new ControllerLihatDataAdmin();
            view.dispose();
        } else if (source.equals(view.getBtnPelanggan())) {
            ControllerLihatDataPelanggan cldp = new ControllerLihatDataPelanggan();
            view.dispose();
        } else if (source.equals(view.getBack())) {
            JOptionPane.showMessageDialog(null, "back to menu");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }

}
