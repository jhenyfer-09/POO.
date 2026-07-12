/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoveiculo;

/**
 *
 * @author Jheny
 */
public class Veiculo {
    protected String modelo;
    
    public Veiculo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract void realizarManutencao();
    
    public String getModelo() {
        return modelo;
    }
}

// Classe Filha 1


// Classe Filha 2


// Classe Principal
public class Main {
    public static void main(String[] args) {
        // Polimorfismo: Vetor do tipo pai armazenando filhos
        Veiculo[] oficina = new Veiculo[3];
        
        oficina[0] = new Carro("Toyota Corolla");
        oficina[1] = new Moto("Honda CB 500");
        oficina[2] = new Carro("Jeep Compass");
        
        System.out.println("--- Iniciando Manutenção ---");
        
        // O mesmo método se comporta diferente para cada objeto
        for (Veiculo v : oficina) {
            v.realizarManutencao();
        }
    }
}
}
