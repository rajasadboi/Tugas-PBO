/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

/**
 *
 * @author Asus
 */
public class Analisa {
    String noAnalisa, dasarAnalisa, noFormulasi;
    int beratBadan, pertambahanBB, analisaEnergi, analisaProtein, analisaLemak, analisaSerat,
        analisaKalsium, analisaFosfor, analisaLisin, analisaMethionin, analisaSistin;
    
    /*  
    method : rangkaian kode program utnuk menjalankan perintah dan digunakan lebih
            1 kali
    
    sifatnya
    
    procuder : tidak ada nilai pengembalian, hanya menangkap data, datanya tidak 
                di berikan
    function : ada nilai pengembalian
    
    ciri khas method procuder => void
    ciri khas method function => tipe variabel
    */

    // Overload Constructors
    public Analisa() {}

    public Analisa(String noAnalisa) {
        this.noAnalisa = noAnalisa;
    }

    public Analisa(String noAnalisa, String dasarAnalisa) {
        this.noAnalisa = noAnalisa;
        this.dasarAnalisa = dasarAnalisa;
    }

    public Analisa(String noAnalisa, String dasarAnalisa, int beratBadan) {
        this.noAnalisa = noAnalisa;
        this.dasarAnalisa = dasarAnalisa;
        this.beratBadan = beratBadan;
    }

    public Analisa(String noAnalisa, String dasarAnalisa, int beratBadan, int pertambahanBB) {
        this.noAnalisa = noAnalisa;
        this.dasarAnalisa = dasarAnalisa;
        this.beratBadan = beratBadan;
        this.pertambahanBB = pertambahanBB;
    }

    public Analisa(String noAnalisa, String dasarAnalisa, int beratBadan, int pertambahanBB, int analisaEnergi) {
        this.noAnalisa = noAnalisa;
        this.dasarAnalisa = dasarAnalisa;
        this.beratBadan = beratBadan;
        this.pertambahanBB = pertambahanBB;
        this.analisaEnergi = analisaEnergi;
    }

    public Analisa(String noAnalisa, String dasarAnalisa, int beratBadan, int pertambahanBB, int analisaEnergi,
                   int analisaProtein, int analisaLemak, int analisaSerat, int analisaKalsium, int analisaFosfor,
                   int analisaLisin, int analisaMethionin, int analisaSistin, String noFormulasi) {
        this.noAnalisa = noAnalisa;
        this.dasarAnalisa = dasarAnalisa;
        this.beratBadan = beratBadan;
        this.pertambahanBB = pertambahanBB;
        this.analisaEnergi = analisaEnergi;
        this.analisaProtein = analisaProtein;
        this.analisaLemak = analisaLemak;
        this.analisaSerat = analisaSerat;
        this.analisaKalsium = analisaKalsium;
        this.analisaFosfor = analisaFosfor;
        this.analisaLisin = analisaLisin;
        this.analisaMethionin = analisaMethionin;
        this.analisaSistin = analisaSistin;
        this.noFormulasi = noFormulasi;
    }

    // Getter and Setter methods
    public String getNoAnalisa() {
        return noAnalisa;
    }

    public void setNoAnalisa(String noAnalisa) {
        this.noAnalisa = noAnalisa;
    }

    public String getDasarAnalisa() {
        return dasarAnalisa;
    }

    public void setDasarAnalisa(String dasarAnalisa) {
        this.dasarAnalisa = dasarAnalisa;
    }

    public int getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(int beratBadan) {
        this.beratBadan = beratBadan;
    }

    public int getPertambahanBB() {
        return pertambahanBB;
    }

    public void setPertambahanBB(int pertambahanBB) {
        this.pertambahanBB = pertambahanBB;
    }

    public int getAnalisaEnergi() {
        return analisaEnergi;
    }

    public void setAnalisaEnergi(int analisaEnergi) {
        this.analisaEnergi = analisaEnergi;
    }

    public int getAnalisaProtein() {
        return analisaProtein;
    }

    public void setAnalisaProtein(int analisaProtein) {
        this.analisaProtein = analisaProtein;
    }

    public int getAnalisaLemak() {
        return analisaLemak;
    }

    public void setAnalisaLemak(int analisaLemak) {
        this.analisaLemak = analisaLemak;
    }

    public int getAnalisaSerat() {
        return analisaSerat;
    }

    public void setAnalisaSerat(int analisaSerat) {
        this.analisaSerat = analisaSerat;
    }

    public int getAnalisaKalsium() {
        return analisaKalsium;
    }

    public void setAnalisaKalsium(int analisaKalsium) {
        this.analisaKalsium = analisaKalsium;
    }

    public int getAnalisaFosfor() {
        return analisaFosfor;
    }

    public void setAnalisaFosfor(int analisaFosfor) {
        this.analisaFosfor = analisaFosfor;
    }

    public int getAnalisaLisin() {
        return analisaLisin;
    }

    public void setAnalisaLisin(int analisaLisin) {
        this.analisaLisin = analisaLisin;
    }

    public int getAnalisaMethionin() {
        return analisaMethionin;
    }

    public void setAnalisaMethionin(int analisaMethionin) {
        this.analisaMethionin = analisaMethionin;
    }

    public int getAnalisaSistin() {
        return analisaSistin;
    }

    public void setAnalisaSistin(int analisaSistin) {
        this.analisaSistin = analisaSistin;
    }

    public String getNoFormulasi() {
        return noFormulasi;
    }

    public void setNoFormulasi(String noFormulasi) {
        this.noFormulasi = noFormulasi;
    }
}