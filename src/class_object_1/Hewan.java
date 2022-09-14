/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_object_1;

/**
 *
 * @author LENOVO
 */
public class Hewan {
    //atribut 
     private String tipe,suara;
     private int usia;
     
     //setter dari semua variabel /atribut
     //setter memiliki parameter
     public void setTipe(String t){
         tipe = t ;   
     }
     public void setSuara(String suara){
         this.suara=suara;
     }
     public void setUsia(int usia){
         this.usia=usia;
     }
     
     //getter biasanya tidak memiliki parameter karena langsung mengambil data dari setter//
     
     public String getTipe(){
         return this.tipe;
     }
     public String getSuara(){
         return this.suara;
     }
     public  int getUsia(){
         return this.usia;
     }
}
