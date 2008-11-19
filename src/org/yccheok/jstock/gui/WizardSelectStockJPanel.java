/*
 * WizardSelectStockJPanel.java
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Copyright (C) 2007 Cheok YanCheng <yccheok@yahoo.com>
 */

package org.yccheok.jstock.gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.yccheok.jstock.engine.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author  yccheok
 */
public class WizardSelectStockJPanel extends javax.swing.JPanel {
    
    /** Creates new form WizardSelectStockJPanel */
    public WizardSelectStockJPanel(StockCodeAndSymbolDatabase stockCodeAndSymbolDatabase) {
        initComponents();
        
        initBoardCheckBoxes(stockCodeAndSymbolDatabase);
        initIndustryCheckBoxes(stockCodeAndSymbolDatabase);
        
        updateCheckBoxesState();        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jXHeader1 = new org.jdesktop.swingx.JXHeader();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jRadioButton4 = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(638, 488));
        setLayout(new java.awt.BorderLayout(5, 5));

        jXHeader1.setDescription("You may select to scan only the stocks which are within your interest. You may select either Main board, Second board, Mesdaq...Or you may select either Plantation, Banking, Consumer industry...Of course, you may also select entire stock market.");
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/128x128/find.png"))); // NOI18N
        jXHeader1.setTitle("Select Stock of Interest");
        add(jXHeader1, java.awt.BorderLayout.NORTH);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Scan the entire stock market (Everything including Call warrant, Loans...)");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Scan based on board");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Board"));

        jCheckBox1.setText("Main board");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox2.setText("Second board");
        jCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox3.setText("Call warrant");
        jCheckBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox3.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox21.setText("Mesdaq");
        jCheckBox21.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox21.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox4.setText("Call warrant");
        jCheckBox4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox4.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox23.setText("Call warrant");
        jCheckBox23.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox23.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox25.setText("Call warrant");
        jCheckBox25.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox25.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox26.setText("Call warrant");
        jCheckBox26.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox26.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox27.setText("Call warrant");
        jCheckBox27.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox27.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox25)
                        .addGap(49, 49, 49)
                        .addComponent(jCheckBox26)))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox27)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox21))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox25)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Scan based on industry");
        jRadioButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Industry"));

        jCheckBox5.setText("Consumer products");
        jCheckBox5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox5.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox6.setText("Trading / Services");
        jCheckBox6.setActionCommand("Trading/Services");
        jCheckBox6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox6.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox7.setText("Industrial products");
        jCheckBox7.setActionCommand("Industry Product");
        jCheckBox7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox7.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox8.setText("Technology");
        jCheckBox8.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox8.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox9.setText("Construction");
        jCheckBox9.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox9.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox10.setText("Infrastructure");
        jCheckBox10.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox10.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox11.setText("Finance");
        jCheckBox11.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox11.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox12.setText("Hotels");
        jCheckBox12.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox12.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox13.setText("Properties");
        jCheckBox13.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox13.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox14.setText("Plantation");
        jCheckBox14.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox14.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox15.setText("Mining");
        jCheckBox15.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox15.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox16.setText("Trusts");
        jCheckBox16.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox16.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox17.setText("Close-end fund");
        jCheckBox17.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox17.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox18.setText("ETF");
        jCheckBox18.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox18.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox19.setText("Call warrant");
        jCheckBox19.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox19.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox20.setText("Unknown");
        jCheckBox20.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox20.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox22.setText("Loans");
        jCheckBox22.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox22.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBox24.setText("Unknown");
        jCheckBox24.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox24.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox19))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox20))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox24)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox9))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Scan based on Real-Time Info tab");
        jRadioButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(16, 16, 16)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addContainerGap(392, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
// TODO add your handling code here:
        updateCheckBoxesState();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
// TODO add your handling code here:
        updateCheckBoxesState();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
// TODO add your handling code here:
        updateCheckBoxesState();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        updateCheckBoxesState();
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    
    public void updateCheckBoxesState() {
        for(Component component : jPanel2.getComponents()) {
            component.setEnabled(jRadioButton2.isSelected());
        }

        for(Component component : jPanel3.getComponents()) {
            component.setEnabled(jRadioButton3.isSelected());
        }        
    }
    
    public void updateRadioBoxState() {
        MainFrame m = (MainFrame)javax.swing.SwingUtilities.getAncestorOfClass(MainFrame.class, WizardSelectStockJPanel.this);
        java.util.List<Stock> stocks = m.getStocks();
        jRadioButton4.setEnabled(stocks.size() > 0);        
    }
    
    public boolean isSelectionValid() {
        if(jRadioButton1.isSelected())
            return true;
        
        if(jRadioButton2.isSelected()) {        
            for(JCheckBox checkBox : boardCheckBoxes) {
                if(checkBox.isSelected()) return true;
            }
        }
        
        if(jRadioButton3.isSelected()) {        
            for(JCheckBox checkBox : industryCheckBoxes) {
                if(checkBox.isSelected()) return true;
            }
        }

        if(jRadioButton4.isSelected())
            return true;
        
        return false;
    }
    
    public void installActionListenerToAllComponents(ActionListener actionListener) {
        jCheckBox1.addActionListener(actionListener);
        jCheckBox10.addActionListener(actionListener);
        jCheckBox11.addActionListener(actionListener);
        jCheckBox12.addActionListener(actionListener);
        jCheckBox13.addActionListener(actionListener);
        jCheckBox14.addActionListener(actionListener);
        jCheckBox15.addActionListener(actionListener);
        jCheckBox16.addActionListener(actionListener);
        jCheckBox17.addActionListener(actionListener);
        jCheckBox18.addActionListener(actionListener);
        jCheckBox19.addActionListener(actionListener);
        jCheckBox2.addActionListener(actionListener);
        jCheckBox20.addActionListener(actionListener);
        jCheckBox21.addActionListener(actionListener);
        jCheckBox22.addActionListener(actionListener);
        jCheckBox3.addActionListener(actionListener);
        jCheckBox5.addActionListener(actionListener);
        jCheckBox6.addActionListener(actionListener);
        jCheckBox7.addActionListener(actionListener);
        jCheckBox8.addActionListener(actionListener);
        jCheckBox9.addActionListener(actionListener);
        jCheckBox4.addActionListener(actionListener);
        jCheckBox23.addActionListener(actionListener);
        jCheckBox24.addActionListener(actionListener);
		jCheckBox25.addActionListener(actionListener);
		jCheckBox26.addActionListener(actionListener);
		jCheckBox27.addActionListener(actionListener);
        jRadioButton1.addActionListener(actionListener);
        jRadioButton2.addActionListener(actionListener);
        jRadioButton3.addActionListener(actionListener);
        jRadioButton4.addActionListener(actionListener);
    }
    
    public boolean buildSelectedCode() {
        selectedCodes.clear();
        
        MainFrame m = (MainFrame)javax.swing.SwingUtilities.getAncestorOfClass(MainFrame.class, WizardSelectStockJPanel.this);
        
        if(m.getStockCodeAndSymbolDatabase() == null) {
            log.error("Unable to locate MainFrame");
            return false;
        }
        
        if(jRadioButton1.isSelected()) {
            selectedCodes.addAll(m.getStockCodeAndSymbolDatabase().getCodes());
            return true;
        }
        
        if(jRadioButton2.isSelected()) {            
             for(JCheckBox checkBox : boardCheckBoxes) {                    
                if(checkBox.isSelected() == false) continue;

                final Stock.Board board = this.checkBoxToBoard.get(checkBox);

                if(board == null) {
                    log.error("Wrong text in JCheckBox GUI : " + checkBox.getText());
                    continue;
                }

                selectedCodes.addAll(m.getStockCodeAndSymbolDatabase().getCodes(board));
            } 
                        
            return true;
        }
        
        if(jRadioButton3.isSelected()) {            
             for(JCheckBox checkBox : industryCheckBoxes) {                    
                if(checkBox.isSelected() == false) continue;

                final Stock.Industry industry = this.checkBoxToIndustry.get(checkBox);

                if(industry == null) {
                    log.error("Wrong text in JCheckBox GUI : " + checkBox.getText());
                    continue;
                }

                selectedCodes.addAll(m.getStockCodeAndSymbolDatabase().getCodes(industry));
            } 
                        
            return true;
        }
        
        if(jRadioButton4.isSelected()) {
            java.util.List<Stock> stocks = m.getStocks();
            for(Stock stock : stocks) {
                selectedCodes.add(stock.getCode());
            }

	    return true;
        }
        
        return false;
    }
    
    public java.util.List<Code> getSelectedCodes() {
        return java.util.Collections.unmodifiableList(selectedCodes);
    }
    
    private void initBoardCheckBoxes(StockCodeAndSymbolDatabase stockCodeAndSymbolDatabase) {
        boardCheckBoxes.add(jCheckBox1);
        boardCheckBoxes.add(jCheckBox2);
        boardCheckBoxes.add(jCheckBox21);
        boardCheckBoxes.add(jCheckBox3);
        boardCheckBoxes.add(jCheckBox4);
        boardCheckBoxes.add(jCheckBox23);
        boardCheckBoxes.add(jCheckBox25);
        boardCheckBoxes.add(jCheckBox26);
        boardCheckBoxes.add(jCheckBox27);
        
        for(JCheckBox checkBox : boardCheckBoxes) {
            checkBox.setVisible(false);
        }
        
        Set<Stock.Board> boards = stockCodeAndSymbolDatabase.getBoards();
        java.util.List<Stock.Board> sortedBoards = new ArrayList<Stock.Board>();
        sortedBoards.addAll(boards);
        Collections.sort(sortedBoards);
        
        int count = 0;
        for(Stock.Board board : sortedBoards) {
            if(count >= boardCheckBoxes.size()) {
                log.error("You do not have enough check box components (" + boardCheckBoxes.size() + ") to hold board (" + boards.size() + ")");
                break;
            }
            
            javax.swing.JCheckBox checkBox = boardCheckBoxes.get(count++);
            checkBox.setText(board.toString());
            checkBox.setVisible(true);
            checkBoxToBoard.put(checkBox, board);
        }        
    }

    private void initIndustryCheckBoxes(StockCodeAndSymbolDatabase stockCodeAndSymbolDatabase) {
        industryCheckBoxes.add(jCheckBox5);
        industryCheckBoxes.add(jCheckBox7);
        industryCheckBoxes.add(jCheckBox9);
        industryCheckBoxes.add(jCheckBox6);
        industryCheckBoxes.add(jCheckBox8);
        industryCheckBoxes.add(jCheckBox10);
        industryCheckBoxes.add(jCheckBox11);
        industryCheckBoxes.add(jCheckBox12);
        industryCheckBoxes.add(jCheckBox13);
        industryCheckBoxes.add(jCheckBox14);
        industryCheckBoxes.add(jCheckBox15);
        industryCheckBoxes.add(jCheckBox16);
        industryCheckBoxes.add(jCheckBox17);
        industryCheckBoxes.add(jCheckBox18);
        industryCheckBoxes.add(jCheckBox22);
        industryCheckBoxes.add(jCheckBox19);
        industryCheckBoxes.add(jCheckBox20);
        industryCheckBoxes.add(jCheckBox24);
        
        for(JCheckBox checkBox : industryCheckBoxes) {
            checkBox.setVisible(false);
        }
        
        Set<Stock.Industry> industries = stockCodeAndSymbolDatabase.getIndustries();
        java.util.List<Stock.Industry> sortedIndustries = new ArrayList<Stock.Industry>();
        sortedIndustries.addAll(industries);
        Collections.sort(sortedIndustries);
        
        int count = 0;
        for(Stock.Industry industry : sortedIndustries) {
            if(count >= industryCheckBoxes.size()) {
                log.error("You do not have enough check box components (" + industryCheckBoxes.size() + ") to hold industry (" + industries.size() + ")");
                break;
            }
            
            javax.swing.JCheckBox checkBox = industryCheckBoxes.get(count++);
            checkBox.setText(industry.toString());
            checkBox.setVisible(true);
            checkBoxToIndustry.put(checkBox, industry);
        }
    }
    
    private java.util.List<javax.swing.JCheckBox> boardCheckBoxes = new java.util.ArrayList<javax.swing.JCheckBox>();
    private java.util.List<javax.swing.JCheckBox> industryCheckBoxes = new java.util.ArrayList<javax.swing.JCheckBox>();
    private java.util.Map<javax.swing.JCheckBox, Stock.Industry> checkBoxToIndustry = new java.util.HashMap<javax.swing.JCheckBox, Stock.Industry>();
    private java.util.Map<javax.swing.JCheckBox, Stock.Board> checkBoxToBoard = new java.util.HashMap<javax.swing.JCheckBox, Stock.Board>();
    
    private java.util.List<Code> selectedCodes = new java.util.ArrayList<Code>();
    
    private static final Log log = LogFactory.getLog(WizardSelectStockJPanel.class);
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    // End of variables declaration//GEN-END:variables
    
}
