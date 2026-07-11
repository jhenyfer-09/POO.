/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.henracainterface;

/**
 *
 * @author Jheny
 */
public abstract class ContaB {
    int numdc ;
    double saldo ;
    
    protected abstract void sacar (double valor);
    protected abstract void depositar (double valor);
    
    public void transferir(double valor, ContaB conta){
        sacar(valor);
        conta.depositar(valor);
    }

    void mostrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
