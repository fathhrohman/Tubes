/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
/**
 *
 * @author Rohman
 */
public class ControllerPilihSetting implements ActionListener {
    private PilihSetting view;
    public ControllerPilihSetting() {
        view = new PilihSetting();
        view.setVisible(true);
        view.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getSettingFilm())){
            ControllerSettingFilm csf = new ControllerSettingFilm();
            view.dispose();
        }else if(source.equals(view.getSettingNoTheater())){
           ControllerSettingNoTheater csnt = new ControllerSettingNoTheater();
           view.dispose();
        } else if (source.equals(view.getBack())){
            JOptionPane.showMessageDialog(null, "back to menu");
            ControllerMenu cm = new ControllerMenu();
            view.dispose();
        }
    }
    
}
