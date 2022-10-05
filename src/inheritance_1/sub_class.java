package inheritance_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class sub_class extends super_class {

    //atribut tinggi 
    private int tinggi;

    public sub_class(String nama, String keterangan, int tinggi) {
        super(nama, keterangan);
        this.tinggi = tinggi;
    }
    
    //Getter
    public int getTinggi() {
        return tinggi;
    }

    //custom method
    public void datalengkap() {
        System.out.println(super.getNama() + " " + super.getKeterangan() + " " + getTinggi());
    }

    @Override
    public void cetak() {
        super.cetak();
    }

    @Override
    public void halo() {
        super.halo();
    }

}
