/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEAM_5_PENGELOLA_NILAI_AKADEMIK;

import java.util.Scanner;

/**
 *
 * @author Irhamfauzan
 */
public class Sekolah {
    private String nama;
    private String alamat;
    private Siswa siswa[]= new Siswa[30];
    private Kelas kls[]= new Kelas[6];
    private Guru guru[]= new Guru[30];
    private int nKelas;
    private int nGuru;
    private int nSiswa;

    public Sekolah(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void TambahKelas(Kelas k){
        if(nKelas<6){
            this.kls[nKelas]= k;
            nKelas++;
        }
    }
    public void addGuru(Guru g){
        if(nGuru<30){
            this.guru[nGuru]=g;
            nGuru++;
        }
    }
    public void viewKelas(){
        for(int i=0; i<nKelas; i++){
            System.out.println(kls[i].getKodekelas());
        }
    }
    public void viewGuru(){
        for(int i=0; i<nGuru; i++){
            System.out.println(guru[i].getNama());
        }
    }
    public Siswa cariSiswa(String nis){
        boolean status= false;
        Siswa s= new Siswa();
        for(int i=0; i<nSiswa; i++){
            if(siswa[i].getNis().equals(nis)){
                status= true;
                s= siswa[i];
            }
        }
        return s;
    }
    public Guru cariSekolah(String nip){
        boolean status= false;
        for(int i=0; i<nGuru; i++){
            if(guru[i].getNip().equals(nip)){
                status= true;
            }
        }
        return null;
    }
    private int jumlahSiswa(){
        int tmp=0;
        for (int i= 0; i<nKelas; i++){
            tmp= tmp+kls[i].getNsiswa();
        }
        return tmp;
    }
    /*public void menuSekolah(){
        int pils;
        Scanner s= new Scanner(System.in);
        do{System.out.println("-----Menu Sekolah-----"); 
                System.out.println("\n0. Back ");
                System.out.println("\n1. Buat Sekolah ");
                System.out.println("\n2. Add Guru ");
                System.out.println("\n3. Add Siswa");
                System.out.println("\n4. View Guru");
                System.out.println("\n5. View Siswa");
                System.out.println("\n6. View Alamat");
                System.out.println("\n Pilihan : ");
                pils=s.nextInt();
                switch(pils){
                    case 1 : 
                }
        }while(pils!=0);
     }*/
    
}
