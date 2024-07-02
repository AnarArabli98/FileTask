/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filelar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author anara
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Melumati daxil edin ");

        int linecount = 0;
         String metn = sc.nextLine();
        try {
           
            FileWriter fw = new FileWriter("index.txt");
            fw.write(metn);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {

            FileReader fos = new FileReader("index.txt");
            BufferedReader BFR = new BufferedReader(fos);
            
            while (BFR.readLine() != null) {
                System.out.println(metn);
                linecount++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(linecount);
    }
}
