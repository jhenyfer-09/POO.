/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.henracainterface;

import java.util.Scanner;

/**
 *
 * @author Jheny
 */
public class Executavel {
   public static void main (String[]args){
       Scanner sc = new Scanner (System.in);
       System.out.println("Qual é sei saldo");
       double saldo = sc.nextDouble();
      
       System.out.println("Qual é sua conta ( poponça ou carrente )");
       String nextLine = sc.nextLine();
   } 
}
