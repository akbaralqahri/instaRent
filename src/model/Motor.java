/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Motor extends Kendaraan{
    private boolean helm;
    private boolean jasHujan;

    public Motor(boolean helm, boolean jasHujan, int idKendaraan, String namaKendaraan, String merekKendaraan, String platNomor, int tahunProduksi, Boolean statusKetersediaan, String warnaKendaraan, int kapasitasKendaraan, String jenisTransmisi, double hargaSewa) {
        super(idKendaraan, namaKendaraan, merekKendaraan, platNomor, tahunProduksi, statusKetersediaan, warnaKendaraan, kapasitasKendaraan, jenisTransmisi, hargaSewa);
        this.helm = helm;
        this.jasHujan = jasHujan;
    }
    
    public void info(){
    }
}
