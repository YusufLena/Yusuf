package datalaundry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLaundry {
 public static void main(String[] args) {
   List<datalaundrybaru> daftarlaundry = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Daftar Laundry  (y/n): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Nama barang: ");
            String namabarang = input.nextLine();
            
            System.out.print("Jenis Layanan: ");
            String jenislayanan = input.nextLine();
            
            System.out.print("Jumlah Barang/Berat Barang: ");
            String  jumlahbarang = input.nextLine();
            
            System.out.print("Harga: ");
            int harga = input.nextInt();
            input.nextLine();
            
            
           datalaundrybaru laundry = new datalaundrybaru(nama, namabarang, jenislayanan, jumlahbarang, harga);
            daftarlaundry.add(laundry);
        }
        System.out.println("Daftar Pesanan Laundry:");
        for (datalaundrybaru laundry : daftarlaundry){
            System.out.println(laundry);
           
        }
    }
}
