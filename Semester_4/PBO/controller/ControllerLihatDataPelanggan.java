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
public class ControllerLihatDataPelanggan implements ActionListener{
    private Aplikasi model;
    private LihatDataPelanggan view;
    
    public ControllerLihatDataPelanggan(){
        model = new Aplikasi();
        view = new LihatDataPelanggan();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getView())){
            String idpelanggan = view.getIdPelanggan();
            String x = model.searchNamePelanggan(idpelanggan);
            view.setNamaPelanggan(x);
        } else if(source.equals(view.getDone())){
            JOptionPane.showMessageDialog(null, "back to menu");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }
    
}
