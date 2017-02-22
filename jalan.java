/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;

import java.util.Scanner;

/**
 *
 * @author IMAN_IT
 */
public class jalan {
    private static int pilih;
    //private static int a;
    public static void main(String [] args) {
        Mobil jalan1 = new Mobil(220, 0, 0);
        //Mobil jalan2 = new Mobil();
        Scanner in = new Scanner(System.in);
        while (!jalan1.isStarted()) {
            System.out.println("MENJALANKAN MOBIL");
            System.out.println("1. Start Mobil");
            System.out.println("2. Ganti Gigi");
            System.out.println("3. Gas Mobil");
            System.out.println("4. Rem Mobil");
            System.out.println("5. Stop Mobil");
            System.out.println("");
            System.out.print("Pilihan menu ");
            pilih = in.nextInt();
            //System.out.println("Kecepatan Mobil "+ jalan1.getKecActual());
            switch (pilih) {
                case 1 :
                    jalan1.start();
                    System.out.println("Kendaraan di starter");
                    System.out.println("");
                    break;
                case 2 :
                    System.out.print("Pilih Gigi ( 1 - 5 )");
                    int Gigi = in.nextInt();
                    System.out.println("Gigi : "+Gigi);
                    jalan1.gantiGigi(Gigi);
                    System.out.println("Percepatan :"+ jalan1.getPercepatan() +" km/jam^2");
                    System.out.println("");
                    break;
                case 3 :
                    jalan1.gas();
                    System.out.println("Kecepatan Kendaraan :"+ jalan1.getKecActual());
                    break;
                case 4 :
                    jalan1.rem();
                    System.out.println("Kecepatan Kendaraan :"+ jalan1.getKecActual());
                    break;
                case 5 :
                    jalan1.stop();
                    break;
            }   
        }
    }
}