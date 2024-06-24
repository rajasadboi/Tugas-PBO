/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;
import analisis.*;
import java.util.Scanner;
//import curd.*;
import crud.koneksi;
import gui.frameUtama;
/**
 *
 * @author Asus
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        new  frameUtama().setVisible(true);
        

        
//        DATA DAN BAHANBAKU & PERHITUNGAN
//                
//       Scanner input = new Scanner(System.in);
//
//        // Input data Bahan Baku
//        System.out.println("=== Input Data Bahan Baku ===");
//        System.out.print("Masukkan Kode Bahan Baku: ");
//        String kodeBB = input.nextLine();
//        System.out.print("Masukkan Nama Bahan Baku: ");
//        String namaBB = input.nextLine();
//        System.out.print("Masukkan Harga Bahan Baku: ");
//        int hargaBB = input.nextInt();
//        System.out.print("Masukkan Energi: ");
//        int energi = input.nextInt();
//        System.out.print("Masukkan Protein: ");
//        int protein = input.nextInt();
//        System.out.print("Masukkan Lemak: ");
//        int lemak = input.nextInt();
//        System.out.print("Masukkan Serat: ");
//        int serat = input.nextInt();
//        System.out.print("Masukkan Kalsium: ");
//        int kalsium = input.nextInt();
//        System.out.print("Masukkan Fosfor: ");
//        int fosfor = input.nextInt();
//        System.out.print("Masukkan Lisin: ");
//        int lisin = input.nextInt();
//        System.out.print("Masukkan Methionin: ");
//        int methionin = input.nextInt();
//        System.out.print("Masukkan Sistin: ");
//        int sistin = input.nextInt();
//        System.out.print("Masukkan Maksimum Penggunaan: ");
//        int maxPenggunaan = input.nextInt();
//        input.nextLine(); // Clear buffer
//
//        // Membuat objek Bahan Baku
//        bahanbaku bahan = new bahanbaku(kodeBB, namaBB, hargaBB, energi, protein, lemak, serat, kalsium, fosfor, lisin, methionin, sistin, maxPenggunaan);
//
//        // Input data Perhitungan
//        System.out.println("\n=== Input Data Perhitungan ===");
//        System.out.print("Masukkan No Formulasi: ");
//        String noFormulasi = input.nextLine();
//        System.out.print("Masukkan Kode Bahan Baku: ");
//        String kodeBBPerhitungan = input.nextLine();
//        System.out.print("Masukkan Jumlah Penggunaan: ");
//        int jumlahPenggunaan = input.nextInt();
//
//        // Membuat objek Perhitungan
//        perhitungan hitung = new perhitungan(noFormulasi, kodeBBPerhitungan, jumlahPenggunaan, kodeBB, namaBB, hargaBB, energi, protein, lemak, serat, kalsium, fosfor, lisin, methionin, sistin, maxPenggunaan);
//
//        // Menampilkan data Bahan Baku
//        System.out.println("\nData Bahan Baku:");
//        System.out.println("Kode Bahan Baku: " + bahan.getKodeBB());
//        System.out.println("Nama Bahan Baku: " + bahan.NamaBB());
//        System.out.println("Harga Bahan Baku: " + bahan.gethargaBB());
//        System.out.println("Energi: " + bahan.getenergi());
//        System.out.println("Protein: " + bahan.getprotein());
//        System.out.println("Lemak: " + bahan.getlemak());
//        System.out.println("Serat: " + bahan.getserat());
//        System.out.println("Kalsium: " + bahan.getkalsium());
//        System.out.println("Fosfor: " + bahan.getfosfor());
//        System.out.println("Lisin: " + bahan.getlisin());
//        System.out.println("Methionin: " + bahan.getmethionin());
//        System.out.println("Sistin: " + bahan.getsistin());
//        System.out.println("Maksimum Penggunaan: " + bahan.getmaxPenggunaan());
//
//        // Menampilkan data Perhitungan
//        System.out.println("\nData Perhitungan:");
//        System.out.println("No Formulasi: " + hitung.getnoformulasi());
//        System.out.println("Kode Bahan Baku: " + hitung.getkodeBB());
//        System.out.println("Jumlah Penggunaan: " + hitung.getJumlahPenggunaan());
//    
//        
        /*===============================================================================================================*/
        
      // KODING ANALISA & ANALISA PERBAIKAN        
               
      //  koneksi db = new koneksi();
    /*memasukkan Data =>*/ // db.simpanAnalisa("A1", "Penelitian", 125, 522, 128, 19, 713, 623, 232, 331, 33, 321, 613, "B1");
//    /*hapus => */  //db.hapusAnalisa("A1");
//    /*cari karyawan*/ db.cariAnalisa("A2");
//    db.dataAnalisa();
        
        
//        Scanner input = new Scanner(System.in);
//
//        // Input data Analisa
//        System.out.println("=== Input Data Analisa ===");
//        System.out.print("Masukkan No Analisa: ");
//        String noAnalisa = input.nextLine();
//        System.out.print("Masukkan Dasar Analisa: ");
//        String dasarAnalisa = input.nextLine();
//        System.out.print("Masukkan Berat Badan: ");
//        int beratBadan = input.nextInt();
//        System.out.print("Masukkan Pertambahan Berat Badan: ");
//        int pertambahanBB = input.nextInt();
//        System.out.print("Masukkan Analisa Energi: ");
//        int analisaEnergi = input.nextInt();
//        System.out.print("Masukkan Analisa Protein: ");
//        int analisaProtein = input.nextInt();
//        System.out.print("Masukkan Analisa Lemak: ");
//        int analisaLemak = input.nextInt();
//        System.out.print("Masukkan Analisa Serat: ");
//        int analisaSerat = input.nextInt();
//        System.out.print("Masukkan Analisa Kalsium: ");
//        int analisaKalsium = input.nextInt();
//        System.out.print("Masukkan Analisa Fosfor: ");
//        int analisaFosfor = input.nextInt();
//        System.out.print("Masukkan Analisa Lisin: ");
//        int analisaLisin = input.nextInt();
//        System.out.print("Masukkan Analisa Methionin: ");
//        int analisaMethionin = input.nextInt();
//        System.out.print("Masukkan Analisa Sistin: ");
//        int analisaSistin = input.nextInt();
//        input.nextLine(); 
//        System.out.print("Masukkan No Formulasi: ");
//        String noFormulasi = input.nextLine();
//
//        // Membuat objek Analisa
//        Analisa analisa = new Analisa(noAnalisa, dasarAnalisa, beratBadan, pertambahanBB,
//                analisaEnergi, analisaProtein, analisaLemak, analisaSerat,
//                analisaKalsium, analisaFosfor, analisaLisin, analisaMethionin,
//                analisaSistin, noFormulasi);
//
//        // Input data Analisa Perbaikan
//        System.out.println("\n=== Input Data Analisa Perbaikan ===");
//        System.out.print("Masukkan No Analisa Perbaikan: ");
//        String noAnalisaPerbaikan = input.nextLine();
//        System.out.print("Masukkan Analisa ME: ");
//        int analisaME = input.nextInt();
//        System.out.print("Masukkan Analisa PK: ");
//        int analisaPK = input.nextInt();
//
//        input.nextLine(); 
//
//        // Membuat objek AnalisaPerbaikan 
//        AnalisaPerbaikan analisaPerbaikan = new AnalisaPerbaikan(noAnalisaPerbaikan, analisaME, analisaPK,
//                analisa.getNoAnalisa(), analisa.getDasarAnalisa(), analisa.getBeratBadan(), analisa.getPertambahanBB(),
//                analisa.getAnalisaEnergi(), analisa.getAnalisaProtein(), analisa.getAnalisaLemak(), analisa.getAnalisaSerat(),
//                analisa.getAnalisaKalsium(), analisa.getAnalisaFosfor(), analisa.getAnalisaLisin(), analisa.getAnalisaMethionin(),
//                analisa.getAnalisaSistin(), analisa.getNoFormulasi());
//
//        // Menampilkan data Analisa
//        System.out.println("\nData Analisa:");
//        System.out.println("No Analisa: " + analisa.getNoAnalisa());
//        System.out.println("Dasar Analisa: " + analisa.getDasarAnalisa());
//        System.out.println("Berat Badan: " + analisa.getBeratBadan());
//        System.out.println("Pertambahan Berat Badan: " + analisa.getPertambahanBB());
//        System.out.println("Analisa Energi: " + analisa.getAnalisaEnergi());
//        System.out.println("Analisa Protein: " + analisa.getAnalisaProtein());
//        System.out.println("Analisa Lemak: " + analisa.getAnalisaLemak());
//        System.out.println("Analisa Serat: " + analisa.getAnalisaSerat());
//        System.out.println("Analisa Kalsium: " + analisa.getAnalisaKalsium());
//        System.out.println("Analisa Fosfor: " + analisa.getAnalisaFosfor());
//        System.out.println("Analisa Lisin: " + analisa.getAnalisaLisin());
//        System.out.println("Analisa Methionin: " + analisa.getAnalisaMethionin());
//        System.out.println("Analisa Sistin: " + analisa.getAnalisaSistin());
//        System.out.println("No Formulasi: " + analisa.getNoFormulasi());
//
//        // Menampilkan data AnalisaPerbaikan
//        System.out.println("\nData Analisa Perbaikan:");
//        System.out.println("No Analisa Perbaikan: " + analisaPerbaikan.getNoAnalisaPerbaikan());
//        System.out.println("Analisa ME: " + analisaPerbaikan.getAnalisaME());
//        System.out.println("Analisa PK: " + analisaPerbaikan.getAnalisaPK());
//        
        
       //database myobject = new database();
    }
    
}
