/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_object_2;

/**
 *
 * @author LENOVO
 */
public class Samsung {
    
    private int harga,jumlah,total;
    
    //setter
    public void setHarga(int h){
        harga = h;
    }
    public void setJumlah(int j){
        jumlah = j;
    }
    
    
    //getter

    public int getHarga() {
        return this.harga;
    }

    public int getJumlah() {
        return this.jumlah;
    }
  
    //custom \
    public int getBeli(){
        total = getHarga() * getJumlah();
        return total;
    }
}
