/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance_1;

import java.io.*;

/**
 *
 * @author LENOVO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //object :sub classs
        sub_class sub = new sub_class("", "", 0);

        try {
            //input data
            System.out.println("Isi Nama");
            String n = br.readLine();
            System.out.println("Isi Keterangan");
            String k = br.readLine();
            System.out.println("Isi Tinggi");
            int t = Integer.parseInt(br.readLine());
            sub.datalengkap();

            //masukkan variabel ke dalam parameter object
            sub = new sub_class(n, k, t);

            //Mengambil data lengkap
            sub.datalengkap();
            // 
            //panggil method cetak dan halo
            sub.cetak();
            sub.halo();

        } catch (Exception e) {
            System.out.println("e");

        }

    }
}
