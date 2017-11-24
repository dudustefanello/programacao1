class Programa{
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.dono = "Eduardo Stefanello";
        minhaConta.saldo = 10000;
        minhaConta.saca(1000);
        minhaConta.deposita(500);
        System.out.println(minhaConta.dono);
        System.out.println(minhaConta.saldo);
    }
}
