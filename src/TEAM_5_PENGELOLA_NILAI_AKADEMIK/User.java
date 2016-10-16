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
public abstract class User {
    private String nama;
    private String idUser;
    private String pass;

    public User(){
        
    }
    public User(String nama, String id, String pass) {
        this.nama = nama;
        this.idUser=id;
        this.pass=pass;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getIdUser(){
        return idUser;
    }
    public String getPass(){
        return pass;
    }
    
    @Override
    public String toString(){
        return "Nama: "+nama;
    }
    
    public abstract String Biodata();
}

