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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Sekolah sma = new Sekolah("SMA 01", "jl.KENANGA");
        Kelas k1= new Kelas("01");
        Kelas k2= new Kelas("02");
        Siswa s1= new Siswa("Irham", "1103134435","irhamf");
        Siswa s2= new Siswa("Fauzan", "1103134445","Fauzans");
        Siswa s3= new Siswa("Ike", "1103134436","bobo");
        Guru g1= new Guru("Maman", "111031341", "mamans");
        
        MaPel mtk= new MaPel("MTK");
        MaPel bio= new MaPel("BIO");
        MaPel ips= new MaPel("IPS");
        MaPel kma= new MaPel("KMA");
        MaPel fsk= new MaPel("FSK");
              
        sma.TambahKelas(k1);
        sma.TambahKelas(k2);
        sma.addGuru(g1);
        
        k1.ViewSiswa();
        
        s1.addMapel(kma);
        s1.addMapel(mtk);
        s1.addMapel(bio);
        s1.addMapel(ips);
        s1.addMapel(fsk);
        
        s2.addMapel(kma);
        s2.addMapel(mtk);
        s2.addMapel(bio);
        s2.addMapel(ips);
        s2.addMapel(fsk);
        
        s3.addMapel(kma);
        s3.addMapel(mtk);
        s3.addMapel(bio);
        s3.addMapel(ips);
        s3.addMapel(fsk);
        
        k1.addSiswa(s2);
        k1.addSiswa(s1);
        k1.addSiswa(s3);
        
        g1.InputNilaiSIswaKuis(s1, "KMA", 50);
        g1.InputNilaiSIswaTugas(s1, "KMA", 50);
        g1.InputNilaiSIswaUas(s1, "KMA", 50);
        g1.InputNilaiSIswaUts(s1, "KMA", 0);
        
        g1.InputNilaiSIswaKuis(s1, "BIO", 0);
        g1.InputNilaiSIswaTugas(s1, "BIO", 0);
        g1.InputNilaiSIswaUas(s1, "BIO", 50);
        g1.InputNilaiSIswaUts(s1, "BIO", 40);

        g1.InputNilaiSIswaKuis(s2, "KMA", 100);
        g1.InputNilaiSIswaTugas(s2, "KMA", 90);
        g1.InputNilaiSIswaUas(s2, "KMA", 80);
        g1.InputNilaiSIswaUts(s2, "KMA", 88);
        
        g1.InputNilaiSIswaKuis(s2, "BIO", 100);
        g1.InputNilaiSIswaTugas(s2, "BIO", 90);
        g1.InputNilaiSIswaUas(s2, "BIO", 80);
        g1.InputNilaiSIswaUts(s2, "BIO", 88);
        
       
        g1.InputNilaiSIswaKuis(s3, "KMA", 100);
        g1.InputNilaiSIswaTugas(s3, "KMA", 100);
        g1.InputNilaiSIswaUas(s3, "KMA", 100);
        g1.InputNilaiSIswaUts(s3, "KMA", 100);
        
        g1.InputNilaiSIswaKuis(s3, "BIO", 100);
        g1.InputNilaiSIswaTugas(s3, "BIO", 100);
        g1.InputNilaiSIswaUas(s3, "BIO", 100);
        g1.InputNilaiSIswaUts(s3, "BIO", 100);
        
        
        s1.HitungNilaiTotal();
        s2.HitungNilaiTotal();
        s3.HitungNilaiTotal();
        
        System.out.println("Nilai TOtal: "+s2.getNilaiTotal());
        

        k1.viewRangking();
        
        s1.ViewMapel();
        s1.Delete(mtk);
        s1.ViewMapel();*/
        Sekolah s = new Sekolah("SMA 1","Bojongsoang");
        Login l= new Login();
        l.setVisible(true);
    }
    
}
