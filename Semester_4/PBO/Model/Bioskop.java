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
public class Bioskop {

    private Theater[] daftartheater;
    private String name;
    private int jumlahtheater;

    public Bioskop(String name) {
        this.name = name;
        daftartheater = new Theater[4];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Theater getDaftartheater(int index) {
        return daftartheater[index];
    }

    public void createTeater(String notheater,String filmtayang) {
        if (daftartheater.length > jumlahtheater) {
            Theater t = new Theater(notheater,filmtayang);
            daftartheater[jumlahtheater] = t;
            jumlahtheater++;
        } else {
            System.out.println("theater sudah penuh");
        }
    }
    
}
