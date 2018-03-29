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
public class ControllerTambahPelanggan implements ActionListener {
    private Aplikasi model;
    private TambahPelanggan view;
    
    public ControllerTambahPelanggan(){
        model = new Aplikasi();
        view = new TambahPelanggan();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getSave())){
            String namepelanggan = view.getNamePelanggan();
            String idpelanggan = view.getIdPelanggan();
            model.setPelanggan(namepelanggan, idpelanggan);
            JOptionPane.showMessageDialog(null, "Save");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }
    
    
    
}
