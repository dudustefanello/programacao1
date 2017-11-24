import java.util.Scanner;

class Programa{
    public static void main(String[] args) {
        int opcao;
        double valor;
        Scanner entrada = new Scanner (System.in);

        Conta minhaConta = new Conta();
        minhaConta.dono = "Eduardo Stefanello";
        minhaConta.numero = 11765;
        minhaConta.saldo = 38490;

        do{
            System.out.println(">-----> Banco DinDin <-----<");
            System.out.println("- OPÇÕES:                  -");
            System.out.println("- 1 ....... Consulta Saldo -");
            System.out.println("- 2 ........ Efetuar Saque -");
            System.out.println("- 3 ..... Efetuar Depósito -");
            System.out.println("- 4 ................. SAIR -");
            System.out.println(">--------------------------<" + "\n");

            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    minhaConta.consulta();
                    break;
                case 2:
                    minhaConta.saca();
                    break;
                case 3:
                    minhaConta.deposita();
                    break;
            }
        }while(opcao != 4);
    }
}
