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
public class ControllerTambahAdmin implements ActionListener{
    private Aplikasi model;
    private TambahAdmin view;

    public ControllerTambahAdmin(){
        model = new Aplikasi();
        view = new TambahAdmin();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getSave())){
            String nameadmin= view.getNameAdmin();
            String idadmin = view.getIdAdmin();
            model.setAdmin(nameadmin, idadmin);
            JOptionPane.showMessageDialog(null,"save");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }
    
}
