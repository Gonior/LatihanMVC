/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dedicahya.latihanmvc.controller;

import edu.dedicahya.latihanmvc.model.PelangganModel;
import edu.dedicahya.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * Nama     : Dedi Cahya
 * Nim      : 10118901
 * Kelas    : IF11k
 * 
 */
public class PelanggaController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetFoam(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telepon = view.getTxtTelpon().getText();
        
        if (nama.equals("") && email.equals("") && telepon.equals("")) {
            
        } else {
            model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telepon = view.getTxtTelpon().getText();
                
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Masih Kosong");
            
        } else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Email Masih Kosong");
        } else if(telepon.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "No Telepon Masih Kosong");
        } else {
            model.simpanForm();
        }
        
    }
}
