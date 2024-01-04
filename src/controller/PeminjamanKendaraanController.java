/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.dialogFormPeminjaman;
import view.halamanPeminjamanKendaraan;

/**
 *
 * @author akbar
 */
public class PeminjamanKendaraanController {
    private halamanPeminjamanKendaraan peminjamanKendaraan;
    
    public PeminjamanKendaraanController(halamanPeminjamanKendaraan pK){
        this.peminjamanKendaraan = pK;
    }
    
    public void tampilDataMobil(){
        try{
            DBConn db = new DBConn();
            db.connect();
            db.view("SELECT id, nama, merek, platNomor, tahunProduksi, warnaKendaraan, kapasitasPenumpang, jenisTransmisi, hargaSewa FROM db_tubes.kendaraan WHERE jenisKendaraan = 'mobil';");
            int i = 0;
            
            while(db.rs.next()){
                peminjamanKendaraan.getMobil().getModel().setValueAt(db.rs.getInt(1), i, 0);
                peminjamanKendaraan.getMobil().getModel().setValueAt(db.rs.getString(2), i, 1);
                peminjamanKendaraan.getMobil().getModel().setValueAt(db.rs.getString(3), i, 2);
                peminjamanKendaraan.getMobil().getModel().setValueAt(db.rs.getString(4), i, 3);
                peminjamanKendaraan.getMobil().getModel().setValueAt(db.rs.getString(5), i, 4);
                peminjamanKendaraan.getMobil().getModel().setValueAt(db.rs.getString(6), i, 5);
                peminjamanKendaraan.getMobil().getModel().setValueAt(db.rs.getInt(7), i, 6);
                peminjamanKendaraan.getMobil().getModel().setValueAt(db.rs.getString(8), i, 7);
                peminjamanKendaraan.getMobil().getModel().setValueAt(db.rs.getDouble(9), i, 8);
                i++;
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void tampilDataMotor(){
        try{
            DBConn db = new DBConn();
            db.connect();
            db.view("SELECT id, nama, merek, platNomor, tahunProduksi, warnaKendaraan, kapasitasPenumpang, jenisTransmisi, hargaSewa FROM db_tubes.kendaraan WHERE jenisKendaraan = 'motor';");
            int i = 0;
            
            while(db.rs.next()){
                peminjamanKendaraan.getMotor().getModel().setValueAt(db.rs.getInt(1), i, 0);
                peminjamanKendaraan.getMotor().getModel().setValueAt(db.rs.getString(2), i, 1);
                peminjamanKendaraan.getMotor().getModel().setValueAt(db.rs.getString(3), i, 2);
                peminjamanKendaraan.getMotor().getModel().setValueAt(db.rs.getString(4), i, 3);
                peminjamanKendaraan.getMotor().getModel().setValueAt(db.rs.getString(5), i, 4);
                peminjamanKendaraan.getMotor().getModel().setValueAt(db.rs.getString(6), i, 5);
                peminjamanKendaraan.getMotor().getModel().setValueAt(db.rs.getInt(7), i, 6);
                peminjamanKendaraan.getMotor().getModel().setValueAt(db.rs.getString(8), i, 7);
                peminjamanKendaraan.getMotor().getModel().setValueAt(db.rs.getDouble(9), i, 8);
                i++;
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void clickSewa(){
        String tabel = this.peminjamanKendaraan.getTabelMobilMotor().getSelectedComponent().getAccessibleContext().getAccessibleName();
        if (tabel.equals("Mobil")){
            int row = this.peminjamanKendaraan.getMobil().getSelectedRow();
            int id = Integer.parseInt(this.peminjamanKendaraan.getMobil().getValueAt(row, 0).toString());
            new dialogFormPeminjaman(this.peminjamanKendaraan, false,id).setVisible(true);
        } else if (tabel.equals("Motor")){
            int row = this.peminjamanKendaraan.getMotor().getSelectedRow();
            int id = Integer.parseInt(this.peminjamanKendaraan.getMotor().getValueAt(row, 0).toString());
            new dialogFormPeminjaman(this.peminjamanKendaraan, false,id).setVisible(true);
        }
    }
}
