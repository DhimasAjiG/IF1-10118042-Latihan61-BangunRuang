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
public class Kerucut extends BangunRuang {

    private int r;
    private int t;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    @Override
    public double hitungVolume() {
        return (Math.PI * r * r * t) / 3;
    }

}
