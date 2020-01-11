/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.obj;

/**
 *
 * @author NB-PC
 */
class Box1 {
    public double w,h,d; //modifier
    public double volume(){
        return w*h*d;
    }
     public double traingle(){
         return(0.5)*w*h;
     }
}  
