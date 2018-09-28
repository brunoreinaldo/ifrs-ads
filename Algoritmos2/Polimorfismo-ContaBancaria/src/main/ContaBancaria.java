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
public abstract class ContaBancaria {
    protected double saldo;
    
    void depositar(double valor){
        System.out.println("TEste");
    }
    
    void sacar (double valor){
        
    }
    
    void transferir (double valor, ContaBancaria cb){
        
    }
    
    double calcularSaldo(){
        return 0;
    }
}
