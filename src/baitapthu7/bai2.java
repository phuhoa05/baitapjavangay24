/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthu7;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter data:");
        boolean check1= scanner.hasNextInt();
        boolean check2= scanner.hasNextDouble();
        System.out.println("Co token khong?"+ check1);
        
    }
    
}
