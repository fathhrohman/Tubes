/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Rohman
 */
public class Database {

    private String server = "jdbc:mysql://localhost:3306/tubes";
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement statement = null;
    private Connection connection = null;

    public void connect() {
        try {
            connection = DriverManager.getConnection(server, dbuser, dbpasswd);
            statement = connection.createStatement();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat koneksi");
        }
    }

    public void saveAdmin(Admin a) {
        try {
            String query = "insert into Admin(NameAdmin,Id) values"
                    + "('" + a.getName() + "', "
                    + "'" + a.getId() + "')";
            statement.execute(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Admin");
        }
    }

    public void savePelanggan(Pelanggan p) {
        try {
            String query = "insert into Pelanggan(NamePelanggan,IdPelanggan) values"
                    + "('" + p.getName() + "', "
                    + "'" + p.getId() + "')";
            statement.execute(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Pelanggan");
        }
    }

    public void saveBioskop(Bioskop b) {
        try {
            String query = "insert into Bioskop(NameBioskop) values"
                    + "('" + b.getName() + "')";
            statement.execute(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Bioskop");
        }

    }

    public void saveTheater(Theater t, Bioskop b) {
        try {
            String query = "insert into Theater(NoTheater,FilmTayang,NameBioskop) values"
                    + "('" + t.getNotheater() + "', "
                    + "'" + t.getFilmtayang() + "', '"
                    + b.getName() + "')";
            statement.execute(query);

        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Theater");
        }
    }

    public void saveKursi(Kursi k, Theater t) {
        try {
            String query = "insert into Kursi(KodeKursi,NoTheater) values"
                    + "('" + k.getKodekursi() + "', "
                    + "'" + t.getNotheater() + "')";
            statement.execute(query);

        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Kursi");
        }
    }

    public void saveTransaksi(String kodetransaksi, double harga, String idpelanggan, String namabioskop, String jam, String notheater, String kodekursi) {
        try {

            String query = "insert into transaksi values"
                    + "('" + kodetransaksi + "', "
                    + "" + harga + ", "
                    + "'" + idpelanggan + "', "
                    + "'" + namabioskop + "', "
                    + "'" + jam + "', "
                    + "'" + notheater + "', "
                    + "'" + kodekursi + "')";
            statement.execute(query);

        } catch (Exception e) {
            throw new IllegalArgumentException("Terjadi kesalahan saat save Transaksi");
        }
    }

    public void updateTransaksi(String kodetransaksi, String kodekursi) {
        try {
            String query;
            query = "UPDATE transaksi SET KodeKursi='" + kodekursi
                    + "' WHERE Kodetransaksi ='" + kodetransaksi + "'";
            statement.executeUpdate(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("Terjadi kesalahan saat update Transaksi");
        }
    }

    public void updateFilm(String filmtayang, String notheater) {
        try {
            String query;
            query = "update theater set FilmTayang='" + filmtayang
                    + "' where NoTheater='" + notheater + "'";
            statement.executeUpdate(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat update film");
        }
    }

    public void updateNoTheater(String notheaterbaru, String notheaterlama) {
        try {
            String query;
            query = "update theater set notheater='" + notheaterbaru + "' where notheater='" + notheaterlama + "'";
            statement.executeUpdate(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat update notheater");
        }
    }

    public ArrayList<Bioskop> loadBioskop() {
        try {
            ArrayList<Bioskop> daftarBioskop = new ArrayList<>();
            String query = "select * from Bioskop";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Bioskop b = new Bioskop(rs.getString("NameBioskop"));
                daftarBioskop.add(b);
            }
            return daftarBioskop;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load bioskop");
        }
    }

    public ArrayList<Theater> loadTheater() {
        try {
            ArrayList<Theater> daftarTheater = new ArrayList<>();
            String query = "select * from Theater";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Theater t = new Theater(rs.getString(1), rs.getString(2));
                Statement statement2 = connection.createStatement();
                String query2 = "select * from Kursi where NoTheater=" + t.getNotheater();
                ResultSet rs2 = statement2.executeQuery(query2);
                while (rs2.next()) {
                    t.createKursi(rs2.getString(1));
                }
                daftarTheater.add(t);
            }
            return daftarTheater;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load theater");
        }
    }

    public ArrayList<Kursi> loadKursi() {
        try {
            ArrayList<Kursi> daftarKursi = new ArrayList<>();
            String query = "select * from Kursi";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Kursi k = new Kursi(rs.getString(1));
                daftarKursi.add(k);
            }
            return daftarKursi;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi keasalahn saat load Kursi");
        }
    }

    public ArrayList<Pelanggan> loadPelanggan() {
        try {
            ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
            String query = "select * from Pelanggan";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Pelanggan p = new Pelanggan(rs.getString(1), rs.getString(2));
                daftarPelanggan.add(p);
            }
            return daftarPelanggan;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load pelanggan");
        }
    }

    public ArrayList<Admin> loadAdmin() {
        try {
            ArrayList<Admin> daftarAdmin = new ArrayList<>();
            String query = "Select * from admin";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Admin a = new Admin(rs.getString(1), rs.getString(2));
                daftarAdmin.add(a);
            }
            return daftarAdmin;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan load bioskop");
        }
    }

    public ArrayList<Transaksi> loadTransaksi() {
        try {
            ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
            String query = "select * from transaksi";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                Transaksi t = new Transaksi(rs.getString(1), rs.getDouble(2), rs.getString(5));
                daftarTransaksi.add(t);
            }
            return daftarTransaksi;
        } catch (Exception e) {
            throw new IllegalArgumentException("Terjadi keasalahan saat load Transaksi");
        }
    }

    public String verifyKodeKursi(String notheater,String kodekursi) {
        try {
            String query = "select * from transaksi where notheater='" + notheater + "'";
            ResultSet rs = statement.executeQuery(query);
            
            while (rs.next()) {
                if (rs.getString(7).equals(kodekursi)) {
                    return "tidak valid";
                }
            }
            return "valid";
        } catch (Exception e ){
            throw new IllegalArgumentException("terjadi kesalahan saat verifikasi kodekursi");
        }
    }

}
