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
public class Nilai{
    private double Tugas, Kuis, Uts, Uas, nilaiAkhir;

    public double getNilaiTugas() {
        return Tugas;
    }
    public void setNilaiTugas(double Tugas) {
        this.Tugas = Tugas;
    }
    public double getNilaiKuis() {
        return Kuis;
    }
    public void setNilaiKuis(double Kuis) {
        this.Kuis = Kuis;
    }
    public double getNilaiUts() {
        return Uts;
    }
    public void setNilaiUts(double Uts) {
        this.Uts = Uts;
    }
    public double getNilaiUas() {
        return Uas;
    }
    public void setNilaiUas(double Uas) {
        this.Uas = Uas;
    }
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
    public void setNilaiAkhir() {
        this.nilaiAkhir =((this.Kuis*0.25)+(this.Tugas*0.25)+(this.Uas*0.25)+(this.Uts*0.25));
    }

}
