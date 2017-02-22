/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IMAN_IT
 */
import java.util.Scanner;

public class EntryBukuAlamat {
    private static int pilih;
    public static void main(String [] args) {
        BukuAlamat entry = new BukuAlamat();
        Scanner in = new Scanner(System.in);
        while (pilih != 5) {
            System.out.println("MENU BUKU ALAMAT");
            System.out.println("");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. View All Data");
            System.out.println("5. Keluar");
            System.out.println("");
            System.out.print("Choice : ");
            pilih = in.nextInt();
            //System.out.println("");
        
            switch (pilih) {
                case 1 :
                    entry.insert();
                    break;
                case 2 :
                    entry.update();
                    break;
                case 3 :
                    entry.delete();
                    break;
                case 4 :
                    entry.viewAll();
                    break;
                case 5 :
                    entry.keluar();
                    break;
            }
        }    
    }
}
