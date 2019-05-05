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
public class ctrlIntegraciones {
    private csEntrada entrada;

    public ctrlIntegraciones(csEntrada entrada) {
        this.entrada = entrada;
    }

   private double fx(double x){
       return Math.sqrt(1+Math.pow(x,2));
       
   }
   public double Trapecio(){
       double integral =0;
       double suma=0;
       double fa=this.fx(this.entrada.getA());
       double fb=this.fx(this.entrada.getB());
       
       integral=fa+fb;
       
       for(int i=1; i<=this.entrada.getN()-1; i++){
           suma+= this.fx( this.entrada.getH() * i + this.entrada.getA() );
       }
       
       integral= (integral+2*suma)*(this.entrada.getH()/2);
       
       return integral;
   }
}
