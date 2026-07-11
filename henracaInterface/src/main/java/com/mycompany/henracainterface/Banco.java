/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.henracainterface;

import java.util.ArrayList;

/**
 *
 * @author Jheny
 */
public class Banco implements Imprimivel {
    ArrayList<ContaB>contas = new ArrayList<>();
    
     public void inserir (ContaB conta){
        contas.add(conta);
    }
     public void remover (ContaB conta){
        contas.remove(conta);
    }
     public void procurar (int num,ContaB conta){
        contas.get(num);
    }

    @Override
    public void mostrarDados() {
        for (ContaB conta : contas){
            conta.mostrarDados();
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimivel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
