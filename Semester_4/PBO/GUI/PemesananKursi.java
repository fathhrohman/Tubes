/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Rohman
 */
public class PemesananKursi extends javax.swing.JFrame {

    /**
     * Creates new form PemesananKursi
     */
    public PemesananKursi() {
        initComponents();
    }

    public JButton getBtnDone() {
        return btnDone;
    }

    public String getKodeKursi() {
        return txtKodeKursi.getText();
    }

    public String getKodeTransaksi() {
        return txtKodeTransaksi.getText();
    }

    public void setKodeTransaksi(String kodetransaksi) {
        txtKodeTransaksi.setText(kodetransaksi);
    }
    public JButton getVerify(){
        return btnVerify;
    }

    public ArrayList<String> getPilihanKursi() {
        ArrayList<String> x = new ArrayList();
        if (kursiA1.isSelected()) {
            x.add("A1");
        }
        if (kursiA2.isSelected()) {
            x.add("A2");
        }
        if (kursiA3.isSelected()) {
            x.add("A3");
        }
        if (kursiA4.isSelected()) {
            x.add("A4");
        }
        if (kursiA5.isSelected()) {
            x.add("A5");
        }
        if (kursiA6.isSelected()) {
            x.add("A6");
        }
        if (kursiA7.isSelected()) {
            x.add("A7");
        }
        if (kursiA8.isSelected()) {
            x.add("A8");
        }
        if (kursiA9.isSelected()) {
            x.add("A9");
        }
        if (kursiA10.isSelected()) {
            x.add("A10");
        }
        if (kursiA11.isSelected()) {
            x.add("A11");
        }
        if (kursiA12.isSelected()) {
            x.add("A12");
        }
        if (kursiA13.isSelected()) {
            x.add("A13");
        }
        if (kursiA14.isSelected()) {
            x.add("A14");
        }
        if (kursiA15.isSelected()) {
            x.add("A15");
        }
        if (kursiA16.isSelected()) {
            x.add("A16");
        }

// ---------------------------------------------------------------------------------------------------- 
        if (kursiB1.isSelected()) {
            x.add("B1");
        }
        if (kursiB2.isSelected()) {
            x.add("B2");
        }
        if (kursiB3.isSelected()) {
            x.add("B3");
        }
        if (kursiB4.isSelected()) {
            x.add("B4");
        }
        if (kursiB5.isSelected()) {
            x.add("B5");
        }
        if (kursiB6.isSelected()) {
            x.add("B6");
        }
        if (kursiB7.isSelected()) {
            x.add("B7");
        }
        if (kursiB8.isSelected()) {
            x.add("B8");
        }
        if (kursiB9.isSelected()) {
            x.add("B9");
        }
        if (kursiB10.isSelected()) {
            x.add("B10");
        }
        if (kursiB11.isSelected()) {
            x.add("B11");
        }
        if (kursiB12.isSelected()) {
            x.add("B12");
        }
        if (kursiB13.isSelected()) {
            x.add("B13");
        }
        if (kursiB14.isSelected()) {
            x.add("B14");
        }
        if (kursiB15.isSelected()) {
            x.add("B15");
        }
        if (kursiB16.isSelected()) {
            x.add("B16");
        }

//---------------------------------------------------------------------------------------------        
        if (kursiC1.isSelected()) {
            x.add("C1");
        }
        if (kursiC2.isSelected()) {
            x.add("C2");
        }
        if (kursiC3.isSelected()) {
            x.add("C3");
        }
        if (kursiC4.isSelected()) {
            x.add("C4");
        }
        if (kursiC5.isSelected()) {
            x.add("C5");
        }
        if (kursiC6.isSelected()) {
            x.add("C6");
        }
        if (kursiC7.isSelected()) {
            x.add("C7");
        }
        if (kursiC8.isSelected()) {
            x.add("C8");
        }
        if (kursiC9.isSelected()) {
            x.add("C9");
        }
        if (kursiC10.isSelected()) {
            x.add("C10");
        }
        if (kursiC11.isSelected()) {
            x.add("C11");
        }
        if (kursiC12.isSelected()) {
            x.add("C12");
        }
        if (kursiC13.isSelected()) {
            x.add("C13");
        }
        if (kursiC14.isSelected()) {
            x.add("C14");
        }
        if (kursiC15.isSelected()) {
            x.add("C15");
        }
        if (kursiC16.isSelected()) {
            x.add("C16");
        }

//---------------------------------------------------------------------------------------
        if (kursiD1.isSelected()) {
            x.add("D1");
        }
        if (kursiD2.isSelected()) {
            x.add("D2");
        }
        if (kursiD3.isSelected()) {
            x.add("D3");
        }
        if (kursiD4.isSelected()) {
            x.add("D4");
        }
        if (kursiD5.isSelected()) {
            x.add("D5");
        }
        if (kursiD6.isSelected()) {
            x.add("D6");
        }
        if (kursiD7.isSelected()) {
            x.add("D7");
        }
        if (kursiD8.isSelected()) {
            x.add("D8");
        }
        if (kursiD9.isSelected()) {
            x.add("D9");
        }
        if (kursiD10.isSelected()) {
            x.add("D10");
        }
        if (kursiD11.isSelected()) {
            x.add("D11");
        }
        if (kursiD12.isSelected()) {
            x.add("D12");
        }
        if (kursiD13.isSelected()) {
            x.add("D13");
        }
        if (kursiD14.isSelected()) {
            x.add("D14");
        }
        if (kursiD15.isSelected()) {
            x.add("D15");
        }
        if (kursiD16.isSelected()) {
            x.add("D16");
        }

        //---------------------------------------------------------------------------------
        if (kursiE1.isSelected()) {
            x.add("E1");
        }
        if (kursiE2.isSelected()) {
            x.add("E2");
        }
        if (kursiE3.isSelected()) {
            x.add("E3");
        }
        if (kursiE4.isSelected()) {
            x.add("E4");
        }
        if (kursiE5.isSelected()) {
            x.add("E5");
        }
        if (kursiE6.isSelected()) {
            x.add("E6");
        }
        if (kursiE7.isSelected()) {
            x.add("E7");
        }
        if (kursiE8.isSelected()) {
            x.add("E8");
        }
        if (kursiE9.isSelected()) {
            x.add("E9");
        }
        if (kursiE10.isSelected()) {
            x.add("E10");
        }
        if (kursiE11.isSelected()) {
            x.add("E11");
        }
        if (kursiE12.isSelected()) {
            x.add("E12");
        }
        if (kursiE13.isSelected()) {
            x.add("E13");
        }
        if (kursiE14.isSelected()) {
            x.add("E14");
        }
        if (kursiE15.isSelected()) {
            x.add("E15");
        }
        if (kursiE16.isSelected()) {
            x.add("E16");
        }

//----------------------------------------------------------------------------------------------------------------
        if (kursiF1.isSelected()) {
            x.add("F1");
        }
        if (kursiF2.isSelected()) {
            x.add("F2");
        }
        if (kursiF3.isSelected()) {
            x.add("F3");
        }
        if (kursiF4.isSelected()) {
            x.add("F4");
        }
        if (kursiF5.isSelected()) {
            x.add("F5");
        }
        if (kursiF6.isSelected()) {
            x.add("F6");
        }
        if (kursiF7.isSelected()) {
            x.add("F7");
        }
        if (kursiF8.isSelected()) {
            x.add("F8");
        }
        if (kursiF9.isSelected()) {
            x.add("F9");
        }
        if (kursiF10.isSelected()) {
            x.add("F10");
        }
        if (kursiF11.isSelected()) {
            x.add("F11");
        }
        if (kursiF12.isSelected()) {
            x.add("F12");
        }
        if (kursiF13.isSelected()) {
            x.add("F13");
        }
        if (kursiF14.isSelected()) {
            x.add("F14");
        }
        if (kursiF15.isSelected()) {
            x.add("F15");
        }
        if (kursiF16.isSelected()) {
            x.add("F16");
        }

//-----------------------------------------------------------------------------------
        if (kursiG1.isSelected()) {
            x.add("G1");
        }
        if (kursiG2.isSelected()) {
            x.add("G2");
        }
        if (kursiG3.isSelected()) {
            x.add("G3");
        }
        if (kursiG4.isSelected()) {
            x.add("G4");
        }
        if (kursiG5.isSelected()) {
            x.add("G5");
        }
        if (kursiG6.isSelected()) {
            x.add("G6");
        }
        if (kursiG7.isSelected()) {
            x.add("G7");
        }
        if (kursiG8.isSelected()) {
            x.add("G8");
        }
        if (kursiG9.isSelected()) {
            x.add("G9");
        }
        if (kursiG10.isSelected()) {
            x.add("G10");
        }
        if (kursiG11.isSelected()) {
            x.add("G11");
        }
        if (kursiG12.isSelected()) {
            x.add("G12");
        }
        if (kursiG13.isSelected()) {
            x.add("G13");
        }
        if (kursiG14.isSelected()) {
            x.add("G14");
        }
        if (kursiG15.isSelected()) {
            x.add("G15");
        }
        if (kursiG16.isSelected()) {
            x.add("G16");
        }

//---------------------------------------------------------------------------------
        if (kursiH1.isSelected()) {
            x.add("H1");
        }
        if (kursiA2.isSelected()) {
            x.add("H2");
        }
        if (kursiH3.isSelected()) {
            x.add("H3");
        }
        if (kursiH4.isSelected()) {
            x.add("H4");
        }
        if (kursiH5.isSelected()) {
            x.add("H5");
        }
        if (kursiH6.isSelected()) {
            x.add("H6");
        }
        if (kursiH7.isSelected()) {
            x.add("H7");
        }
        if (kursiH8.isSelected()) {
            x.add("H8");
        }
        if (kursiH9.isSelected()) {
            x.add("H9");
        }
        if (kursiH10.isSelected()) {
            x.add("H10");
        }
        if (kursiH11.isSelected()) {
            x.add("H11");
        }
        if (kursiH12.isSelected()) {
            x.add("H12");
        }
        if (kursiH13.isSelected()) {
            x.add("H13");
        }
        if (kursiH14.isSelected()) {
            x.add("H14");
        }
        if (kursiH15.isSelected()) {
            x.add("H15");
        }
        if (kursiH16.isSelected()) {
            x.add("H16");
        }
        return x;
    }

    public void addActionListener(ActionListener ae) {
        btnDone.addActionListener(ae);
        btnVerify.addActionListener(ae);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        kursiA2 = new javax.swing.JCheckBox();
        kursiA3 = new javax.swing.JCheckBox();
        kursiA4 = new javax.swing.JCheckBox();
        kursiA5 = new javax.swing.JCheckBox();
        kursiA6 = new javax.swing.JCheckBox();
        kursiA7 = new javax.swing.JCheckBox();
        kursiA8 = new javax.swing.JCheckBox();
        kursiA1 = new javax.swing.JCheckBox();
        kursiA16 = new javax.swing.JCheckBox();
        kursiA15 = new javax.swing.JCheckBox();
        kursiA14 = new javax.swing.JCheckBox();
        kursiA13 = new javax.swing.JCheckBox();
        kursiA12 = new javax.swing.JCheckBox();
        kursiA11 = new javax.swing.JCheckBox();
        kursiA10 = new javax.swing.JCheckBox();
        kursiA9 = new javax.swing.JCheckBox();
        kursiB11 = new javax.swing.JCheckBox();
        kursiB13 = new javax.swing.JCheckBox();
        kursiB14 = new javax.swing.JCheckBox();
        kursiB15 = new javax.swing.JCheckBox();
        kursiB10 = new javax.swing.JCheckBox();
        kursiB16 = new javax.swing.JCheckBox();
        kursiB12 = new javax.swing.JCheckBox();
        kursiB9 = new javax.swing.JCheckBox();
        kursiB8 = new javax.swing.JCheckBox();
        kursiB7 = new javax.swing.JCheckBox();
        kursiB6 = new javax.swing.JCheckBox();
        kursiB5 = new javax.swing.JCheckBox();
        kursiB4 = new javax.swing.JCheckBox();
        kursiB3 = new javax.swing.JCheckBox();
        kursiB2 = new javax.swing.JCheckBox();
        kursiB1 = new javax.swing.JCheckBox();
        kursiC11 = new javax.swing.JCheckBox();
        kursiC5 = new javax.swing.JCheckBox();
        kursiC7 = new javax.swing.JCheckBox();
        kursiC13 = new javax.swing.JCheckBox();
        kursiC16 = new javax.swing.JCheckBox();
        kursiC15 = new javax.swing.JCheckBox();
        kursiC12 = new javax.swing.JCheckBox();
        kursiC1 = new javax.swing.JCheckBox();
        kursiC10 = new javax.swing.JCheckBox();
        kursiC6 = new javax.swing.JCheckBox();
        kursiC8 = new javax.swing.JCheckBox();
        kursiC4 = new javax.swing.JCheckBox();
        kursiC14 = new javax.swing.JCheckBox();
        kursiC2 = new javax.swing.JCheckBox();
        kursiC3 = new javax.swing.JCheckBox();
        kursiC9 = new javax.swing.JCheckBox();
        kursiD8 = new javax.swing.JCheckBox();
        kursiD13 = new javax.swing.JCheckBox();
        kursiD15 = new javax.swing.JCheckBox();
        kursiD9 = new javax.swing.JCheckBox();
        kursiD12 = new javax.swing.JCheckBox();
        kursiD1 = new javax.swing.JCheckBox();
        kursiD6 = new javax.swing.JCheckBox();
        kursiD4 = new javax.swing.JCheckBox();
        kursiD2 = new javax.swing.JCheckBox();
        kursiD7 = new javax.swing.JCheckBox();
        kursiD5 = new javax.swing.JCheckBox();
        kursiD3 = new javax.swing.JCheckBox();
        kursiD10 = new javax.swing.JCheckBox();
        kursiD14 = new javax.swing.JCheckBox();
        kursiD11 = new javax.swing.JCheckBox();
        kursiD16 = new javax.swing.JCheckBox();
        kursiE12 = new javax.swing.JCheckBox();
        kursiE16 = new javax.swing.JCheckBox();
        kursiE14 = new javax.swing.JCheckBox();
        kursiE8 = new javax.swing.JCheckBox();
        kursiE2 = new javax.swing.JCheckBox();
        kursiE7 = new javax.swing.JCheckBox();
        kursiE5 = new javax.swing.JCheckBox();
        kursiE4 = new javax.swing.JCheckBox();
        kursiE9 = new javax.swing.JCheckBox();
        kursiE1 = new javax.swing.JCheckBox();
        kursiE15 = new javax.swing.JCheckBox();
        kursiE6 = new javax.swing.JCheckBox();
        kursiE11 = new javax.swing.JCheckBox();
        kursiE13 = new javax.swing.JCheckBox();
        kursiE3 = new javax.swing.JCheckBox();
        kursiE10 = new javax.swing.JCheckBox();
        kursiF3 = new javax.swing.JCheckBox();
        kursiF7 = new javax.swing.JCheckBox();
        kursiF16 = new javax.swing.JCheckBox();
        kursiF1 = new javax.swing.JCheckBox();
        kursiF15 = new javax.swing.JCheckBox();
        kursiF5 = new javax.swing.JCheckBox();
        kursiF13 = new javax.swing.JCheckBox();
        kursiF10 = new javax.swing.JCheckBox();
        kursiF8 = new javax.swing.JCheckBox();
        kursiF11 = new javax.swing.JCheckBox();
        kursiF6 = new javax.swing.JCheckBox();
        kursiF2 = new javax.swing.JCheckBox();
        kursiF4 = new javax.swing.JCheckBox();
        kursiF12 = new javax.swing.JCheckBox();
        kursiF14 = new javax.swing.JCheckBox();
        kursiF9 = new javax.swing.JCheckBox();
        kursiG16 = new javax.swing.JCheckBox();
        kursiG13 = new javax.swing.JCheckBox();
        kursiG4 = new javax.swing.JCheckBox();
        kursiG15 = new javax.swing.JCheckBox();
        kursiG10 = new javax.swing.JCheckBox();
        kursiG3 = new javax.swing.JCheckBox();
        kursiG8 = new javax.swing.JCheckBox();
        kursiG9 = new javax.swing.JCheckBox();
        kursiG1 = new javax.swing.JCheckBox();
        kursiG12 = new javax.swing.JCheckBox();
        kursiG5 = new javax.swing.JCheckBox();
        kursiG11 = new javax.swing.JCheckBox();
        kursiG6 = new javax.swing.JCheckBox();
        kursiG14 = new javax.swing.JCheckBox();
        kursiG7 = new javax.swing.JCheckBox();
        kursiG2 = new javax.swing.JCheckBox();
        kursiH7 = new javax.swing.JCheckBox();
        kursiH4 = new javax.swing.JCheckBox();
        kursiH5 = new javax.swing.JCheckBox();
        kursiH8 = new javax.swing.JCheckBox();
        kursiH9 = new javax.swing.JCheckBox();
        kursiH1 = new javax.swing.JCheckBox();
        kursiH13 = new javax.swing.JCheckBox();
        kursiH3 = new javax.swing.JCheckBox();
        kursiH12 = new javax.swing.JCheckBox();
        kursiH16 = new javax.swing.JCheckBox();
        kursiH6 = new javax.swing.JCheckBox();
        kursiH14 = new javax.swing.JCheckBox();
        kursiH10 = new javax.swing.JCheckBox();
        kursiH2 = new javax.swing.JCheckBox();
        kursiH15 = new javax.swing.JCheckBox();
        kursiH11 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();
        txtKodeTransaksi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKodeKursi = new javax.swing.JTextField();
        btnVerify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel39.setText("Pemesanan Tiket");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Layar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(124, 124, 124))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        kursiA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA2ActionPerformed(evt);
            }
        });

        kursiA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA3ActionPerformed(evt);
            }
        });

        kursiA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA4ActionPerformed(evt);
            }
        });

        kursiA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA5ActionPerformed(evt);
            }
        });

        kursiA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA6ActionPerformed(evt);
            }
        });

        kursiA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA7ActionPerformed(evt);
            }
        });

        kursiA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA8ActionPerformed(evt);
            }
        });

        kursiA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA1ActionPerformed(evt);
            }
        });

        kursiA16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA16ActionPerformed(evt);
            }
        });

        kursiA15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA15ActionPerformed(evt);
            }
        });

        kursiA14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA14ActionPerformed(evt);
            }
        });

        kursiA13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA13ActionPerformed(evt);
            }
        });

        kursiA12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA12ActionPerformed(evt);
            }
        });

        kursiA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA11ActionPerformed(evt);
            }
        });

        kursiA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA10ActionPerformed(evt);
            }
        });

        kursiA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiA9ActionPerformed(evt);
            }
        });

        kursiB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB11ActionPerformed(evt);
            }
        });

        kursiB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB13ActionPerformed(evt);
            }
        });

        kursiB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB14ActionPerformed(evt);
            }
        });

        kursiB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB15ActionPerformed(evt);
            }
        });

        kursiB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB10ActionPerformed(evt);
            }
        });

        kursiB16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB16ActionPerformed(evt);
            }
        });

        kursiB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB12ActionPerformed(evt);
            }
        });

        kursiB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB9ActionPerformed(evt);
            }
        });

        kursiB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB8ActionPerformed(evt);
            }
        });

        kursiB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB7ActionPerformed(evt);
            }
        });

        kursiB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB6ActionPerformed(evt);
            }
        });

        kursiB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB5ActionPerformed(evt);
            }
        });

        kursiB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB4ActionPerformed(evt);
            }
        });

        kursiB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB3ActionPerformed(evt);
            }
        });

        kursiB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB2ActionPerformed(evt);
            }
        });

        kursiB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiB1ActionPerformed(evt);
            }
        });

        kursiC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC11ActionPerformed(evt);
            }
        });

        kursiC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC5ActionPerformed(evt);
            }
        });

        kursiC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC7ActionPerformed(evt);
            }
        });

        kursiC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC13ActionPerformed(evt);
            }
        });

        kursiC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC16ActionPerformed(evt);
            }
        });

        kursiC15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC15ActionPerformed(evt);
            }
        });

        kursiC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC12ActionPerformed(evt);
            }
        });

        kursiC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC1ActionPerformed(evt);
            }
        });

        kursiC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC10ActionPerformed(evt);
            }
        });

        kursiC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC6ActionPerformed(evt);
            }
        });

        kursiC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC8ActionPerformed(evt);
            }
        });

        kursiC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC4ActionPerformed(evt);
            }
        });

        kursiC14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC14ActionPerformed(evt);
            }
        });

        kursiC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC2ActionPerformed(evt);
            }
        });

        kursiC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC3ActionPerformed(evt);
            }
        });

        kursiC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiC9ActionPerformed(evt);
            }
        });

        kursiD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD8ActionPerformed(evt);
            }
        });

        kursiD13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD13ActionPerformed(evt);
            }
        });

        kursiD15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD15ActionPerformed(evt);
            }
        });

        kursiD9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD9ActionPerformed(evt);
            }
        });

        kursiD12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD12ActionPerformed(evt);
            }
        });

        kursiD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD1ActionPerformed(evt);
            }
        });

        kursiD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD6ActionPerformed(evt);
            }
        });

        kursiD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD4ActionPerformed(evt);
            }
        });

        kursiD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD2ActionPerformed(evt);
            }
        });

        kursiD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD7ActionPerformed(evt);
            }
        });

        kursiD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD5ActionPerformed(evt);
            }
        });

        kursiD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD3ActionPerformed(evt);
            }
        });

        kursiD10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD10ActionPerformed(evt);
            }
        });

        kursiD14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD14ActionPerformed(evt);
            }
        });

        kursiD11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD11ActionPerformed(evt);
            }
        });

        kursiD16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiD16ActionPerformed(evt);
            }
        });

        kursiE12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE12ActionPerformed(evt);
            }
        });

        kursiE16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE16ActionPerformed(evt);
            }
        });

        kursiE14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE14ActionPerformed(evt);
            }
        });

        kursiE8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE8ActionPerformed(evt);
            }
        });

        kursiE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE2ActionPerformed(evt);
            }
        });

        kursiE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE7ActionPerformed(evt);
            }
        });

        kursiE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE5ActionPerformed(evt);
            }
        });

        kursiE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE4ActionPerformed(evt);
            }
        });

        kursiE9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE9ActionPerformed(evt);
            }
        });

        kursiE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE1ActionPerformed(evt);
            }
        });

        kursiE15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE15ActionPerformed(evt);
            }
        });

        kursiE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE6ActionPerformed(evt);
            }
        });

        kursiE11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE11ActionPerformed(evt);
            }
        });

        kursiE13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE13ActionPerformed(evt);
            }
        });

        kursiE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE3ActionPerformed(evt);
            }
        });

        kursiE10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiE10ActionPerformed(evt);
            }
        });

        kursiF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF3ActionPerformed(evt);
            }
        });

        kursiF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF7ActionPerformed(evt);
            }
        });

        kursiF16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF16ActionPerformed(evt);
            }
        });

        kursiF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF1ActionPerformed(evt);
            }
        });

        kursiF15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF15ActionPerformed(evt);
            }
        });

        kursiF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF5ActionPerformed(evt);
            }
        });

        kursiF13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF13ActionPerformed(evt);
            }
        });

        kursiF10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF10ActionPerformed(evt);
            }
        });

        kursiF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF8ActionPerformed(evt);
            }
        });

        kursiF11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF11ActionPerformed(evt);
            }
        });

        kursiF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF6ActionPerformed(evt);
            }
        });

        kursiF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF2ActionPerformed(evt);
            }
        });

        kursiF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF4ActionPerformed(evt);
            }
        });

        kursiF12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF12ActionPerformed(evt);
            }
        });

        kursiF14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF14ActionPerformed(evt);
            }
        });

        kursiF9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiF9ActionPerformed(evt);
            }
        });

        kursiG16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG16ActionPerformed(evt);
            }
        });

        kursiG13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG13ActionPerformed(evt);
            }
        });

        kursiG4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG4ActionPerformed(evt);
            }
        });

        kursiG15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG15ActionPerformed(evt);
            }
        });

        kursiG10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG10ActionPerformed(evt);
            }
        });

        kursiG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG3ActionPerformed(evt);
            }
        });

        kursiG8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG8ActionPerformed(evt);
            }
        });

        kursiG9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG9ActionPerformed(evt);
            }
        });

        kursiG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG1ActionPerformed(evt);
            }
        });

        kursiG12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG12ActionPerformed(evt);
            }
        });

        kursiG5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG5ActionPerformed(evt);
            }
        });

        kursiG11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG11ActionPerformed(evt);
            }
        });

        kursiG6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG6ActionPerformed(evt);
            }
        });

        kursiG14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG14ActionPerformed(evt);
            }
        });

        kursiG7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG7ActionPerformed(evt);
            }
        });

        kursiG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiG2ActionPerformed(evt);
            }
        });

        kursiH7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH7ActionPerformed(evt);
            }
        });

        kursiH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH4ActionPerformed(evt);
            }
        });

        kursiH5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH5ActionPerformed(evt);
            }
        });

        kursiH8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH8ActionPerformed(evt);
            }
        });

        kursiH9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH9ActionPerformed(evt);
            }
        });

        kursiH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH1ActionPerformed(evt);
            }
        });

        kursiH13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH13ActionPerformed(evt);
            }
        });

        kursiH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH3ActionPerformed(evt);
            }
        });

        kursiH12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH12ActionPerformed(evt);
            }
        });

        kursiH16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH16ActionPerformed(evt);
            }
        });

        kursiH6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH6ActionPerformed(evt);
            }
        });

        kursiH14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH14ActionPerformed(evt);
            }
        });

        kursiH10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH10ActionPerformed(evt);
            }
        });

        kursiH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH2ActionPerformed(evt);
            }
        });

        kursiH15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH15ActionPerformed(evt);
            }
        });

        kursiH11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiH11ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("A");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("B");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("C");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("D");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("E");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("F");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("G");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("H");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText(" 1");
        jLabel22.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("2");
        jLabel23.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("4");
        jLabel24.setToolTipText("");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("3");
        jLabel25.setToolTipText("");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("6");
        jLabel26.setToolTipText("");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText(" 5");
        jLabel27.setToolTipText("");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("7");
        jLabel28.setToolTipText("");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("8");
        jLabel29.setToolTipText("");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText(" 9");
        jLabel30.setToolTipText("");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("10");
        jLabel31.setToolTipText("");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("11");
        jLabel32.setToolTipText("");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("12");
        jLabel33.setToolTipText("");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("13");
        jLabel34.setToolTipText("");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("14");
        jLabel35.setToolTipText("");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("15");
        jLabel36.setToolTipText("");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("16");
        jLabel37.setToolTipText("");

        btnDone.setText("Done");

        txtKodeTransaksi.setEditable(false);
        txtKodeTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeTransaksiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("kode transaksi");

        jLabel2.setText("Kode Kursi");

        btnVerify.setText("Verify");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kursiB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB8)
                        .addGap(18, 18, 18)
                        .addComponent(kursiB9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiB16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kursiC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC8)
                        .addGap(18, 18, 18)
                        .addComponent(kursiC9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiC16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kursiD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD8)
                        .addGap(18, 18, 18)
                        .addComponent(kursiD9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiD16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kursiE1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE8)
                        .addGap(18, 18, 18)
                        .addComponent(kursiE9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiE16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kursiF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF8)
                        .addGap(18, 18, 18)
                        .addComponent(kursiF9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiF16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kursiG1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG8)
                        .addGap(18, 18, 18)
                        .addComponent(kursiG9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiG16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel22)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKodeTransaksi)
                            .addComponent(txtKodeKursi, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnDone))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerify))))
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kursiH1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH8)
                        .addGap(18, 18, 18)
                        .addComponent(kursiH9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiH16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kursiA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA8)
                        .addGap(18, 18, 18)
                        .addComponent(kursiA9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursiA16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel26)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kursiA2)
                                .addComponent(kursiA3)
                                .addComponent(kursiA4)
                                .addComponent(kursiA5)
                                .addComponent(kursiA6)
                                .addComponent(kursiA7)
                                .addComponent(kursiA8)
                                .addComponent(kursiA1)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kursiA10)
                                .addComponent(kursiA11)
                                .addComponent(kursiA12)
                                .addComponent(kursiA13)
                                .addComponent(kursiA14)
                                .addComponent(kursiA15)
                                .addComponent(kursiA16)
                                .addComponent(kursiA9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kursiB2)
                            .addComponent(kursiB3)
                            .addComponent(kursiB4)
                            .addComponent(kursiB5)
                            .addComponent(kursiB6)
                            .addComponent(kursiB7)
                            .addComponent(kursiB8)
                            .addComponent(kursiB1)
                            .addComponent(kursiB10)
                            .addComponent(kursiB11)
                            .addComponent(kursiB12)
                            .addComponent(kursiB13)
                            .addComponent(kursiB14)
                            .addComponent(kursiB15)
                            .addComponent(kursiB16)
                            .addComponent(kursiB9)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kursiC2)
                            .addComponent(kursiC3)
                            .addComponent(kursiC4)
                            .addComponent(kursiC5)
                            .addComponent(kursiC6)
                            .addComponent(kursiC7)
                            .addComponent(kursiC8)
                            .addComponent(kursiC1)
                            .addComponent(kursiC10)
                            .addComponent(kursiC11)
                            .addComponent(kursiC12)
                            .addComponent(kursiC13)
                            .addComponent(kursiC14)
                            .addComponent(kursiC15)
                            .addComponent(kursiC16)
                            .addComponent(kursiC9)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kursiD2)
                            .addComponent(kursiD3)
                            .addComponent(kursiD4)
                            .addComponent(kursiD5)
                            .addComponent(kursiD6)
                            .addComponent(kursiD7)
                            .addComponent(kursiD8)
                            .addComponent(kursiD1)
                            .addComponent(kursiD10)
                            .addComponent(kursiD11)
                            .addComponent(kursiD12)
                            .addComponent(kursiD13)
                            .addComponent(kursiD14)
                            .addComponent(kursiD15)
                            .addComponent(kursiD16)
                            .addComponent(kursiD9)))
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kursiE2)
                    .addComponent(kursiE3)
                    .addComponent(kursiE4)
                    .addComponent(kursiE5)
                    .addComponent(kursiE6)
                    .addComponent(kursiE7)
                    .addComponent(kursiE8)
                    .addComponent(kursiE1)
                    .addComponent(kursiE10)
                    .addComponent(kursiE11)
                    .addComponent(kursiE12)
                    .addComponent(kursiE13)
                    .addComponent(kursiE14)
                    .addComponent(kursiE15)
                    .addComponent(kursiE16)
                    .addComponent(kursiE9)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kursiF2)
                    .addComponent(kursiF3)
                    .addComponent(kursiF4)
                    .addComponent(kursiF5)
                    .addComponent(kursiF6)
                    .addComponent(kursiF7)
                    .addComponent(kursiF8)
                    .addComponent(kursiF1)
                    .addComponent(kursiF10)
                    .addComponent(kursiF11)
                    .addComponent(kursiF12)
                    .addComponent(kursiF13)
                    .addComponent(kursiF14)
                    .addComponent(kursiF15)
                    .addComponent(kursiF16)
                    .addComponent(kursiF9)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kursiG2)
                    .addComponent(kursiG3)
                    .addComponent(kursiG4)
                    .addComponent(kursiG5)
                    .addComponent(kursiG6)
                    .addComponent(kursiG7)
                    .addComponent(kursiG8)
                    .addComponent(kursiG1)
                    .addComponent(kursiG10)
                    .addComponent(kursiG11)
                    .addComponent(kursiG12)
                    .addComponent(kursiG13)
                    .addComponent(kursiG14)
                    .addComponent(kursiG15)
                    .addComponent(kursiG16)
                    .addComponent(kursiG9)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kursiH2)
                    .addComponent(kursiH3)
                    .addComponent(kursiH4)
                    .addComponent(kursiH5)
                    .addComponent(kursiH6)
                    .addComponent(kursiH7)
                    .addComponent(kursiH8)
                    .addComponent(kursiH1)
                    .addComponent(kursiH10)
                    .addComponent(kursiH11)
                    .addComponent(kursiH12)
                    .addComponent(kursiH13)
                    .addComponent(kursiH14)
                    .addComponent(kursiH15)
                    .addComponent(kursiH16)
                    .addComponent(kursiH9)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVerify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDone)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtKodeTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKodeKursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kursiA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA2ActionPerformed

    private void kursiA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA3ActionPerformed

    private void kursiA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA4ActionPerformed

    private void kursiA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA5ActionPerformed

    private void kursiA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA6ActionPerformed

    private void kursiA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA7ActionPerformed

    private void kursiA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA8ActionPerformed

    private void kursiA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA1ActionPerformed

    private void kursiA16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA16ActionPerformed

    private void kursiA15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA15ActionPerformed

    private void kursiA14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA14ActionPerformed

    private void kursiA13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA13ActionPerformed

    private void kursiA12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA12ActionPerformed

    private void kursiA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA11ActionPerformed

    private void kursiA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA10ActionPerformed

    private void kursiA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiA9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiA9ActionPerformed

    private void kursiB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB11ActionPerformed

    private void kursiB13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB13ActionPerformed

    private void kursiB14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB14ActionPerformed

    private void kursiB15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB15ActionPerformed

    private void kursiB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB10ActionPerformed

    private void kursiB16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB16ActionPerformed

    private void kursiB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB12ActionPerformed

    private void kursiB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB9ActionPerformed

    private void kursiB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB8ActionPerformed

    private void kursiB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB7ActionPerformed

    private void kursiB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB6ActionPerformed

    private void kursiB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB5ActionPerformed

    private void kursiB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB4ActionPerformed

    private void kursiB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB3ActionPerformed

    private void kursiB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB2ActionPerformed

    private void kursiB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiB1ActionPerformed

    private void kursiC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC11ActionPerformed

    private void kursiC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC5ActionPerformed

    private void kursiC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC7ActionPerformed

    private void kursiC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC13ActionPerformed

    private void kursiC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC16ActionPerformed

    private void kursiC15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC15ActionPerformed

    private void kursiC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC12ActionPerformed

    private void kursiC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC1ActionPerformed

    private void kursiC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC10ActionPerformed

    private void kursiC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC6ActionPerformed

    private void kursiC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC8ActionPerformed

    private void kursiC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC4ActionPerformed

    private void kursiC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC14ActionPerformed

    private void kursiC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC2ActionPerformed

    private void kursiC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC3ActionPerformed

    private void kursiC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiC9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiC9ActionPerformed

    private void kursiD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD8ActionPerformed

    private void kursiD13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD13ActionPerformed

    private void kursiD15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD15ActionPerformed

    private void kursiD9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD9ActionPerformed

    private void kursiD12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD12ActionPerformed

    private void kursiD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD1ActionPerformed

    private void kursiD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD6ActionPerformed

    private void kursiD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD4ActionPerformed

    private void kursiD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD2ActionPerformed

    private void kursiD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD7ActionPerformed

    private void kursiD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD5ActionPerformed

    private void kursiD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD3ActionPerformed

    private void kursiD10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD10ActionPerformed

    private void kursiD14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD14ActionPerformed

    private void kursiD11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD11ActionPerformed

    private void kursiD16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiD16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiD16ActionPerformed

    private void kursiE12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE12ActionPerformed

    private void kursiE16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE16ActionPerformed

    private void kursiE14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE14ActionPerformed

    private void kursiE8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE8ActionPerformed

    private void kursiE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE2ActionPerformed

    private void kursiE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE7ActionPerformed

    private void kursiE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE5ActionPerformed

    private void kursiE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE4ActionPerformed

    private void kursiE9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE9ActionPerformed

    private void kursiE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE1ActionPerformed

    private void kursiE15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE15ActionPerformed

    private void kursiE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE6ActionPerformed

    private void kursiE11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE11ActionPerformed

    private void kursiE13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE13ActionPerformed

    private void kursiE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE3ActionPerformed

    private void kursiE10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiE10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiE10ActionPerformed

    private void kursiF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF3ActionPerformed

    private void kursiF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF7ActionPerformed

    private void kursiF16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF16ActionPerformed

    private void kursiF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF1ActionPerformed

    private void kursiF15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF15ActionPerformed

    private void kursiF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF5ActionPerformed

    private void kursiF13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF13ActionPerformed

    private void kursiF10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF10ActionPerformed

    private void kursiF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF8ActionPerformed

    private void kursiF11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF11ActionPerformed

    private void kursiF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF6ActionPerformed

    private void kursiF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF2ActionPerformed

    private void kursiF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF4ActionPerformed

    private void kursiF12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF12ActionPerformed

    private void kursiF14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF14ActionPerformed

    private void kursiF9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiF9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiF9ActionPerformed

    private void kursiG16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG16ActionPerformed

    private void kursiG13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG13ActionPerformed

    private void kursiG4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG4ActionPerformed

    private void kursiG15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG15ActionPerformed

    private void kursiG10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG10ActionPerformed

    private void kursiG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG3ActionPerformed

    private void kursiG8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG8ActionPerformed

    private void kursiG9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG9ActionPerformed

    private void kursiG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG1ActionPerformed

    private void kursiG12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG12ActionPerformed

    private void kursiG5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG5ActionPerformed

    private void kursiG11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG11ActionPerformed

    private void kursiG6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG6ActionPerformed

    private void kursiG14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG14ActionPerformed

    private void kursiG7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG7ActionPerformed

    private void kursiG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiG2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiG2ActionPerformed

    private void kursiH7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH7ActionPerformed

    private void kursiH4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH4ActionPerformed

    private void kursiH5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH5ActionPerformed

    private void kursiH8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH8ActionPerformed

    private void kursiH9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH9ActionPerformed

    private void kursiH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH1ActionPerformed

    private void kursiH13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH13ActionPerformed

    private void kursiH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH3ActionPerformed

    private void kursiH12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH12ActionPerformed

    private void kursiH16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH16ActionPerformed

    private void kursiH6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH6ActionPerformed

    private void kursiH14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH14ActionPerformed

    private void kursiH10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH10ActionPerformed

    private void kursiH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH2ActionPerformed

    private void kursiH15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH15ActionPerformed

    private void kursiH11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiH11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursiH11ActionPerformed

    private void txtKodeTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeTransaksiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PemesananKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemesananKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemesananKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemesananKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemesananKursi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox kursiA1;
    private javax.swing.JCheckBox kursiA10;
    private javax.swing.JCheckBox kursiA11;
    private javax.swing.JCheckBox kursiA12;
    private javax.swing.JCheckBox kursiA13;
    private javax.swing.JCheckBox kursiA14;
    private javax.swing.JCheckBox kursiA15;
    private javax.swing.JCheckBox kursiA16;
    private javax.swing.JCheckBox kursiA2;
    private javax.swing.JCheckBox kursiA3;
    private javax.swing.JCheckBox kursiA4;
    private javax.swing.JCheckBox kursiA5;
    private javax.swing.JCheckBox kursiA6;
    private javax.swing.JCheckBox kursiA7;
    private javax.swing.JCheckBox kursiA8;
    private javax.swing.JCheckBox kursiA9;
    private javax.swing.JCheckBox kursiB1;
    private javax.swing.JCheckBox kursiB10;
    private javax.swing.JCheckBox kursiB11;
    private javax.swing.JCheckBox kursiB12;
    private javax.swing.JCheckBox kursiB13;
    private javax.swing.JCheckBox kursiB14;
    private javax.swing.JCheckBox kursiB15;
    private javax.swing.JCheckBox kursiB16;
    private javax.swing.JCheckBox kursiB2;
    private javax.swing.JCheckBox kursiB3;
    private javax.swing.JCheckBox kursiB4;
    private javax.swing.JCheckBox kursiB5;
    private javax.swing.JCheckBox kursiB6;
    private javax.swing.JCheckBox kursiB7;
    private javax.swing.JCheckBox kursiB8;
    private javax.swing.JCheckBox kursiB9;
    private javax.swing.JCheckBox kursiC1;
    private javax.swing.JCheckBox kursiC10;
    private javax.swing.JCheckBox kursiC11;
    private javax.swing.JCheckBox kursiC12;
    private javax.swing.JCheckBox kursiC13;
    private javax.swing.JCheckBox kursiC14;
    private javax.swing.JCheckBox kursiC15;
    private javax.swing.JCheckBox kursiC16;
    private javax.swing.JCheckBox kursiC2;
    private javax.swing.JCheckBox kursiC3;
    private javax.swing.JCheckBox kursiC4;
    private javax.swing.JCheckBox kursiC5;
    private javax.swing.JCheckBox kursiC6;
    private javax.swing.JCheckBox kursiC7;
    private javax.swing.JCheckBox kursiC8;
    private javax.swing.JCheckBox kursiC9;
    private javax.swing.JCheckBox kursiD1;
    private javax.swing.JCheckBox kursiD10;
    private javax.swing.JCheckBox kursiD11;
    private javax.swing.JCheckBox kursiD12;
    private javax.swing.JCheckBox kursiD13;
    private javax.swing.JCheckBox kursiD14;
    private javax.swing.JCheckBox kursiD15;
    private javax.swing.JCheckBox kursiD16;
    private javax.swing.JCheckBox kursiD2;
    private javax.swing.JCheckBox kursiD3;
    private javax.swing.JCheckBox kursiD4;
    private javax.swing.JCheckBox kursiD5;
    private javax.swing.JCheckBox kursiD6;
    private javax.swing.JCheckBox kursiD7;
    private javax.swing.JCheckBox kursiD8;
    private javax.swing.JCheckBox kursiD9;
    private javax.swing.JCheckBox kursiE1;
    private javax.swing.JCheckBox kursiE10;
    private javax.swing.JCheckBox kursiE11;
    private javax.swing.JCheckBox kursiE12;
    private javax.swing.JCheckBox kursiE13;
    private javax.swing.JCheckBox kursiE14;
    private javax.swing.JCheckBox kursiE15;
    private javax.swing.JCheckBox kursiE16;
    private javax.swing.JCheckBox kursiE2;
    private javax.swing.JCheckBox kursiE3;
    private javax.swing.JCheckBox kursiE4;
    private javax.swing.JCheckBox kursiE5;
    private javax.swing.JCheckBox kursiE6;
    private javax.swing.JCheckBox kursiE7;
    private javax.swing.JCheckBox kursiE8;
    private javax.swing.JCheckBox kursiE9;
    private javax.swing.JCheckBox kursiF1;
    private javax.swing.JCheckBox kursiF10;
    private javax.swing.JCheckBox kursiF11;
    private javax.swing.JCheckBox kursiF12;
    private javax.swing.JCheckBox kursiF13;
    private javax.swing.JCheckBox kursiF14;
    private javax.swing.JCheckBox kursiF15;
    private javax.swing.JCheckBox kursiF16;
    private javax.swing.JCheckBox kursiF2;
    private javax.swing.JCheckBox kursiF3;
    private javax.swing.JCheckBox kursiF4;
    private javax.swing.JCheckBox kursiF5;
    private javax.swing.JCheckBox kursiF6;
    private javax.swing.JCheckBox kursiF7;
    private javax.swing.JCheckBox kursiF8;
    private javax.swing.JCheckBox kursiF9;
    private javax.swing.JCheckBox kursiG1;
    private javax.swing.JCheckBox kursiG10;
    private javax.swing.JCheckBox kursiG11;
    private javax.swing.JCheckBox kursiG12;
    private javax.swing.JCheckBox kursiG13;
    private javax.swing.JCheckBox kursiG14;
    private javax.swing.JCheckBox kursiG15;
    private javax.swing.JCheckBox kursiG16;
    private javax.swing.JCheckBox kursiG2;
    private javax.swing.JCheckBox kursiG3;
    private javax.swing.JCheckBox kursiG4;
    private javax.swing.JCheckBox kursiG5;
    private javax.swing.JCheckBox kursiG6;
    private javax.swing.JCheckBox kursiG7;
    private javax.swing.JCheckBox kursiG8;
    private javax.swing.JCheckBox kursiG9;
    private javax.swing.JCheckBox kursiH1;
    private javax.swing.JCheckBox kursiH10;
    private javax.swing.JCheckBox kursiH11;
    private javax.swing.JCheckBox kursiH12;
    private javax.swing.JCheckBox kursiH13;
    private javax.swing.JCheckBox kursiH14;
    private javax.swing.JCheckBox kursiH15;
    private javax.swing.JCheckBox kursiH16;
    private javax.swing.JCheckBox kursiH2;
    private javax.swing.JCheckBox kursiH3;
    private javax.swing.JCheckBox kursiH4;
    private javax.swing.JCheckBox kursiH5;
    private javax.swing.JCheckBox kursiH6;
    private javax.swing.JCheckBox kursiH7;
    private javax.swing.JCheckBox kursiH8;
    private javax.swing.JCheckBox kursiH9;
    private javax.swing.JTextField txtKodeKursi;
    private javax.swing.JTextField txtKodeTransaksi;
    // End of variables declaration//GEN-END:variables
}
