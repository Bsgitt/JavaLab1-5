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
class Box2 {
    public int x,z;
    public void multiply(){
        //method
        for(int i= 1; i<=12;i++){
            z=x*i;
            System.out.println(x+"*"+i+"="+z);
        }
    }
}
