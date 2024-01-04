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
public class Pelanggan extends User {
    private int idPelanggan;
    private String alamatPelanggan;
    private String teleponPelanggan;

    public Pelanggan(String username, String password, String email, int id, String alamat, String telepon) {
        super(username, password, email);
        this.idPelanggan = id;
        this.alamatPelanggan = alamat;
        this.teleponPelanggan = telepon;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getAlamatPelanggan() {
        return alamatPelanggan;
    }

    public void setAlamatPelanggan(String alamatPelanggan) {
        this.alamatPelanggan = alamatPelanggan;
    }

    public String getTeleponPelanggan() {
        return teleponPelanggan;
    }

    public void setTeleponPelanggan(String teleponPelanggan) {
        this.teleponPelanggan = teleponPelanggan;
    }
}
