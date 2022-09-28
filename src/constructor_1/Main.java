/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor_1;

import java.io.*;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // OBJECT 
        //karena ada 2 constructor, maka dibuat 2 object 
        //1.Admin
        //2,Akun Baru
        Akun admin = new Akun();
        Akun akunbaru = new Akun("", "");

        //Variabel 
        String username, password;
        //menu
        do {
            System.out.println("---Login----");
            System.out.println("1. Login admin");
            System.out.println("2. Buat Akun baru");
            System.out.println("3. Lihat Akun ");
            System.out.println("4. Ubah Password");
            System.out.println("5. Keluar");
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("---Login Admin---");
                    System.out.println("Masukkan Username");
                    username = br.readLine();
                    System.out.println("masukkan passsword");
                    password = br.readLine();

                    //mencocokkan username dan password
                    if (username.equalsIgnoreCase(admin.getUsername()) && password.equals(admin.getPassword())) {
                    }else{
                    System.out.println("Gagal");
                    }
   
                    break;
                case 2:
                    System.out.println("--Buat Akun ----");
                    System.out.println("Masukkan Username");
                    username = br.readLine();
                    System.out.println("masukkan passsword");
                    password = br.readLine();

                    //memasukkan variabel ke dalam cunstroctor
                    akunbaru = new Akun(username, password);
                    break;
                case 3:
                    System.out.println("--lihat Akun---");
                    System.out.println("1. Admin ");
                    System.out.println("Username :" + admin.getUsername());
                    System.out.println("Password :" + admin.getPassword());
                    System.out.println("");
                    System.out.println("2. Akun Baru");
                    System.out.println("Username :" + akunbaru.getUsername());
                    System.out.println("Password :" + akunbaru.getPassword() + "\n");
                    break;
                case 4:
                    System.out.println("--Ubah Password---");
                    
                    // masukkan pass lama
                    System.out.println("Masukkan Password Lama : ");
                    password = br.readLine();
                    
                    if (password.equalsIgnoreCase(akunbaru.getPassword())){
                        System.out.println("Masukkan Pssword baru ");
                        akunbaru.setPassword(br.readLine());
                    }else{
                    System.out.println("Gagal");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
