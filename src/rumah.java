/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class rumah {
    private String warna;
    int harga,tingkat;

    public rumah(String warna, int tingkat, int harga) {
        this.warna = warna;
        this.tingkat = tingkat;
        this.harga = harga;
    }

    public void setTingkat(int t) {
        this.tingkat = t;
    }

    public void setWarna(String w) {
        this.warna = w;
    }

    public void setHarga(int h) {
        this.harga = h;
    }

    ////////////////////////////////////////////    
    public int getTingkat() {
        return tingkat;
    }

    public String getWarna() {
        return warna;
    }

    public int getHarga() {
        return harga;
    }
    
    public int getBeli(){
        int total = getTingkat() * getHarga();
        return total;
}
    /////////////////////////////////////////////
    public static void main(String[] args) {
        
        rumah A = new rumah("",0,0);
        rumah B = new rumah("",0,0);
        ///////////////////
        A.setWarna("Merah");
        A.setTingkat(2);
        A.setHarga(75000000);
        
        ///////////////////
        B.setWarna("Biru");
        B.setTingkat(1);
        B.setHarga(50000000);
        
        System.out.println("Daftar Harga Rumah : "); 
        System.out.println("Harga Rumah 1 " + A.getBeli());
        System.out.println("Harga Rumah 2 " + B.getBeli());
        
}
}