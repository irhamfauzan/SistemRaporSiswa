/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEAM_5_PENGELOLA_NILAI_AKADEMIK;

/**
 *
 * @author Irhamfauzan
 */
public class Kelas {
    private String kodekelas;
    private int nSiswa;
    private Siswa siswa[]= new Siswa[30];

    public Kelas(String kodekelas) {
        this.kodekelas = kodekelas;
    }
    public String getKodekelas() {
        return kodekelas;
    }
    public void setKodekelas(String kodekelas) {
        this.kodekelas = kodekelas;
    }
    public void addSiswa(Siswa s){
        if(nSiswa<30){
            this.siswa[nSiswa]= s;
            nSiswa++;
        }
    }
    public int getNsiswa(){
        return nSiswa;
    }
    public void ViewSiswa(){
      for(int i=0; i<nSiswa; i++){
            System.out.println(siswa[i].getNama()+ siswa[i].getNis());
        }
    }
    public void viewRangking(){
        Siswa tmp;
        int x = 0;
        for (int i=0; i<nSiswa;i++){
            Siswa tmps=siswa[i];
            for(int j=i+1; j<nSiswa;j++){
                if(tmps.getNilaiTotal()<siswa[j].getNilaiTotal()){
                    x=j;
                    tmps=siswa[j];   
                }
            }
            tmp=siswa[x];
            siswa[x]=siswa[i];
            siswa[i]=tmp;
        }
        for(int i=0; i<nSiswa;i++){
            System.out.println(i+". "+siswa[i].getNama()+ " Nilai: "+siswa[i].getNilaiTotal());
        }
    }
}
