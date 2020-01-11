/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.util.Scanner;

/**
 *
 * @author NB-PC
 */
public class Post {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scprice = new Scanner(System.in);
        double Price ,netprice,total, vat = 0.07,discount = 0.01;
        System.out.println("Price:");
        Price = scprice.nextDouble();
        netprice = Price+vat;
        //discout
       total = discount+netprice;
       System.out.println("Total is :"+total);
        
        
        
        
    }
    
}
