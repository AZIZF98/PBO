/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M4;

/**
 *
 * @author LENOVO
 */
public class Lion_air extends Tiket {

    int jumlahpenumpang, harga, total;
    String kotatujuan, nopesawat, nokursi;

    public Lion_air(String bookingID, String nik, String nama, String jenis_kelamin, String tglberangkat, String tglkembali, String kotaasal,String kotatujuan, String nopesawat, String nokursi,int jumlahpenumpang) {
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

    public String getKotatujuan() {
        return kotatujuan;
    }

    public String getNopesawat() {
        return nopesawat;
    }

    public String getNokursi() {
        return nokursi;
    }

    public int getHarga() {
        if (getKotaasal().equalsIgnoreCase("Surabaya")) {
            if (getKotatujuan().equalsIgnoreCase("Bali") || getKotatujuan().equalsIgnoreCase("Lombok")) {
                harga = 500000;
            } else if (getKotatujuan().equalsIgnoreCase("Jakarta") || getKotatujuan().equalsIgnoreCase("Yogyakarta")) {
                harga = 600000;
            } else if (getKotatujuan().equalsIgnoreCase("Balikpapan") || getKotatujuan().equalsIgnoreCase("Makassar")) {
                harga = 700000;
            }
        } else if (getKotaasal().equalsIgnoreCase("Jakarta")) {
            if (getKotatujuan().equalsIgnoreCase("Bali") || getKotatujuan().equalsIgnoreCase("Lombok")) {
                harga = 700000;
            } else if (getKotatujuan().equalsIgnoreCase("Surabaya") || getKotatujuan().equalsIgnoreCase("Yogyakarta")) {
                harga = 750000;
            } else if (getKotatujuan().equalsIgnoreCase("Balikpapan") || getKotatujuan().equalsIgnoreCase("Makassar")) {
                harga = 800000;
            }
        }
        return harga;
    }

    public int getTotal() {
        total = getHarga() * getJumlahpenumpang();
        return total;
    }

}
