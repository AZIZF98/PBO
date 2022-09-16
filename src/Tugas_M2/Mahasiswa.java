/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M2;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {

    private String nim, prodi;
    private int spp, angkatan, semester, bayar_spp_semester,getAngkatan;

    //SETTER
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
        if(17 < angkatan){spp = 15000000;
        }else{spp = 12000000;}
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setBayar_spp_semester(int bayar_spp_semester) {
        this.bayar_spp_semester = bayar_spp_semester;
    }

    //GETTER
    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public int getSpp() {
        return spp;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public int getSemester() {
        return semester;
    }

    public int getBayar_spp_semester() {
        return bayar_spp_semester;
    }
/////////////////////////////////////////
    public int getSPP() {
        int SPP = getSpp() * getSemester();
        return SPP;
    }
}
    
