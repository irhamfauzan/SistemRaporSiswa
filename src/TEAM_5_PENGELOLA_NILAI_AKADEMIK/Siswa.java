/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEAM_5_PENGELOLA_NILAI_AKADEMIK;

import javafx.beans.binding.Bindings;

/**
 *
 * @author Irhamfauzan
 */
public class Siswa extends User{
    private String Nis;
    private Nilai nilai = new Nilai();
    private MaPel mapel[]= new MaPel[5];
    private int nMapel=0;
    private String jurusan;
    private double NilaiTotal;

    public Siswa(){
        
    }
    
    public Siswa(String nama, String nis, String pass) {
        super(nama, nis, pass);
    }

    public void addMapel(MaPel nmMapel){
        if(nMapel< 5){
            this.mapel[nMapel]= new MaPel(nmMapel.getNmMapel());
            nMapel++;
        }
    }

    public void HitungNilaiTotal(){
        String m = null;
        double total =0;
            for(int i=0; i<nMapel; i++){
               // if (mapel[i].getNmMapel().equals(m)){
                    mapel[i].getNilai().setNilaiAkhir();
                    total =total+ mapel[i].getNilaiAkhir();
                //}
            }
            NilaiTotal=total;
        }    
    
    public double getNilaiTotal(){
        return NilaiTotal;
    }
       
    public String getNis(){
        return super.getIdUser();
    }
    
    public void setNis(String nis){
        this.Nis=nis;
    }
    public int getNmapel(){
        return nMapel;
    }
    
    public void ViewMapel(){
        for(int i=0; i<nMapel; i++){
            System.out.println(mapel[i].getNmMapel());
        }
    } 
    public MaPel getMapel(String m){
        MaPel mp=null;
        for(int i=0; i<nMapel; i++){
            if(mapel[i].getNmMapel().equals(m)){
                mp=mapel[i];
                break;
            }
        }
        return mp;
    }
    @Override
    public String Biodata() {
        return (super.toString()+ "\n NIS: "+getNis());
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void Delete(MaPel m){
        for(int i=0; i<mapel.length;i++){
            if(mapel[i].getNmMapel().equals(m.getNmMapel())){
                mapel[i].Delete();
                nMapel--;
            }
        }
    }
}
