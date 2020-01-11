/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerarea;

import java.util.Scanner;

/**
 *
 * @author NB-PC
 */
public class ScannerArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int base,height;
        double area;
        System.out.println("Base: ");
        base = sc.nextInt();
        System.out.println("Height: ");
        height = sc.nextInt();
        // Logic
        area =0.5*base*height;
        System.out.println("Result:" + area);
    }
    
}
