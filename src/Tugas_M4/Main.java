package Tugas_M4;
import java.io.*;

import java.io.IOException;

public class Main{

   
    public static void main(String[] args) throws IOException {
        BufferedReader h = new BufferedReader(new InputStreamReader(System.in));
        String lagi, tglkem = "";
        int total = 0;
        
        try{
            do{
         System.out.println("Pemesanan Tiket");
                System.out.print("Masukkan jumlah penumpang : ");
                int jml = Integer.parseInt(h.readLine());
                System.out.print("Kota Asal : ");
                String asal = h.readLine();
                System.out.println("Pilih rute tujuan");
                System.out.println("Bali, Lombok, Surabaya, Yogyakarta, Balikpapan, Makassar, Jakarta");
                System.out.print("Tujuan : ");
                String tujuan = h.readLine();
                System.out.print("Isi tanggal berangkat : ");
                String tglber = h.readLine();
                System.out.print("Pesan pulang pergi (Ya/No) : ");
                String pp = h.readLine();
                if (pp.equalsIgnoreCase("Ya")) {
                    System.out.print("Tanggal Kembali: ");
                    tglkem = h.readLine();
                    }
                System.out.println("-- Pilih Maskapai --");
                System.out.println("1. Lion Air 2. Citilink");
                System.out.print("Pilih maskapai : ");
                int tipe = Integer.parseInt(h.readLine());
                        
                switch (tipe){
                    case 1:
                        Lion_air pesawat1[] = new Lion_air[jml];
                        System.out.println("-- Selamat Datang di Maskapai Lion Air --");
                        for(int p = 0; p<pesawat1.length;p++){
                            System.out.println("Silahkan isi data penumpang");
                            System.out.print("Booking ID : ");
                            String bookingID = h.readLine();
                            System.out.print("NIK : ");
                            String nik = h.readLine();
                            System.out.print("Nama : ");
                            String nama = h.readLine();
                            System.out.print("Jenis Kelamin (P/L) : ");
                            String jkel = h.readLine();
                            System.out.print("No Pesawat : ");
                            String nopes = h.readLine();
                            System.out.print("No Kursi : ");
                            String nokur = h.readLine();
                            pesawat1[p] = new Lion_air(bookingID,nik,nama ,jkel,tglber,tglkem,asal,tujuan,nopes,nokur,jml);
                            System.out.println("");
                        }
                        for (int p=0; p<pesawat1.length; ++p) {
                            System.out.println("-- Preview Tiket Lion Air --");
                            System.out.println("");
                            System.out.println("Booking ID : " + pesawat1[p].getBookingID());
                            System.out.println("NIK : " + pesawat1[p].getNik());
                            System.out.println("Nama : " + pesawat1[p].getNama());
                            System.out.println("Kota Asal : " + pesawat1[p].getKotaasal());
                            System.out.println("Kota Tujuan : " + pesawat1[p].getKotatujuan());
                            System.out.println("Tanggal Berangkat : " + pesawat1[p].getTglberangkat());
                            System.out.println("Tanggal Kembali : " + pesawat1[p].getTglkembali());
                            System.out.println("Nomor Pesawat : " + pesawat1[p].getNopesawat());
                            System.out.println("Nomor Kursi : " + pesawat1[p].getNokursi());
                            System.out.println("Harga Tiket : " + pesawat1[p].getHarga());
                            total = pesawat1[p].getTotal();
                        }
                        System.out.println("Total : " + total);
                    break;                       
                    case 2:
                        Citilink pesawat2[]= new Citilink[jml]; 
                        System.out.println("-- Selamat Datang di Maskapai Lion Air --");
                        for(int p = 0; p<pesawat2.length;p++){
                            System.out.println("Silahkan isi data penumpang");
                            System.out.print("Booking ID : ");
                            String bookingID = h.readLine();
                            System.out.print("NIK : ");
                            String nik = h.readLine();
                            System.out.print("Nama : ");
                            String nama = h.readLine();
                            System.out.print("Jenis Kelamin (P/L) : ");
                            String jeniskel = h.readLine();
                            System.out.print("No Pesawat : ");
                            String nopes = h.readLine();
                            System.out.print("No Kursi : ");
                            String nokur = h.readLine();
                            pesawat2[p] = new Citilink(bookingID,nik,nama,jeniskel,tglber,tglkem,asal,tujuan,nopes,nokur,jml);
                            System.out.println("");
                        }
                        for (int p=0; p<pesawat2.length; ++p) {
                            System.out.println("-- Preview Tiket Lion Air --");
                            System.out.println("");
                            System.out.println("Booking ID : " + pesawat2[p].getBookingID());
                            System.out.println("NIK : " + pesawat2[p].getNik());
                            System.out.println("Nama : " + pesawat2[p].getNama());
                            System.out.println("Kota Asal : " + pesawat2[p].getKotaasal());
                            System.out.println("Kota Tujuan : " + pesawat2[p].getKotatujuan());
                            System.out.println("Tanggal Berangkat : " + pesawat2[p].getTglberangkat());
                            System.out.println("Tanggal Kembali : " + pesawat2[p].getTglkembali());
                            System.out.println("Nomor Pesawat : " + pesawat2[p].getNopesawat());
                            System.out.println("Nomor Kursi : " + pesawat2[p].getNokursi());
                            System.out.println("Harga Tiket : " + pesawat2[p].getHarga());
                            total = pesawat2[p].getTotal();
                        }
                        System.out.println("Total : " + total);
                    break;
                }
                System.out.print("\nPesan Lagi (Ya/No): ");
                lagi = h.readLine();
            }while(lagi.equalsIgnoreCase("y"));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
        