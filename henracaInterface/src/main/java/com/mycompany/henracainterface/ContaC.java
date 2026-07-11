/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.henracainterface;

/**
 *
 * @author Jheny
 */
public class ContaC extends ContaB implements Imprimivel {
    double taxaDeOpe;

    @Override
    protected void sacar(double valor) {
        if (valor<=saldo){
        valor = valor + taxaDeOpe;
        saldo = saldo - valor;
        }else{
            System.out.println("Salso insuficiente");
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void depositar(double valor) {
        valor = valor + taxaDeOpe;
        saldo = saldo - valor;
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarDados() {
        System.out.println("Saldo da conta :" + saldo);
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimivel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
