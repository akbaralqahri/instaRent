/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Kendaraan;
import model.Mobil;
import model.Motor;
import java.sql.SQLException;
import javax.swing.*;
import view.halamanTambahMobil;

/**
 *
 * @author User
 */
public class TambahMobilController {
    private halamanTambahMobil tambahMobil;
    
    public TambahMobilController(halamanTambahMobil tambahMobil){
        this.tambahMobil=tambahMobil;
    }
    
    public void tambahMobil(){
        try {
            DBConn db = new DBConn();
            db.connect();
            
            String jenisKendaraan = tambahMobil.getcomboBoxKendaraan().getSelectedItem()+"";
            String merk = tambahMobil.getTextFieldMerk().getText();
            String tipe = tambahMobil.getTextFieldTipe().getText();
            String plat = tambahMobil.getTextFieldPlat().getText();
            String tahun = tambahMobil.getComboBoxTahun().getSelectedItem()+"";
            String warna = tambahMobil.getTextFieldWarna().getText();
            int kapasitas = Integer.parseInt(tambahMobil.getComboBoxKapasitas().getSelectedItem()+"");
            String transmisi = tambahMobil.getComboBoxTransmisi().getSelectedItem()+"";
            double harga = Double.valueOf(tambahMobil.getSpinnerHarga().getValue().toString()).doubleValue();


            String sql = "INSERT INTO db_tubes.kendaraan (jenisKendaraan, nama, merek, platNomor, tahunProduksi, warnaKendaraan, kapasitasPenumpang, jenisTransmisi, hargaSewa, supir, helm, jasHujan) VALUES ('"+jenisKendaraan+"','"+tipe+"','"+merk+"','"+plat+"','"+tahun+"','"+warna+"',"+kapasitas+",'"+transmisi+"',"+harga+",false,false,false);";
            db.Query(sql);

            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
            db.disconnect();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void tampilData(){
        try{
            DBConn db = new DBConn();
            db.connect();
            db.view("SELECT id, jenisKendaraan, nama, merek, platNomor, tahunProduksi, warnaKendaraan, kapasitasPenumpang, jenisTransmisi, hargaSewa FROM db_tubes.kendaraan;");
        
            for(int i=0;i<10;i++){
                if(db.rs.next()){
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getInt(1), i, 0);
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getString(2), i, 1);
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getString(3), i, 2);
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getString(4), i, 3);
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getString(5), i, 4);
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getString(6), i, 5);
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getString(7), i, 6);
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getInt(8), i, 7);
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getString(9), i, 8);
                    tambahMobil.getTable().getModel().setValueAt(db.rs.getDouble(10), i, 9);   
                } else {
                    tambahMobil.getTable().getModel().setValueAt("", i, 0);
                    tambahMobil.getTable().getModel().setValueAt("", i, 1);
                    tambahMobil.getTable().getModel().setValueAt("", i, 2);
                    tambahMobil.getTable().getModel().setValueAt("", i, 3);
                    tambahMobil.getTable().getModel().setValueAt("", i, 4);
                    tambahMobil.getTable().getModel().setValueAt("", i, 5);
                    tambahMobil.getTable().getModel().setValueAt("", i, 6);
                    tambahMobil.getTable().getModel().setValueAt(null, i, 7);
                    tambahMobil.getTable().getModel().setValueAt(null, i, 8);
                    tambahMobil.getTable().getModel().setValueAt(null, i, 9);
                }
            }
            db.disconnect();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void DeleteKendaraan(){
        try{
            DBConn db = new DBConn();
            db.connect();
            // Mengambil objek JTable dari getTable()
            JTable table = tambahMobil.getTable();
        
            // Mendapatkan baris yang dipilih
            int selectedRow = table.getSelectedRow();

            db.Query("DELETE FROM db_tubes.kendaraan WHERE id = "+table.getModel().getValueAt(selectedRow, 0)+";");
            table.getModel().setValueAt("",selectedRow,0);
            table.getModel().setValueAt("",selectedRow,1);
            table.getModel().setValueAt("",selectedRow,2);
            table.getModel().setValueAt("",selectedRow,3);
            table.getModel().setValueAt("",selectedRow,4);
            table.getModel().setValueAt("",selectedRow,5);
            table.getModel().setValueAt("",selectedRow,6);
            table.getModel().setValueAt(null,selectedRow,7);
            table.getModel().setValueAt(null,selectedRow,8);
            table.getModel().setValueAt(null,selectedRow,9);
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            db.disconnect();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
