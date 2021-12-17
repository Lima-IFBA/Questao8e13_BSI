/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.model;

/**
 *
 * @author pc
 */
public class Conta {
    // último número de conta usado, quando da instanciação de nova conta

    private static int ultimoNumero = 0;

    private int numero; // número da conta
    private String titular; // nome do(a) titular da conta
    private double saldo; // saldo atual da conta

    public Conta(String titular) {
        this.numero = ultimoNumero + 1; // definição de número da conta
        this.titular = titular;
        this.saldo = 0; // saldo inicial da conta
        ultimoNumero++; // atualizaçaõ de último número de conta
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    /* operação de saque, com atualização de saldo atual e
 * retorno de valor booleano true em caso de êxito (false, caso contrário) */
    public boolean sacar(double saque) {
        if (saldo >= saque) { // verificação de saldo suficiente
            saldo -= saque; // atualização de saldo
            return true;
        } else {
            return false; // retorno em caso de falha na realização do saque
        }
    }

    // operação de depósito, com atualização de saldo atual
    public void depositar(double deposito) {
        saldo += deposito; // atualização de saldo
    }
    // descrição de dados do objeto instanciado

    public String toString() {
        return "Conta [Número: " + numero + ", Titular: " + titular
                + ", Saldo Atual: " + saldo + "]";
    }

}
