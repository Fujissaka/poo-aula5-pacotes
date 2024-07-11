/**
 * Definição de um pacote
 */
package br.org.xyz.banco;

public class ContaCorrente {
    String numeroDaConta;
    String titular;
    float saldo;

    public ContaCorrente(final String numeroDaConta, final String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        saldo = 0.0f;
    }

    final float sacar(final float amount) {
        if (amount <= this.saldo) {
            this.saldo -= amount;
        }

        return this.saldo;
    }

    final float depositar(final float amount) {
        this.saldo += amount;

        return this.saldo;
    }
    
}
