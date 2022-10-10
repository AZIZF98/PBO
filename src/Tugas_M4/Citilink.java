/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M4;

/**
 *
 * @author LENOVO
 */
public class Citilink extends Tiket {

    int jumlahpenumpang, harga;
    String kotatujuan, nopesawat, nokursi;

    public Citilink(String bookingID, String nik, String nama, String jenis_kelamin, String tglberangkat, String tglkembali, String kotaasal, int jumlahpenumpang, int harga, String kotatujuan, String nopesawat, String nokursi) {
        super(bookingID, nik, nama, jenis_kelamin, tglberangkat, tglkembali, kotaasal);
        this.jumlahpenumpang = jumlahpenumpang;
        this.harga = harga;
        this.kotatujuan = kotatujuan;
        this.nopesawat = nopesawat;
        this.nokursi = nokursi;
    }

    public int getJumlahpenumpang() {
        return jumlahpenumpang;
    }

    public int getHarga() {
        return harga;
    }

    public String getKotatujuan() {
        return kotatujuan;
    }

    public String getNopesawat() {
        return nopesawat;
    }

    public String getNokursi() {
        return nokursi;
    }

    public int getTotal() {
        return harga;
    }

}
