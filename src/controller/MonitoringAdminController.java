/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javax.swing.*;
import view.halamanMonitoringAdmin;
import view.halamanTambahMobil;
/**
 *
 * @author User
 */
public class MonitoringAdminController {
    private halamanMonitoringAdmin monitoringAdmin;
    
    public MonitoringAdminController(halamanMonitoringAdmin monitoringAdmin){
        this.monitoringAdmin = monitoringAdmin;
    }
    
    public void tampilData() {
        try{
            DBConn db = new DBConn();
            db.connect();
            db.view("SELECT * FROM db_tubes.penyewaan;");

            int i = 0;
            
            while(DBConn.rs.next()){
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getInt(1), i, 0);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getString(2), i, 1);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getString(3), i, 2);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getString(4), i, 3);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getString(5), i, 4);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getString(6), i, 5);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getInt(7), i, 6);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getInt(8), i, 7);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getInt(9), i, 8);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getDate(10), i, 9);
                monitoringAdmin.getTable().getModel().setValueAt(db.rs.getDate(11), i, 10);
                i++;
            }
            
            db.disconnect();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
