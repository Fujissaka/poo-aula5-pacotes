class ContaCorrente {
    String numeroDaConta;
    String titular;
    float saldo;

    ContaCorrente(String numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        saldo = 0.0f;
    }

    float sacar(float amount) {
        if (amount <= this.saldo) {
            this.saldo -= amount;
        }        

        return this.saldo;
    }

    float depositar(float amount) {
        this.saldo += amount;

        return this.saldo;
    }
    
}
