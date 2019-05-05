/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author marco
 */
public class csEntrada {
    
    private double a;
    private double b;
    private int n;
    private double h;

    public csEntrada() {
    }
    
    

    public csEntrada(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }
    
    

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public int getN() {
        return n;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    
}
