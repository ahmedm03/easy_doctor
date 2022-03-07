/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.pkg2._project;

/**
 *
 * @author ITC
 */
public class Software2_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        register r=new register();
        login l = new login();
        l.setLocation(300, 80);
        l.setVisible(true);
        l.setResizable(false);
        l.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}
