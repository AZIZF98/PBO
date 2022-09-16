/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M2;

/**
 *
 * @author LENOVO
 */
public class Karyawan {
    private String nik,bagian;
    private int kehadiran, gaji_per_hari, totalGaji;
    
    
/////////////////////////////////////////////////////
    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public void setGaji_per_hari(int gaji_per_hari) {
        this.gaji_per_hari = gaji_per_hari;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    
/////////////////////////////////////////////////////
    public String getNik() {
        return nik;
    }

    public String getBagian() {
        return bagian;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public int getGaji_per_hari() {
        return gaji_per_hari;
    }

    public int getTotalGaji() {
        return totalGaji;
    }
    
    public int getGaji() {
        int Gaji = getKehadiran() * getGaji_per_hari();
        return Gaji;
    }
}