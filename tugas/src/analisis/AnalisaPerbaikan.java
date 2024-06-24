/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

import java.util.ArrayList;

public class AnalisaPerbaikan extends Analisa {
    
    String noAnalisaPerbaikan;
    int analisaME;
    int analisaPK;
    ArrayList<String> noAnalisaArray = new ArrayList<>();

    // Overload Constructors
    public AnalisaPerbaikan() {}

    public AnalisaPerbaikan(String noAnalisaPerbaikan) {
        this.noAnalisaPerbaikan = noAnalisaPerbaikan;
    }

    public AnalisaPerbaikan(String noAnalisaPerbaikan, int analisaME) {
        this.noAnalisaPerbaikan = noAnalisaPerbaikan;
        this.analisaME = analisaME;
    }

    public AnalisaPerbaikan(String noAnalisaPerbaikan, int analisaME, int analisaPK) {
        this.noAnalisaPerbaikan = noAnalisaPerbaikan;
        this.analisaME = analisaME;
        this.analisaPK = analisaPK;
    }

    public AnalisaPerbaikan(String noAnalisaPerbaikan, int analisaME, int analisaPK, String noAnalisa, String dasarAnalisa, 
                            int beratBadan, int pertambahanBB, int analisaEnergi, int analisaProtein, int analisaLemak, 
                            int analisaSerat, int analisaKalsium, int analisaFosfor, int analisaLisin, int analisaMethionin, 
                            int analisaSistin, String noFormulasi) {
        super(noAnalisa, dasarAnalisa, beratBadan, pertambahanBB, analisaEnergi, analisaProtein, analisaLemak, analisaSerat, 
              analisaKalsium, analisaFosfor, analisaLisin, analisaMethionin, analisaSistin, noFormulasi);
        this.noAnalisaPerbaikan = noAnalisaPerbaikan;
        this.analisaME = analisaME;
        this.analisaPK = analisaPK;
    }

    // Getter and Setter methods
    public String getNoAnalisaPerbaikan() {
        return noAnalisaPerbaikan;
    }

    public void setNoAnalisaPerbaikan(String noAnalisaPerbaikan) {
        this.noAnalisaPerbaikan = noAnalisaPerbaikan;
    }

    public int getAnalisaME() {
        return analisaME;
    }

    public void setAnalisaME(int analisaME) {
        this.analisaME = analisaME;
    }

    public int getAnalisaPK() {
        return analisaPK;
    }

    public void setAnalisaPK(int analisaPK) {
        this.analisaPK = analisaPK;
    }

    public ArrayList<String> getNoAnalisaArray() {
        return noAnalisaArray;
    }

    public void isiNoAnalisa(String noAnalisa) {
        noAnalisaArray.add(noAnalisa);
    }
}