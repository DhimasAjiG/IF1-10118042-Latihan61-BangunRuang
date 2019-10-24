/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan61.bangunruang;

/**
 *
 * @author Alienware
 */
public class Tabung extends BangunRuang {

    private int r;
    private int h;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * r * r * h;
    }

}
