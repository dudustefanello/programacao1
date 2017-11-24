class Conta{
    protected float saldo;

    public void novaConta(float saldo){
        this.saldo = saldo;
    }

    public void deposito(float valor){
        this.saldo += valor;
    }

    public float consultaSaldo(){
        return this.saldo;
    }
}
