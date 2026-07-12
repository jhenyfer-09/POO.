/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoveiculo;

/**
 *
 * @author Jheny
 */

public class Moto extends Veiculo {
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("🛠️ [Moto] Verificando corrente, óleo e pneus da " + getModelo());
    }
}  

