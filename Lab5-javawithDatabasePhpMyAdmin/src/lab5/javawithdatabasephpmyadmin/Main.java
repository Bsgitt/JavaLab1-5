/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.javawithdatabasephpmyadmin;

import com.mysql.jdbc.Connection;


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
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conenct =  DriverManager.getConnection("jdbc:mysql://localhost:/mydatabase" +
                    "?user=root&password=root");
            if(connect != null){
                System.out.println("Database Connected");
            }else{
                System.out.println("Dada Connect Failed..");
            }
                    
        } catch (Exception e) {
            // TODO Auto-generated catch block
			e.printStackTrace();
        }// Close
		try {
			if(connect != null){
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
