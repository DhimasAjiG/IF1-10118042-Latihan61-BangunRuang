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
public class Bola extends BangunRuang {

    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return (4 * Math.PI * r * r * r) / 3;
    }

}
