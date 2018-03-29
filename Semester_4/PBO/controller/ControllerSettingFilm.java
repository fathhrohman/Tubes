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
public class ControllerSettingFilm implements ActionListener{
    private Aplikasi model;
    private SettingFilm view;
    
    public ControllerSettingFilm(){
        model = new Aplikasi();
        view = new SettingFilm();
        view.setVisible(true);
        view.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnSave())){
            String namebioskop = view.getNameBioskop();
            String notheater = view.getNoTheater();
            String filmbaru = view.getNameFilmBaru();
            model.setUpdateFilm(namebioskop, notheater, filmbaru);
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }else if (source.equals(view.getBack())){
            JOptionPane.showMessageDialog(null, "back to menu");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }
    
}
