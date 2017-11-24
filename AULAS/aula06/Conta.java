class Conta{
    String dono;
    float saldo;
    int numero;

    void saca(float valor){
        this.saldo -= valor;
    }
    void deposita(float valor){
        this.saldo += valor;
    }
}
