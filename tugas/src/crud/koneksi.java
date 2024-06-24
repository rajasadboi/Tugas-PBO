/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
        

/**
 *
 * @author Asus
 */
public class koneksi {
    
    private String databaseName="2210010036";
    private String username="root";
    private String password="";
    private String lokasi="jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
    
    public koneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB=DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database terkoneksi");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    
    
   // KODING ANALISA & ANALISA PERBAIKAN
    
//    ANALISA PERBAIKAN
    
    public class AnalisaPerbaikan {
    
    private Connection koneksiDB;

    public AnalisaPerbaikan(Connection koneksiDB) {
        this.koneksiDB = koneksiDB;
    }

    // Metode untuk menyimpan analisa perbaikan
    public void simpanAnalisaPerbaikan(String noAnalisaPerbaikan, int analisaME, int analisaPK, String noAnalisa) {
        try {
            String SQL = "INSERT INTO analisaPerbaikan (noAnalisaPerbaikan, analisaME, analisaPK, noAnalisa) VALUES (?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, noAnalisaPerbaikan);
            perintah.setInt(2, analisaME);
            perintah.setInt(3, analisaPK);
            perintah.setString(4, noAnalisa);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Metode untuk menghapus analisa perbaikan
    public void hapusAnalisaPerbaikan(String noAnalisaPerbaikan) {
        try {
            String SQL = "DELETE FROM analisaPerbaikan WHERE noAnalisaPerbaikan = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, noAnalisaPerbaikan);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // Metode untuk mencari analisa perbaikan
    public void cariAnalisaPerbaikan(String noAnalisaPerbaikan) {
        try {
            String SQL = "SELECT * FROM analisaPerbaikan WHERE noAnalisaPerbaikan = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, noAnalisaPerbaikan);
            ResultSet data = perintah.executeQuery();
            while (data.next()) {
                System.out.println("noAnalisaPerbaikan: " + data.getString("noAnalisaPerbaikan"));
                System.out.println("Analisa ME: " + data.getInt("analisaME"));
                System.out.println("Analisa PK: " + data.getInt("analisaPK"));
                System.out.println("No Analisa: " + data.getString("noAnalisa"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // Metode untuk menampilkan semua data analisa perbaikan
    public void dataAnalisaPerbaikan() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM analisaPerbaikan ORDER BY noAnalisaPerbaikan ASC");
            while (baris.next()) {
                System.out.println(baris.getString("noAnalisaPerbaikan") + " | " +
                                   baris.getInt("analisaME") + " | " +
                                   baris.getInt("analisaPK") + " | " +
                                   baris.getString("noAnalisa"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // Metode untuk mengubah data analisa perbaikan
    public void ubahAnalisaPerbaikan(String noAnalisaPerbaikan, int analisaME, int analisaPK, String noAnalisa) {
        try {
            String SQL = "UPDATE analisaPerbaikan SET analisaME = ?, analisaPK = ?, noAnalisa = ? WHERE noAnalisaPerbaikan = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, analisaME);
            perintah.setInt(2, analisaPK);
            perintah.setString(3, noAnalisa);
            perintah.setString(4, noAnalisaPerbaikan);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
    
    
    
//    ANALISA
    public void simpanAnalisa(String noanalisa, String dasarAnalisa, int beratBadan,
            int pertambahanBB, int analisaEnergi, int analisaProtein, int analisaLemak,
            int analisaserat, int analisaKalsium, int analisaFosfor, int analisalisin,
            int analisaMethionin, int analisasistin, String noFormulasi){

            try {
               String SQL ="INSERT INTO analisa (noanalisa,dasarAnalisa,beratBadan,pertambahanBB,analisaEnergi,analisaProtein,analisaLemak,analisaserat,analisaKalsium,analisaFosfor,analisalisin,analisaMethionin,analisasistin,noFormulasi)"
                       + "VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
               
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, noanalisa);
            perintah.setString(2, dasarAnalisa);
            perintah.setInt(3, beratBadan);
            perintah.setInt(4, pertambahanBB);
            perintah.setInt(5, analisaEnergi);
            perintah.setInt(6, analisaProtein);
            perintah.setInt(7, analisaLemak);
            perintah.setInt(8, analisaserat);
            perintah.setInt(9, analisaKalsium);
            perintah.setInt(10, analisaFosfor);
            perintah.setInt(11, analisalisin);
            perintah.setInt(12, analisaMethionin);
            perintah.setInt(13, analisasistin);
            perintah.setString(14, noFormulasi);
            perintah.executeUpdate();
                System.out.println("Data berhasil disimpan");
            
            } catch (Exception e) {
                System.out.println(e. getMessage());
            }

}
    
            public void hapusAnalisa(String noanalisa){
                try {
                    String SQL = "DELETE FROM analisa WHERE noanalisa=?";
                    PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                    perintah.setString(1,noanalisa);
                    perintah.executeUpdate();
                       System.out.println("Data Berhasil Dihapus");
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            
            
            }
            
            public void cariAnalisa(String noanalisa){
                   try {
                    String SQL="SELECT * FROM analisa WHERE noanalisa=?";
                    PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                    perintah.setString(1,noanalisa);
                    ResultSet data = perintah.executeQuery();
                    while(data.next()){
                        System.out.println("noanalisa :"+data.getString("noanalisa"));
                        System.out.println("Dasar Analisa :"+data.getString("dasaranalisa"));
                        System.out.println("Berat Badan :"+data.getInt("beratBadan"));
                        System.out.println("Pertambahan BB :"+data.getInt("pertambahanBB"));
                        System.out.println("Analisa Energi :"+data.getInt("analisaEnergi"));
                        System.out.println("Analisa Protein :"+data.getInt("analisaProtein"));
                        System.out.println("Analisa Lemak :"+data.getInt("analisaLemak"));
                        System.out.println("Analisa Serat :"+data.getInt("analisaserat"));
                        System.out.println("Analisa Kalsium :"+data.getInt("analisaKalsium"));
                        System.out.println("Analisa Fosfor :"+data.getInt("analisaFosfor"));
                        System.out.println("Analisa lisin :"+data.getInt("analisalisin"));
                        System.out.println("Analisa Methionin :"+data.getInt("analisaMethionin"));
                        System.out.println("Analisa Sistin:"+data.getInt("analisasistin"));
                        System.out.println("No Formulasi :"+data.getString("noFormulasi"));
                    }
                    
                    
                } catch (Exception e) {
                        System.err.println(e.getMessage());
                }
                    }
            
            public void dataAnalisa(){
                try {
                    Statement stmt = koneksiDB.createStatement();
                    ResultSet baris = stmt.executeQuery("SELECT * FROM analisa ORDER BY noanalisa ASC");
                    while(baris.next()){
                        System.out.println(baris.getString("noanalisa")+" | "+
                                baris.getString("dasaranalisa")+" | "+
                                baris.getInt("beratBadan")+" | "+
                                baris.getInt("pertambahanBB")+" | "+
                                baris.getInt("analisaEnergi")+" | "+
                                baris.getInt("analisaProtein")+" | "+
                                baris.getInt("analisaLemak")+" | "+
                                baris.getInt("analisaserat")+" | "+
                                baris.getInt("analisaKalsium")+" | "+
                                baris.getInt("analisaFosfor")+" | "+
                                baris.getInt("analisalisin")+" | "+
                                baris.getInt("analisaMethionin")+" | "+
                                baris.getInt("analisasistin")+" | "+
                                baris.getString("noFormulasi"));
                    }
                    
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            
            }
            
            public void ubahAnalisa(String noanalisa, String dasarAnalisa, int beratBadan,
                        int pertambahanBB, int analisaEnergi, int analisaProtein, 
                        int analisaLemak, int analisaserat, int analisaKalsium, 
                        int analisaFosfor, int analisalisin, int analisaMethionin, 
                        int analisasistin, String noFormulasi) {

                        try {
                            String SQL = "UPDATE analisa SET dasarAnalisa=?, beratBadan=?, pertambahanBB=?, analisaEnergi=?, "
                                       + "analisaProtein=?, analisaLemak=?, analisaserat=?, analisaKalsium=?, "
                                       + "analisaFosfor=?, analisalisin=?, analisaMethionin=?, analisasistin=?, "
                                       + "noFormulasi=? WHERE noanalisa=?";

                            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                            perintah.setString(1, dasarAnalisa);
                            perintah.setInt(2, beratBadan);
                            perintah.setInt(3, pertambahanBB);
                            perintah.setInt(4, analisaEnergi);
                            perintah.setInt(5, analisaProtein);
                            perintah.setInt(6, analisaLemak);
                            perintah.setInt(7, analisaserat);
                            perintah.setInt(8, analisaKalsium);
                            perintah.setInt(9, analisaFosfor);
                            perintah.setInt(10, analisalisin);
                            perintah.setInt(11, analisaMethionin);
                            perintah.setInt(12, analisasistin);
                            perintah.setString(13, noFormulasi);
                            perintah.setString(14, noanalisa);

                            perintah.executeUpdate();
                            System.out.println("Data berhasil diubah");

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

}
