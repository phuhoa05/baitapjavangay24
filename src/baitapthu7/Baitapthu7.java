/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitapthu7;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Baitapthu7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap ho va ten :");
        String name=scanner.nextLine();
        System.out.println("nhap nam sinh:");
        int year=scanner.nextInt();
        System.out.println("nhap tuoi :");
        int age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap gioi tinh: ");
        String gender=scanner.nextLine();
        System.out.println("nhap GPA: ");
        int GPA=scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap que quan:");
        String local=scanner.nextLine();
        System.out.println("name:"+ name);
        System.out.println("year:"+ year);
        System.out.println("age:"+ age);
        System.out.println("gender:"+ gender);
        System.out.println("GPA:"+ GPA);
        System.out.println("local:"+local);
    }
    
}

