/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author 05220140
 */
public class ContaInvestimento extends ContaBancaria {
    
    @Override
    double calcularSaldo() {
        return super.saldo + super.saldo * 0.05;
    }
}
