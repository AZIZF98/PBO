/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance_2;

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

        //object : Employee
        //sub_Employee emp[] = new sub_Employee[2];

        //deklrasi variabel 
        String id, name, addres, departement, tittle;
        

        try {
            
            //jumlah array ditentukan oleh user
            //1.entry jumlah array
            System.out.println("Masukkan jumlah data :");
            int jumlah = Integer.parseInt(br.readLine());
            
            //2. buat object\
            sub_Employee emp[] = new sub_Employee[jumlah];
            
            for (int i = 0; i < emp.length; i++) {
                System.out.print("Entry ID : ");
                id = br.readLine();
                System.out.print("Entry Name : ");
                name = br.readLine();
                System.out.print("Entry addres : ");
                addres = br.readLine();
                System.out.print("Entry tittle : ");
                tittle = br.readLine();
                
                System.out.println("");

                //masukkan object
                emp[i] = new sub_Employee(id, name, addres, null, tittle);
            }

            //output
            for (int i = 0; i < emp.length; i++) {
                emp[i].data();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
