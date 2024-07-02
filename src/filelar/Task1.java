    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filelar;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author anara
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            FileOutputStream mm = new FileOutputStream("text.txt");
        String mesaj = "Salam Dunya";
        byte[] bytes = mesaj.getBytes();
        mm.write(bytes);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            FileInputStream nn = new FileInputStream("text.txt");
            int a = 0;
            while ((a=nn.read()) != -1) {
                System.out.print((char)a);  
                
            }
            System.out.println((char)nn.read());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
}
