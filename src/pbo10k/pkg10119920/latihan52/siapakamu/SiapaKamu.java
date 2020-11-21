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

public class SiapaKamu {

    public static void main(String[] args) {
        
        Dosen d = new Dosen();
        d.setNip("41227829930");
        d.setNama("Rizki Adam Kurniawan");
        d.setUmur(27);
        d.setMataKuliah("PBO");
        
        System.out.println("NIP DOSEN : " + d.getNip());
        d.siapaKamu();
        d.mengajarApa();
        
        System.out.println();
        
        Mahasiswa m = new Mahasiswa();
        m.setNim("10110269");
        m.setNama("Nindi");
        m.setUmur(17);
        m.setKelas("PBO2");
        
        System.out.println("NIM MAHASISWA : " + m.getNim());
        m.siapaKamu();
        m.kelasApa();
    }
}
