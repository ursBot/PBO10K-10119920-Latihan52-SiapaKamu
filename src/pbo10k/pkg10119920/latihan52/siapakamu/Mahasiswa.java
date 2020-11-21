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

public class Mahasiswa extends Manusia {
    
    private String nim;
    private String kelas;
    
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getKelas() {
        return kelas;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa() {
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang belajar di kelas " + kelas);
    }
    
    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
