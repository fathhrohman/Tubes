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
public class ControllerMenu implements ActionListener {

    private Menu view;

    public ControllerMenu() {
        view = new Menu();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();

        if (source.equals(view.getBtnPesanTiket())) {
            ControllerPemesananTiket cpt = new ControllerPemesananTiket();
            view.dispose();
        } else if (source.equals(view.getBtnSettingTheater())) {
            ControllerPilihSetting cps = new ControllerPilihSetting();
            view.dispose();
        } else if (source.equals(view.getBtnTambahData())) {
            ControllerPilihTambahData cptd = new ControllerPilihTambahData();
            view.dispose();
        }else if (source.equals(view.getBtnLihatData())){
            ControllerPilihLihatData cpld = new ControllerPilihLihatData();
            view.dispose();
        } 
        else if (source.equals(view.getExit())) {
            JOptionPane.showMessageDialog(null, "thank you");
            System.exit(0);
        }

    }
}
