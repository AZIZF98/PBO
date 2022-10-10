/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M4;

/**
 *
 * @author LENOVO
 */
public class Tiket {

    private String bookingID, nik, nama, jenis_kelamin, tglberangkat, tglkembali, kotaasal;

    public Tiket(String bookingID, String nik, String nama, String jenis_kelamin, String tglberangkat, String tglkembali, String kotaasal) {
        this.bookingID = bookingID;
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tglberangkat = tglberangkat;
        this.tglkembali = tglkembali;
        this.kotaasal = kotaasal;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public String getTglberangkat() {
        return tglberangkat;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public String getKotaasal() {
        return kotaasal;
    }

}
