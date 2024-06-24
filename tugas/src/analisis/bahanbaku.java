/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

/**
 *
 * @author Asus
 */
public class bahanbaku {
    
   public String KodeBB;
     String NamaBB;
     int hargaBB;
     int energi;
     int protein;
     int lemak;
     int serat;
     int kalsium;
     int fosfor;
     int lisin;
     int methionin;
     int sistin;
     int maxPenggunaan;
     
     // Constructors
    public bahanbaku() {}

    public bahanbaku(String KodeBB, String NamaBB, int hargaBB, int energi,
                   int protein, int lemak, int serat, int kalsium,
                   int fosfor, int lisin, int methionin, int sistin,
                   int maxPenggunaan) {
        this.KodeBB = KodeBB;
        this.NamaBB = NamaBB;
        this.hargaBB = hargaBB;
        this.energi = energi;
        this.protein = protein;
        this.lemak = lemak;
        this.serat = serat;
        this.kalsium = kalsium;
        this.fosfor = fosfor;
        this.lisin = lisin;
        this.methionin = methionin;
        this.sistin = sistin;
        this.maxPenggunaan = maxPenggunaan;
    }
    
    
    public String getKodeBB() {
        return KodeBB;
    }

    public void setKodeBB(String KodeBB) {
        this.KodeBB = KodeBB;
    }

    public String NamaBB() {
        return NamaBB;
    }

    public void setNamaBB(String NamaBB) {
        this.NamaBB = NamaBB;
    }

    public int gethargaBB() {
        return hargaBB;
    }

    public void sethargaBB(int hargaBB) {
        this.hargaBB = hargaBB;
    }

    public int getenergi() {
        return energi;
    }

    public void setenergi(int energi) {
        this.energi = energi;
    }

    public int getprotein() {
        return protein;
    }

    public void setprotein(int protein) {
        this.protein = protein;
    }

    public int getlemak() {
        return lemak;
    }

    public void setlemak(int lemak) {
        this.lemak = lemak;
    }

    public int getserat() {
        return serat;
    }

    public void setserat(int serat) {
        this.serat = serat;
    }

    public int getkalsium() {
        return kalsium;
    }

    public void setkalsium(int kalsium) {
        this.kalsium = kalsium;
    }

    public int getfosfor() {
        return fosfor;
    }

    public void setfosfor(int fosfor) {
        this.fosfor = fosfor;
    }

    public int getlisin() {
        return lisin;
    }

    public void setlisin(int lisin) {
        this.lisin = lisin;
    }

    public int getmethionin() {
        return methionin;
    }

    public void setmethionin(int methionin) {
        this.methionin = methionin;
    }

    public int getsistin() {
        return sistin;
    }

    public void setsistin(int sistin) {
        this.sistin = sistin;
    }

    public int getmaxPenggunaan() {
        return maxPenggunaan;
    }

    public void setmaxPenggunaan(int maxPenggunaan) {
        this.maxPenggunaan = maxPenggunaan;
    }
     
}
