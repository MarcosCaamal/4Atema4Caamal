/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author m
 */
public class ctrlSimpson {
    private csEntrada entrada; 

    public ctrlSimpson(csEntrada entrada) {
        this.entrada = entrada;
    }
    
    private double fx(double x){
        return Math.pow(x,3)-(2*Math.pow(x,2))+x+2;

    }
    
    //Calcula el valor de X de acuerdo a la 
    //formula: F(a+(h*i))
    private double x(int i){
        return (this.entrada.getA()+(this.entrada.getH()*i));
    }
    public double Simpson(){
        double integral =0;
        double sumaPares=0;
        double sumaImpares=0;
        double fa=this.fx(this.entrada.getA());
        double fb=this.fx(this.entrada.getB());
        
        for(int i=1; i<this.entrada.getN(); i++){
            if(i%2==0){
                sumaPares+=this.fx(this.x(i));
            }
            else{
                sumaImpares+=this.fx(this.x(i));
            }
        }
 
        integral=(this.entrada.getH()/3)*(fa+(4*sumaImpares)+(2*sumaPares)+fb);
        return integral;
    }
}
