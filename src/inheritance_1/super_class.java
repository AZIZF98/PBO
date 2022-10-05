/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_1;

import java.io.*;

/**
 *
 * @author LENOVO
 */
public class super_class {

    //atribut super class
    private String nama, keterangan;

    //constructor
    public super_class(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    //Getter
    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void cetak() {
        System.out.println(getNama() + " " + getKeterangan());
    }

    public void halo() {
        System.out.println("Halo");
    }
}
