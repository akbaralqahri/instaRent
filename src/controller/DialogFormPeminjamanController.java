/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.dialogFormPeminjaman;
import view.halamanLanjutanTransaksi;

/**
 *
 * @author akbar
 */
public class DialogFormPeminjamanController {
    dialogFormPeminjaman dialogForm;

    public DialogFormPeminjamanController(dialogFormPeminjaman dialogFormPeminjaman) {
        this.dialogForm = dialogFormPeminjaman;
    }
    
    public boolean transaksi(){

        String nama = this.dialogForm.getTf_nama().getText();
        String nik = this.dialogForm.getTf_nik().getText();
        String noTlp = this.dialogForm.getTf_notelp().getText();
        String email = this.dialogForm.getTf_email1().getText()+this.dialogForm.getTf_email2().getText();
        String alamat = this.dialogForm.getTf_alamatjl().getText()+this.dialogForm.getTf_alamatkel().getText()+this.dialogForm.getTf_alamatkec().getText()+this.dialogForm.getTf_alamatkota().getText();

        if (nama.isEmpty() || nik.isEmpty() || noTlp.isEmpty() || email.isEmpty() || alamat.isEmpty()) {
            this.dialogForm.getLabelInfo().setText("Data tidak boleh kosong");
            return false;
        }

        new halamanLanjutanTransaksi(nama,nik,noTlp,email,alamat,this.dialogForm.getId()).setVisible(true);
        this.dialogForm.dispose();
        return true;
    }
    
    
}
