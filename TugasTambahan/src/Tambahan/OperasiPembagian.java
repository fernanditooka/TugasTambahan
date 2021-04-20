/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tambahan;

/**
 *
 * @author USER
 */
public class OperasiPembagian extends OperasiBilanganAbs{
    protected double a,b,c;
    protected void set_A(double a){
        this.a = a;
    }
    protected void set_B(double b){
        this.b = b;
    }
    protected void set_C(){
        this.c = this.a/this.b;
    }
    
    protected double get_A(){
        return this.a;
    }
    protected double get_B(){
        return this.b;
    }
    protected double get_C(){
        return this.c;
    }
    
    protected void tampil(){
        set_C();
        System.out.println("Hasil Pembagian dari :");
        System.out.println("A : "+ get_A());
        System.out.println("B : "+ get_B());
        System.out.println("A / B = "+get_A()+" / " + get_B() +" = "+get_C());
    }
}
