/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class Dosen extends Manusia {
    
    private String nip;
    private String mataKuliah;
    
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getMataKuliah() {
        return mataKuliah;
    }
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa() {
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar matakuliah " + mataKuliah);
    }
    
    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
