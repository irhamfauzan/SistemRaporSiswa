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
public class Guru extends User{
    private String Nip;
    private Siswa s;
    public Guru(String nama,String Nip, String pass) {
        super(nama, Nip, pass);
    }
    public void InputNilaiSIswaKuis(Siswa nis,String mapel, double nilai){
        nis.getMapel(mapel).NilaiKuis(nilai);
    }
    public void InputNilaiSIswaUas(Siswa nis,String mapel, double nilai){
        nis.getMapel(mapel).NilaiUas(nilai);
    }
    public void InputNilaiSIswaUts(Siswa nis,String mapel, double nilai){
        nis.getMapel(mapel).NilaiUts(nilai);
    }
    public void InputNilaiSIswaTugas(Siswa nis,String mapel, double nilai){
        nis.getMapel(mapel).NilaiTugas(nilai);
    }
    public String getNip(){
        return super.getIdUser();
    }
    
    @Override
    public String Biodata() {
        return ("Nama: "+super.getNama()+ " NIP: "+getNip());
    }
}
