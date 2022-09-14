/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_object_1;

/**
 *
 * @author LENOVO
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // untuk bisa mengakses kelas Hewan,Burung,Ikan perlu membuat objek(instance of class)
        
     //askes suara, tipe, dan usia dari class Hewan 
     Hewan burung= new Hewan();
     Hewan ikan  = new Hewan();
     
     //akses method dari class Burung dan Ikan
     Burung a = new Burung();
     Ikan i = new Ikan();
    
     //cara isi dari suara,tipe,dan usia
    burung.setTipe("Kakaktua");
    burung.setSuara("krakkk....krakkk");
    burung.setUsia(0);
    
    
    ikan.setTipe("Lumba lumba");
    ikan.setSuara("blupp...bluppp.bluppp");
    ikan.setUsia(0);
    
    //cara ambil dari setter (hewan,Ikan dan Burung)
        System.out.println("AKU "+ burung.getTipe()+ "Suaraku"+ burung.getSuara()+"Usai ku"+ burung.getUsia()) ;
        
        System.out.println("AKU "+ ikan.getTipe()+ "Suaraku"+ ikan.getSuara()+"Usai ku"+ ikan.getUsia());
    }
}
