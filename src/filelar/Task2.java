/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filelar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author anara
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nece soz daxil edeceksen ");
        int countword = sc.nextInt();
        sc.nextLine();
        String[] soz = new String[countword];

        for (int i = 0; i < countword; i++) {
            System.out.println((i + 1) + "Sozu daxil edin ");
            soz[i] = sc.nextLine();
        }
        try {
            FileWriter writer = new FileWriter("index.txt");
//            BufferedWriter bfwriter = new BufferedWriter(writer);
            for(String sozler : soz){
            writer.write(sozler);
            }
//            for (String sozler : soz) {
//                bfwriter.write(soz);
//                bfwriter.close();
//                }
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileReader writer = new FileReader("index.txt");
            BufferedReader bfWriter = new BufferedReader(writer);
            System.out.println(bfWriter.readLine());
//            int a = 0;
//            while ((a=read.read()) != -1) {
//                System.out.print((char)a);  
//                
//            }
//            System.out.println((char)read.read());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
