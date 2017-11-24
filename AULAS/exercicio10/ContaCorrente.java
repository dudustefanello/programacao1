class ContaCorrente extends Conta{
    public boolean saqueCorrente(float valor, float taxa){
        if((taxa + valor) <= super.saldo){
            super.saldo -= (taxa + valor);
            return true;
        }
        return false;
    }
}
