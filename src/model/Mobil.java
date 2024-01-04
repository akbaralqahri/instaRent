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
public class Mobil extends Kendaraan{
    private boolean supir;

    public Mobil(boolean supir, int idKendaraan, String namaKendaraan, String merekKendaraan, String platNomor, int tahunProduksi, Boolean statusKetersediaan, String warnaKendaraan, int kapasitasKendaraan, String jenisTransmisi, double hargaSewa) {
        super(idKendaraan, namaKendaraan, merekKendaraan, platNomor, tahunProduksi, statusKetersediaan, warnaKendaraan, kapasitasKendaraan, jenisTransmisi, hargaSewa);
        this.supir = supir;
    }

    public boolean isSupir() {
        return supir;
    }

    public void setSupir(boolean supir) {
        this.supir = supir;
    }
    
    public void info(){
    }
}

