/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author User
 */
public class Penyewaan {
    private int id_penyewaan;
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private Pembayaran pembayaran;
    private Date mulaiSewa;
    private Date selesaiSewa;
    
    public Penyewaan(int id_penyewaan, Pelanggan pelanggan, Kendaraan kendaraan, Pembayaran pembayaran, Date mulaiSewa, Date selesaiSewa){
        this.id_penyewaan = id_penyewaan;
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.pembayaran = pembayaran;
        this.mulaiSewa = mulaiSewa;
        this.selesaiSewa = selesaiSewa;
                
    }

    public int getId_penyewaan() {
        return id_penyewaan;
    }

    public void setId_penyewaan(int id_penyewaan) {
        this.id_penyewaan = id_penyewaan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setCustomer(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }

    public Date getMulaiSewa() {
        return mulaiSewa;
    }

    public void setMulaiSewa(Date mulaiSewa) {
        this.mulaiSewa = mulaiSewa;
    }

    public Date getSelesaiSewa() {
        return selesaiSewa;
    }

    public void setSelesaiSewa(Date selesaiSewa) {
        this.selesaiSewa = selesaiSewa;
    }
}
