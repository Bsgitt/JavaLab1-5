/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author NB-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator cal = new Calculator();
        cal.Multiply();
        cal.Add(2, 2);
        System.out.println("Result : "+cal.oddEven());
        System.out.println("Grade :"+cal.Grade(50, 30,  90, 80));
//        System.out.println(cal.Add(20,10));
//        cal.Multiply(1,12);
//        System.out.println("score"+cal.Grade);
    }
    
}
