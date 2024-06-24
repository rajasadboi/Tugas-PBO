/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

/**
 *
 * @author Asus
 */
    
public class perhitungan extends bahanbaku{
    
     String noformulasi;
     String kodeBB;
     int JumlahPenggunaan;
     
      // Constructors
     public perhitungan(){}
     

    public perhitungan(String noformulasi, String kodeBB, int JumlahPenggunaan, String KodeBB,
                            String NamaBB, int hargaBB, int energi, int protein,
                            int lemak, int serat, int kalsium, int fosfor,
                            int lisin, int methionin, int sistin, int maxPenggunaan) {
        this.noformulasi = noformulasi;
        this.kodeBB = kodeBB;
        this.JumlahPenggunaan = JumlahPenggunaan;
        this.setKodeBB(KodeBB);
        this.setNamaBB(NamaBB);
        this.sethargaBB(hargaBB);
        this.setenergi(energi);
        this.setprotein(protein);
        this.setlemak(lemak);
        this.setserat(serat);
        this.setkalsium(kalsium);
        this.setfosfor(fosfor);
        this.setlisin(lisin);
        this.setmethionin(methionin);
        this.setsistin(sistin);
        this.setmaxPenggunaan(maxPenggunaan);
    }
        public String getnoformulasi() {
        return noformulasi;
    }

    public void setnoformulasi(String noformulasi) {
        this.noformulasi = noformulasi;
    }

    public String getkodeBB() {
        return kodeBB;
    }

    public void setkodeBB(String kodeBB) {
        this.kodeBB = kodeBB;
    }

    public int getJumlahPenggunaan() {
        return JumlahPenggunaan;
    }

    public void setJumlahPenggunaan(int JumlahPenggunaan) {
        this.JumlahPenggunaan = JumlahPenggunaan;
    }
    
}
