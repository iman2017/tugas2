
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IMAN_IT
 */
public class BukuAlamat {
    String Nama;
    String Alamat;
    String NoTelepon;
    String eMail;
    String [] hasil;
    int masuk;
    
    public BukuAlamat() {
    }

    public BukuAlamat(String Nama, String Alamat, String NoTelepon, String eMail) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.NoTelepon = NoTelepon;
        this.eMail = eMail;
        this.masuk = 0;
    }

    public void setMasuk(int masuk) {
        this.masuk = masuk;
    }
    
    //SETTER
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setNoTelepon(String NoTelepon) {
        this.NoTelepon = NoTelepon;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    //GETTER
    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNoTelepon() {
        return NoTelepon;
    }

    public String geteMail() {
        return eMail;
    }
    
    public void insert() {
        int i = 1;
        String a = "Y";
        hasil = new String[10];
        Scanner in = new Scanner(System.in);
        while (!"T".equals(a)) {
            System.out.println("MENU INPUT DATA");
            System.out.print("Nama : ");
            this.setNama(in.next());
            System.out.print("Alamat : ");
            this.setAlamat(in.next());
            System.out.print("No Telepon : ");
            this.setNoTelepon(in.next());
            System.out.print("e-mail : ");
            this.seteMail(in.next());
            System.out.println("");
            System.out.print("Masukkan lagi? (Y/T) ");
            a = in.next();
            masuk = i-1;
            this.simpan(masuk);
            //hasil[i] = this.getNama()+","+this.getAlamat()+","+this.getNoTelepon()+","+this.geteMail();
            i++;
            System.out.println("");
        }
        this.simpan(masuk);
    }
    public void simpan(int masuk) {
        hasil[masuk] = this.getNama()+","+this.getAlamat()+","+this.getNoTelepon()+","+this.geteMail();
        //for (int aa = 0; aa <= masuk; aa++) {
        //    System.out.println(aa+". "+ hasil[aa]);
        //}
    }
    public void update() {
        System.out.println("Update Data Sob");
    }
    public void delete() {
        System.out.println("Delete Data Temans");
    }
    public void viewAll() {
        if (masuk==0) {
            System.out.println("");
            System.out.println("Belum ada data yg di input");
            System.out.println("Silahkan pilih 1, untuk input data");
            this.keluar();
        } else {
        System.out.println("No, Nama, Alamat, No. Telepon, eMail");
        int a = 1;
        for (int bb = 0; bb <= masuk; bb++) {
            System.out.println(a+". "+ hasil[bb]);
            a++;
        }
        System.out.println("");
        }
    }
    public void keluar() {
        System.out.println("TERIMA KASIH");
        System.out.println("");
    }
}
