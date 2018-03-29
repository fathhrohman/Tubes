/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author BramTheBoom
 */
public class Theater {

    private String notheater;
    private String filmtayang;
    private Kursi[] daftarkursi;
    private int jumlahkursi;

    public Theater(String notheater, String filmtayang) {
        this.notheater = notheater;
        this.filmtayang = filmtayang;
        daftarkursi = new Kursi[128];
    }

    public void setNotheater(String notheater) {
        this.notheater = notheater;
    }

    public String getNotheater() {
        return notheater;
    }

    public String getFilmtayang() {
        return filmtayang;
    }

    public void setFilmtayang(String filmtayang) {
        this.filmtayang = filmtayang;
    }

    public void createKursi(String kodekursi) {
        if (daftarkursi.length > jumlahkursi) {
            Kursi y = new Kursi(kodekursi);
            daftarkursi[jumlahkursi] = y;
            jumlahkursi++;
        } else {
            System.out.println("Full");
        }

    }

    public Kursi getDaftarkursi(int indeks) {
        return daftarkursi[indeks];
    }

}
