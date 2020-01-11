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
public class Main {
    public static void main(String[] args){
         System.out.print("Wellcom to programming");
       Box1 box = new Box1();
       Box2 mul = new Box2();
       box.h= 10.00;
       box.w = 5.00;
       box.d =3.00;
       System.out.println("Triangle Area "+ box.traingle());
       mul.x=7;
       mul.multiply();
    }
}
