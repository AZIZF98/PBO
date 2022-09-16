/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_M2;
import java.io.*;
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Undika orang = new Undika();
        Mahasiswa A = new Mahasiswa();
        Karyawan B = new Karyawan();
        
        try{
            do{
                System.out.println("---MENU UNDIKA---");
                System.out.println("1.Cek SPP Mahasiswa");
                System.out.println("2.Cek Gaji Karyawan");
                System.out.println("3.Keluar Aplikasi");
                int pilih = Integer.parseInt(br.readLine());
                
               switch (pilih){
                   case 1 :
                       System.out.println("=======INPUT========");
                       System.out.println("Masukkan Nama anda:");
                       orang.setNama(br.readLine());
                       System.out.println("Masukkan Alamat:");
                       orang.setAlamat(br.readLine());
                       System.out.println("Masukkan NIM:");
                       A.setNim(br.readLine());
                       System.out.println("Masukkan Prodi");
                       A.setProdi(br.readLine());
                       System.out.println("Masukkan Angkatan:");
                       A.setAngkatan(Integer.parseInt(br.readLine()));
                       System.out.println("Semester:");
                       A.setSemester(Integer.parseInt(br.readLine()));
                       
                       
                       System.out.println("=======PRINT========");
                       System.out.println("Nama     :"+orang.getNama());
                       System.out.println("Alamat   :"+orang.getAlamat());
                       System.out.println("NIM      :"+A.getNim());
                       System.out.println("Prodi    :"+A.getProdi());
                       System.out.println("Angkatan :"+A.getAngkatan());
                       System.out.println("Semester :"+A.getSemester());
                       System.out.println("Bayar SPP:"+A.getSPP());
                   break;
                   case 2 :
                       System.out.println("Masukkan Nama anda");
                       orang.setNama(br.readLine());
                       System.out.println("Masukkan Alamat :");
                       orang.setAlamat(br.readLine());
                       System.out.println("Masukkan NIK:");
                       B.setNik(br.readLine());
                       System.out.println("Masukkan Bagian:");
                       B.setBagian(br.readLine());
                       System.out.println("Jumlah kehadiran:");
                       B.setKehadiran(Integer.parseInt(br.readLine()));
                       System.out.println("Gaji per Hari:");
                       B.setGaji_per_hari(Integer.parseInt(br.readLine()));
                       
                       
                       System.out.println("=======PRINT========");
                       System.out.println("Nama         :"+orang.getNama());
                       System.out.println("Alamat       :"+orang.getAlamat());
                       System.out.println("NIK          :"+B.getNik());
                       System.out.println("Bagian       :"+B.getBagian());
                       System.out.println("Kehadiran    :"+B.getKehadiran());
                       System.out.println("Gaji Per hari:"+B.getGaji_per_hari());
                       System.out.println("Total Gaji   :"+B.getGaji());
                   break;
                   case 3 :
                       System.exit(0);
                   break;
               }
            }while(true);
        }catch(Exception e){
            System.out.println("Inputan yang anda masukan salah");
    }
    }
}
