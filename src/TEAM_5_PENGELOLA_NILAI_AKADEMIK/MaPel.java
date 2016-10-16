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
public class MaPel implements Delete{
    private String nmMapel;
    private Nilai nilai = new Nilai();
    
    
    public MaPel(String nmMapel) {
        this.nmMapel = nmMapel;
    }
    public void NilaiTugas(double nilai){
        this.nilai.setNilaiTugas(nilai);
    }
    public void NilaiKuis(double nilai){
        this.nilai.setNilaiKuis(nilai);
    }
    public void NilaiUts(double nilai){
        this.nilai.setNilaiUts(nilai);
    }
    public void NilaiUas(double nilai){
        this.nilai.setNilaiUas(nilai);
    }
    public String getNmMapel() {
        return nmMapel;
    }
    public void setNmMapel(String nmMapel) {
        this.nmMapel = nmMapel;
    }
    public double getNilaiAkhir(){
        nilai.setNilaiAkhir();
        return nilai.getNilaiAkhir();
    }

    public Nilai getNilai() {
        return nilai;
    }

    public void Delete(String del) {
        if(del.equals("UAS")){
            nilai.setNilaiUas(0);
        }
        else if(del.equals("UTS")){
            nilai.setNilaiUts(0);
        }
        else if(del.equals("TUGAS")){
            nilai.setNilaiTugas(0);
        }
        else if(del.equals("KUIS")){
            nilai.setNilaiTugas(0);
        }
    }

    @Override
    public void Delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
