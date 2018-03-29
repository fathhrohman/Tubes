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
public class ControllerSettingNoTheater implements ActionListener{
    private Aplikasi model;
    private SettingNoTheater view;
    
    public ControllerSettingNoTheater(){
        model = new Aplikasi();
        view = new SettingNoTheater();
        view.setVisible(true);
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getSave())){
            String notheaterbaru = view.getNoTheaterBaru();
            String notheaterlama = view.getNoTheaterLama();
            model.setUpdateNoTheater(notheaterbaru, notheaterlama);
            JOptionPane.showMessageDialog(null, "Save");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        } else if (source.equals(view.getBack())){
            JOptionPane.showMessageDialog(null, "back to menu");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }
    
}
