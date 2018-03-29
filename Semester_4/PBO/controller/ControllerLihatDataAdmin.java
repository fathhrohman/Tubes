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
public class ControllerLihatDataAdmin implements ActionListener{
    private Aplikasi model;
    private LihatDataAdmin view;
    
    public ControllerLihatDataAdmin(){
        model = new Aplikasi();
        view = new LihatDataAdmin();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getView())){
            String idadmin = view.getIdAdmin();
            String x = model.searchNameAdmin(idadmin);
            view.setNameAdmin(x);            
        } else if (source.equals(view.getDone())){
            JOptionPane.showMessageDialog(null, "back to menu");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }
    
}
