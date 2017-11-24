class ContaPoupanca extends Conta{
    private float limite = 800;
    private float renda = 1/200;
    private float taxa = 5;

    public boolean saquePoupanca(float valor){
        if(valor <= super.saldo && valor <= 800){
            super.saldo -= valor;
            return true;
        }
        else if(valor <= super.saldo){
            super.saldo -= (valor + taxa);
            return true;
        }
        return false;
    }

    public void atualiza(){
        super.saldo *= renda;
    }
}
