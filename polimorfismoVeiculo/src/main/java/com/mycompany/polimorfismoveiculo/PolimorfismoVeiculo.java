/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismoveiculo;

/**
 *
 * @author Jheny
 */
public class PolimorfismoVeiculo {

    public static void main(String[] args) {
         Veiculo[] oficina = new Veiculo[3];
        
        oficina[0] = new Carro("Toyota Corolla");
        oficina[1] = new Moto("Honda CB 500");
        oficina[2] = new Carro("Jeep Compass");
        
        System.out.println("--- Iniciando Manutenção ---");
        
        for (Veiculo v : oficina) {
            v.realizarManutencao();

        System.out.println("Hello World!");
    }
}
